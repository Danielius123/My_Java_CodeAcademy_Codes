package Main;

import java.util.Scanner;

public class Objects
{
	public static Object_Assets Object = new Object_Assets();
	public static Scanner input = new Scanner(System.in);
	public static String worm;
	
	public static void main(String[] args)
	{	
		System.out.println("Ivesk obuolio masę:");
		Object.mass = input.nextInt();
		
		printAllThings();
		
		System.out.println("Parašyk ar obuolys turi kirminų? Taip || Ne:");
		worm = input.next();
		
		patikrintWorm();
		
		printAllThings();
	}
	
	public static void printAllThings()
	{
		System.out.print("\n");
		
		System.out.println("Obuolio masė lygi: " + Object.mass);
		if(Object.worms == true)
		{
			System.out.println("Ar tavo obuolys turi kirminų?: Taip");
		}
		else if(Object.worms == false)
		{
			System.out.println("Ar tavo obuolys turi kirminų?: Ne");
		}
		
		System.out.print("\n");
	}
	
	public static void patikrintWorm()
	{
		if(worm.equalsIgnoreCase("Taip"))
		{
			Object.worms = true;
		}
		else if(worm.equalsIgnoreCase("Ne"))
		{
			Object.worms = false;
		}
		else
		{
			System.out.println("Kazką netaip suvedei");
			worm = input.next();
			patikrintWorm();
		}
	}
}
