

public class Array {
	int[] array;
	int columns, rows;
	
	public Array(int col, int row)
	{
		columns = col;
		rows = row;
		array = new int[row*columns];
	}
	
	public int get(int x, int y)
	{
		if(x<0 || x>columns -1)
			return -1;
		else if(y<0 || y>rows -1)
			return -1;
		else
			return array[x + y*columns];
	}
	
	public void set(int x, int y, int val)
	{
		if(x<0 || x>columns -1)
			return;
		else if(y<0 || y>rows -1)
			return;
		else 
			array[x = y*columns] = val;
	}
	
	public void print()
	{
		for(int j = 0; j < rows ; j++)
		{
			System.out.print("|");
			for (int i = 0; i<columns; i++)
			{
				System.out.print(" " +array[j * columns + i] + " |");
			}
			System.out.print("\n");
		}
	}
}
