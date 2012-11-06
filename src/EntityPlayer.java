import org.lwjgl.util.*;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class EntityPlayer extends EntityControllable {

	Image img;
	
	@Override
	void init() {
		
		setBoundingBox(new Point(-8, -8), new Dimension(16, 16));
		pos = new FloatPoint(200, 200);
		
		try {
			img = new Image("assets/block.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override
	void update(float delta) {
		// TODO Auto-generated method stub

		
		updatePosition(delta);
		
//		Entity collision = isCollidingWithEntity();
//		if(collision != null) {
//			moveToRelative(getMinimumTranslation(collision));
//		}
		
	}

	@Override
	void render() {
		img.draw(pos.x + bbox.getX(), pos.y + bbox.getY());
	}

	@Override
	void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void moveRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

}
