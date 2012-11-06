
import java.util.*;

import org.newdawn.slick.*;

public class GameStudyMain extends BasicGame {

	public static GameStudyMain instance;
	
	public List<Entity> entities;
	
	KeyboardHandler keyboardHandler;
	
	public GameStudyMain() {
		super("GameStudy");
		instance = this;
		entities = new ArrayList<Entity>();
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException {

		
		EntityPlayer player = new EntityPlayer();
		entities.add(player);
		keyboardHandler = new KeyboardHandler(player);
		for(Entity e : entities) {
			e.init();
		}
		
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
		keyboardHandler.update(container);
		for(Entity e : entities) {
			e.update(delta);
		}
	}
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		
		for(Entity e : entities) {
			e.render();
			
			if(e.getClass().equals(EntityPlayer.class)) {
				g.drawString("position (" + Math.round(e.pos.x) + ", " + Math.round(e.pos.y) + ")", 0, 0);
			}
		}
		
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new GameStudyMain());
		app.setDisplayMode(800, 600, false);
		app.start();
	}
}
