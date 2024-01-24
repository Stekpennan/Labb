import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class RedBox extends ColoredBox{
	public RedBox(int x, int y, int width, int height) {
		
		super(x, y, width, height, Color.red);
	}
	public void update(Keyboard keyboard) {
		if(getY() == 570) {
			System.exit(0);
		} else {
			setY(getY() + 1);			
		}
	}
}
