import org.newdawn.slick.*;


public class KeyboardHandler {

	EntityControllable puppet;

	public KeyboardHandler(EntityControllable puppet) {
		this.puppet = puppet;
	}

	public void update(GameContainer container) {
		Input input = container.getInput();

		float speed = 0.4F;
		
		if(input.isKeyDown(Input.KEY_A)) {
			puppet.vel.x = -speed;
		} else if(input.isKeyDown(Input.KEY_D)) {
			puppet.vel.x = speed;
		} else {
			puppet.vel.x = 0;
		}
		
		if(input.isKeyDown(Input.KEY_S)) {
			puppet.vel.y = speed;
		} else if(input.isKeyDown(Input.KEY_W)) {
			puppet.vel.y = -speed;
		} else {
			puppet.vel.y = 0;
		}

	}

}
