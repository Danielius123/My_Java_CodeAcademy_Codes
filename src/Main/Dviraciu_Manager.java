package Main;

import java.util.Scanner;

public class Dviraciu_Manager
{
	public static void main(String[] args)
	{
		//kintamieji
		Scanner input = new Scanner(System.in);
		int bikeNumber = 1;
		Dviratis_1 bike_1 = new Dviratis_1();
		Dviratis_2 bike_2 = new Dviratis_2();
		
		//veiksmai
		while(bikeNumber != 3)
		{
			System.out.println("Iveskite " + bikeNumber + " dviracio greiti km/h:");
			float speed = input.nextFloat();
			System.out.println("Iveskite " + bikeNumber + " dviracio pravaziuotus km:");
			float km = input.nextFloat();
			
			if(bikeNumber == 1)
			{
				bike_1 = new Dviratis_1(speed, km);
				bike_1.vaziuotiVienaVal();
			}
			else if(bikeNumber == 2)
			{
				bike_2 = new Dviratis_2(speed, km);
				bike_2.vaziuotiVienaVal();
			}
			
			System.out.print("\n");
			bikeNumber++;
		}
		
		System.out.println("Du dviraciai nuvaziavo po 1 valanda, su skirtingais greiciais, pirmas nuvaziavo: " + Math.round(bike_1.distance) + "km, o antras: " + Math.round(bike_2.distance) + "km.");
		if(bike_1.distance > bike_2.distance)
		{
			System.out.println("Ir buvo nustatyta, kad pirmasis dviratis daugiau nuvaziavo, is to galime daryti isvada, kad pirmojo dviracio greitis didesnis.");
			float reikalingasLaikas = Math.round(bike_1.distance - bike_2.distance) / bike_2.getSpeed();
			System.out.println("Bei antrajam dviraciui reiktu " + reikalingasLaikas + "h, kad pasivytu pirmaji.");
		}
		else if(bike_1.distance < bike_2.distance)
		{
			System.out.println("Ir buvo nustatyta, kad antrasis dviratis daugiau nuvaziavo, is to galime daryti isvada, kad antrojo dviracio greitis didesnis.");
			float reikalingasLaikas = Math.round(bike_2.distance - bike_1.distance) / bike_1.getSpeed();
			System.out.println("Bei pirmajam dviraciui reiktu " + reikalingasLaikas + "h, kad pasivytu antraji.");
		}
		else
		{
			System.out.println("Ir buvo nustatyta, kad abu dviraciai nuvaziavo ta pati atstuma, is to galime daryti isvada, kad abieju dviraciu greiciai tokie patys.");
		}
	}
}
