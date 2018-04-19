package Main;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Pamoka
{
	public static int monsterHP;
	public static int playerDMG;
	public static String roleATS;
	public static String ats;
	public static boolean gameFinished = false;
	public static boolean end = false;

	public static void main(String[] args)
	{
		monsterHPGenerator();
		print();
		while(gameFinished == false)
		{
			end = false;
		}
		end = true;
		if(end)
		{
			int attackHP = monsterHP - playerDMG;
			if (attackHP <= 0)
			{
				attackHP = 0;
			}

			System.out.println("Monster HP: " + attackHP);
			if (attackHP != 0)
			{
				System.out.println("You lost!");
			} else
			{
				System.out.println("You win!");
			}
		}
	}

	public static void monsterHPGenerator()
	{
		Random ranMonster = new Random();
		monsterHP = 10 + ranMonster.nextInt(5);
	}

	public static void playerHPGenerator()
	{
		Random ranPlayer = new Random();
		playerDMG = 10 + ranPlayer.nextInt(5);
		printToChoose();
	}

	public static void print()
	{
		System.out.println("Insert 'role' to role your DMG");
		scanYourDMG();
	}

	public static void printToChoose()
	{
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("Player DMG: " + playerDMG);
		System.out.println("Choose action: attack | defend");
		scan();
	}

	public static void scanYourDMG()
	{
		Scanner inputRole = new Scanner(System.in);
		roleATS = inputRole.nextLine();
		tikrintiAtsakyma(true, false);
	}

	public static void scan()
	{
		Scanner input = new Scanner(System.in);
		ats = input.nextLine();
		tikrintiAtsakyma(false, true);
	}

	public static void trintiConsole()
	{
		
	}

	public static void tikrintiAtsakyma(boolean scanRoleATS, boolean scanATS)
	{
		if (scanRoleATS == true)
		{
			if (roleATS.equalsIgnoreCase("role"))
			{
				playerHPGenerator();
			}
			else
			{
				System.out.println("You made a mistake, try again!");
				scanYourDMG();
			}
		}

		if (scanATS == true)
		{
			if (ats.equalsIgnoreCase("attack"))
			{
				gameFinished = true;
			}
			else if (ats.equalsIgnoreCase("defend"))
			{
				trintiConsole();
				print();
			}
			else
			{
				System.out.println("You made a mistake, try again!");
				scan();
			}
		}
	}
}
