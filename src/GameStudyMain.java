
import org.newdawn.slick.*;

public class GameStudyMain extends BasicGame {

	public GameStudyMain() {
		super("GameStudy");
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException {
		
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
	}
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new GameStudyMain());
		app.setDisplayMode(800, 600, false);
		app.start();
	}

}
