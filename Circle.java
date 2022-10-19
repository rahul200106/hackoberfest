// java program to draw circle
import java.awt.*;
import javax.swing.*;

public class ellipse extends JApplet {

	public void init()
	{
		// size
		setSize(400, 400);

		repaint();
	}

	// paint
	public void paint(Graphics g)
	{
		// set Color 
		g.setColor(Color.red);

		// draw a ellipse
		g.drawOval(100, 100, 150, 100);
	}
}
