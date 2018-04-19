package Main;

public class Pamoka2
{
	public static int [] x;
	public static int [] y;
	public static int arrayLenght = 8;
	public static void main(String[] args)
	{
		x = new int [arrayLenght];
		y = new int [arrayLenght];
		for(int i = 0; i < arrayLenght; i = i + 2)
		{
			int sk = (int) Math.floor(Math.random() * 100);
			x[i] = sk;
			x[i + 1] = sk * x[i];
			System.out.println("x yra: " + x[i]);
			System.out.println("x * x yra: " + x[i + 1] + System.getProperty("line.separator"));
		}
	}

}
