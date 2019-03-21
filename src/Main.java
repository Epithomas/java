import java.awt.Graphics;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Rotonde: launched");
		//Array array = new Array(20,20);
		//array.set(0,0,1);
		//array.print();
		
		Display disp = new Display();
		disp.create(400,400, "disp");
		
		Panel pan = new Panel();
		pan.setBackgroundOrange();
		
		Figures fig = new Figures(0,0,400,400, disp);
		
		fig.setBlueRect(0, 0, 15, 15);
		
		pan.applyGraphics(fig);
		
		disp.paintPanel(pan);
		
		disp.displayOnScreen();
	}
}