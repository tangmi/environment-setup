import org.lwjgl.util.*;


public abstract class Entity {
	public FloatPoint pos;
	public FloatPoint vel;
	public Rectangle bbox;


	public Entity() {
		pos = new FloatPoint();
		vel = new FloatPoint();
		min = new FloatPoint();
		max = new FloatPoint();		
		setBoundingBox(new Point(), new Dimension());
	}
	public Entity(FloatPoint position) {
		this();
		pos = position;
	}

	public void moveTo(FloatPoint position) {
		this.pos = position;
	}
	public void moveToRelative(FloatPoint change) {
		this.pos.x += change.x;
		this.pos.y += change.y;
	}
	//velocity setter
	//acceleration setter

	public final void updatePosition(float delta) {
		pos.x += vel.x * delta;
		pos.y += vel.y * delta;
	}

	public final void setBoundingBox(Point offset, Dimension dimension) {
		this.bbox = new Rectangle(offset, dimension);
		calculateBoundingBoxCoordinates();
	}

	public FloatPoint min, max; //min = top left corner; max = bottom right corner
	protected void calculateBoundingBoxCoordinates() {
		this.min.x = this.pos.x + this.bbox.getX();
		this.min.y = this.pos.y + this.bbox.getY();
		this.max.x = this.pos.x + this.bbox.getX() + this.bbox.getWidth();
		this.max.y = this.pos.y + this.bbox.getY() + this.bbox.getHeight();
	}

	public Entity isCollidingWithEntity() {
		for(Entity other : GameStudyMain.instance.entities) {
			calculateBoundingBoxCoordinates();
			other.calculateBoundingBoxCoordinates();
			if (!(this.max.x < other.min.x || 
					this.max.y < other.min.y || 
					this.min.x > other.max.x || 
					this.min.y > other.max.y)) {
				return other;
			}
		}
		return null;
	}

	public FloatPoint getMinimumTranslation(Entity other) {
		//from http://www.opentk.com/node/869
		FloatPoint amin = this.min;
		FloatPoint amax = this.max;
		FloatPoint bmin = other.min;
		FloatPoint bmax = other.max;

		FloatPoint mtd = new FloatPoint();

		float left = (bmin.x - amax.x);
		float right = (bmax.x - amin.x);
		float top = (bmin.y - amax.y);
		float bottom = (bmax.y - amin.y);

		// box dont intersect   
		if ((left > 0 || right < 0) || (top > 0 || bottom < 0)) {
			mtd.x = 0;
			mtd.y = 0;
		} else {

			// box intersect. work out the mtd on both x and y axes.
			if (Math.abs(left) < right) {
				mtd.x = left;
			} else {
				mtd.x = right;
			}

			if (Math.abs(top) < bottom) {
				mtd.y = top;
			} else{ 
				mtd.y = bottom;
			}

			// 0 the axis with the largest mtd value.
			if (Math.abs(mtd.x) < Math.abs(mtd.y)) {
				mtd.y = 0;
			} else {
				mtd.x = 0;
			}

		}

		return mtd;
	}

	abstract void init();
	abstract void update(float delta);
	abstract void render();

}
class FloatPoint {
	public float x, y;
	public FloatPoint(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public FloatPoint() {
		this(0F, 0F);
	}
}