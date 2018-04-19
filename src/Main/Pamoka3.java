package Main;

import java.util.Scanner;

public class Pamoka3
{

	public static void main(String[] args)
	{
		int k = 0;
		System.out.println("Ivesk masyvo kieki");
		Scanner inputMas = new Scanner(System.in);
		int masyvo_sk = inputMas.nextInt();
		
		System.out.println("Ivesk n skaiciu, kuris paskui isrinks visus tokius pacius skaicius is array");
		int n = inputMas.nextInt();
		
		int a [];
		a = new int [masyvo_sk];
		System.out.println("Ivesk visus masyvo skaicius");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(i + " skaicius: ");
			a[i] = inputMas.nextInt();
			if(n == a[i])
			{
				k++;
			}
		}
		
		System.out.println("n skaiciu yra: " + k);
	}

}
