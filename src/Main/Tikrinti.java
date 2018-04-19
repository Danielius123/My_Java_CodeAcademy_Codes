package Main;

import java.util.Scanner;

public class Tikrinti
{

	public static void main(String[] args)
	{
		System.out.println("Ivesk masyvo kieki");
		Scanner inputMas = new Scanner(System.in);
		int masyvo_sk = inputMas.nextInt();

		int a[];
		a = new int[masyvo_sk];
		System.out.println("Ivesk visus masyvo skaicius");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(i + " skaicius: ");
			a[i] = inputMas.nextInt();
		}

		boolean keitimas = true;
		while (keitimas)
		{
			keitimas = false;
			for (int i = 0; i < a.length; i++)
			{
				for (int j = (i + 1); j < a.length; j++)
				{
					if (a[i] == a[j])
					{
						a[i]++;
						keitimas = true;
					}
				}
			}
		}

		System.out.println("Tavo array:");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
