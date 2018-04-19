package Main;

import java.util.Scanner;

public class Uzduotis_6
{
	public static int arrayLenght;
	public static int[] array;
	public static int[] arrayMinus;
	public static int checkArray = 0;
	public static Scanner inputArray;

	public static void main(String[] args)
	{
		ScanArray();
	}

	public static void ScanArray()
	{
		System.out.println("Enter array lenght");
		inputArray = new Scanner(System.in);
		arrayLenght = inputArray.nextInt();
		TikrintiLenght();
	}

	public static void TikrintiLenght()
	{
		if (arrayLenght > 0)
		{
			array = new int[arrayLenght];
			Array();
		} else
		{
			System.out.println("You made a mistake, try again!");
			ScanArray();
		}
	}

	public static void Array()
	{
		for (int i = 0; i < arrayLenght; i++)
		{
			System.out.println("Enter array " + i + " number");
			array[i] = inputArray.nextInt();

			if (array[i] >= 10)
			{
				array[i] = 10;
			}
		}

		ScanArrayNum();
	}

	public static void ScanArrayNum()
	{
		for (int i = 0; i < arrayLenght; i++)
		{
			if (array[i] < 0)
			{
				checkArray++;
			}
		}

		arrayMinus = new int[checkArray];
		int check = 0;
		for (int i = 0; i < arrayLenght; i++)
		{
			if (array[i] < 0)
			{
				arrayMinus[check] = array[i];
				check++;
			}
		}

		PrintEnd();
	}

	public static void PrintEnd()
	{
		System.out.println("Main array is:");
		for (int i = 0; i < arrayLenght; i++)
		{
			System.out.print(array[i] + " ");
		}

		System.out.println("\n Array with minus numbers is:");
		for (int i = 0; i < arrayMinus.length; i++)
		{
			System.out.print(arrayMinus[i] + " ");
		}
	}
}
