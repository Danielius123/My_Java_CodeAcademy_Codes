package Main;

import java.util.Scanner;

public class Voverytes
{
	public static String ArSavaitgaliBalius;
	public static int PicuSk;
	
	public static void main(String[] args)
	{
		System.out.println("Ši mini programėlė pasakys ar voveryčių balius buvo geras?");
		ScanBalius();
	}

	public static void ScanBalius ()
	{
		System.out.println("Ar balius buvo savaitgalį ar ne?");
		Scanner inputBalius = new Scanner(System.in);
		ArSavaitgaliBalius = inputBalius.next();
		TikrintiBalius();
	}
	
	public static void TikrintiBalius ()
	{
		if(ArSavaitgaliBalius.equals("Taip") || ArSavaitgaliBalius.equals("Ne"))
		{
			ScanPicos();
		}
		else
		{
			System.out.println("Kažką neto suvedei, gal padarei klaidą?");
			ScanBalius();
		}
	}
	
	public static void ScanPicos ()
	{
		System.out.println("Kiek baliuje buvo picų?");
		Scanner inputPicos = new Scanner(System.in);
		PicuSk = inputPicos.nextInt();
		ParasytiAtsakyma();
	}
	
	public static void ParasytiAtsakyma ()
	{
		if(ArSavaitgaliBalius.equals("Taip") && PicuSk >= 6 || ArSavaitgaliBalius.equals("Ne") && PicuSk >= 6 && PicuSk <= 10)
		{
			System.out.println("Galima sakyti, kad voveryčių balius buvo geras, nebent tu suklydai kažką vesdamas!");
		}
		else
		{
			System.out.println("Galima sakyti, kad voveryčių balius buvo nelabai geras, nebent tu suklydai kažką vesdamas!");
		}
	}
}
