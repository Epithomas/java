import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Figures{
	/**
	 * this is where all the figures are gonna be created
	 */
	
	
	private Graphics g;	
	
	public Figures(int x, int y, int height, int lenght, Display disp)
	{
		g = disp.getFrame().getGraphics();
	}
	
	public Graphics getGraphics()
	{
		return g;
	}
	
	public void setBlueRect(int x, int y, int width, int height)
	{
		System.out.println("setBlueRect: called");
		g.setColor(Color.BLUE);
		g.drawRect(x, y, width, height);
	}
	
	public void setPicture(String path, int x, int y)
	{
		Image image = null;
		try
		{
			image = ImageIO.read(new File(path));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		if(image != null)
		{
			g.drawImage(image, x, y, null);
		}
	}
}
