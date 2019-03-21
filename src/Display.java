
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	/* this class is gonna hold the JFrame element;
	 * it creates a window where you will have to drop the Panel
	 * this is a "Mega Structure"s
	 */
	
	
	JFrame frame;
	Canvas canvas;
	
	int heigth, lenght;
	
	public void create(int width, int height, String name)
	{
		//init frame
		frame = new JFrame();
		this.lenght = width;
		this.heigth = height;
		frame.setSize(width, height);
		frame.setTitle(name);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void paintPanel(Panel panel)
	{
		frame.setContentPane(panel.getPanel());
	}
	
	public void displayOnScreen()
	{
		frame.setVisible(true);
	}
	
	public void eraseOfScreen()
	{
		frame.setVisible(false);
	}
	
	public JFrame getFrame() { return frame; }
}
