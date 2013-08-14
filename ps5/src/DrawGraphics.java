import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	ArrayList<BouncingBox> boxes;
	int numOfBox;

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		// box = new BouncingBox(200, 50, Color.RED);
		numOfBox = 3;
		boxes = new ArrayList<BouncingBox>();
		for (int i = 0; i < numOfBox; i++) {
			boxes.add(new BouncingBox(200, 50, Color.RED));
		}

		boxes.get(0).setMovementVector(-1, -1);
		boxes.get(1).setMovementVector(1, 0);
		boxes.get(2).setMovementVector(0, 1);

	}

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		for (BouncingBox box : boxes)
			box.draw(surface);
	}
}