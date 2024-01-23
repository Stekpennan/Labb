import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Sprite{
	private int thickness;
	public Ball (int x, int y, int thickness) {
		super(x, y, 25, 25);
		this.thickness = thickness;
	}
	

	public void update(Keyboard keyboard) {
		int speed = 4;
		
		if (keyboard.isKeyDown(Key.Left)) {
			setX(getX() - speed);
		}
		else if(keyboard.isKeyDown(Key.Right)) {
			setX(getX() + speed);
		}
		
		if (keyboard.isKeyDown(Key.Up)) {
			setY(getY() - speed);
		}
		else if (keyboard.isKeyDown(Key.Down)) {
			setY(getY() + speed);
		}
	}
		
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.blue);
		graphics.setStroke(new BasicStroke(thickness));
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());
	}
}
