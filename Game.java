import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {

	private Ball ball;
	//private RedBox redbox;
	private BlueBox bluebox;
	private GreenBox greenbox;
	private SquareCollection squarecollection;
	
	public Game(GameBoard board) {
		
		squarecollection = new SquareCollection(50, 50, 30, 30);
		ball = new Ball(300, 300 , 5);
	}

	public void update(Keyboard keyboard) {
		squarecollection.update(keyboard);
		ball.update(keyboard);
	}

	public void draw(Graphics2D graphics) {
		squarecollection.draw(graphics);
		ball.draw(graphics);
		}
}

