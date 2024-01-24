import java.awt.Graphics2D;
import java.util.ArrayList;

public class SquareCollection{
	private ArrayList<RedBox> redboxes;
	private int size = 10;

	public SquareCollection(int x, int y, int width, int height) {
		redboxes = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int x1 = 50 + i * 75;
			int y1 = 0;
			redboxes.add(new RedBox(x1, y1, 40, 30));
		}
	}
	public void update(Keyboard keyboard) {
		for (RedBox redBox : redboxes) {
			redBox.update(keyboard);
		}
	}
	public void draw(Graphics2D graphics) {
		for (RedBox redBox : redboxes) {
			redBox.draw(graphics);
		}
	}
}
