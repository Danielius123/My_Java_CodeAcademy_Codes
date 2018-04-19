package Main;

import java.util.Scanner;

public class Uzdavinys_3
{
	public static String sarvai;
	public static int steveBlocks;
	public static int mass;
	public static int blockKg = 7874;
	public static int luitoKg;
	public static int steveLuitai;
	
	public static void main(String[] args)
	{
		int blockLuitai = 9;
		luitoKg = blockKg / blockLuitai;
		int sarvaiKg = luitoKg * 24;
		
		mass = luitoKg;
		
		scanSarvai();
		
		if(sarvai.equals("Taip"))
		{
			mass = mass + sarvaiKg;
		}
		else if(sarvai.equals("Ne"))
		{
		}
		else
		{
			System.out.println("Kazka netaip suvedei pabandyk dar");
			scanSarvai();
		}
		
		scanBlocks();
		scanLuitai();
		System.out.println("Vienas luitas sveria: " + luitoKg + "kg");
		System.out.println("Gelezies sarvai sveria: " + sarvaiKg + "kg");
		System.out.println("Gelezis Steve inventoriuje sveria: " + mass + "kg");
	}
	
	public static void scanSarvai()
	{
		System.out.println("Steve turi sarvus Ne || Taip");
		Scanner inputSarvai = new Scanner(System.in);
		sarvai = inputSarvai.next();
	}
	
	public static void scanBlocks()
	{
		System.out.println("Kiek Steve turi gelezies blocku?");
		Scanner inputBlocks = new Scanner(System.in);
		steveBlocks = inputBlocks.nextInt();
		mass = mass + steveBlocks * blockKg;
	}
	
	public static void scanLuitai()
	{
		System.out.println("Kiek Steve turi gelezies luitu?");
		Scanner inputLuitai = new Scanner(System.in);
		steveLuitai = inputLuitai.nextInt();
		mass = mass + steveLuitai * luitoKg;
	}
}
