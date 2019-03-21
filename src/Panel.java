import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{
	/**
	 * This class hold the Panel, that will be pushed in the Frame
	 * All elements will be created with small elements with ("easier names"
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel panel = new JPanel();
	
	public void setBackgroundOrange()
	{
		panel.setBackground(Color.ORANGE);
	}
	
	public JPanel getPanel()
	{
		return panel;
	}
	
	public void applyGraphics(Figures f)
	{
		panel.paint(f.getGraphics());
	}
}
