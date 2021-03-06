package com.robotvshuman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Date: 23 Jan 2017 Lab:
 */
public class Arena
{
	public static Random r1 = new Random();
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Army> robotArmy = new ArrayList<Army>();
	public static ArrayList<Army> humanArmy = new ArrayList<Army>();
	public static int size = 0;
	public static int h = 0;// human
	public static int r = 0;// robot

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Robot VS Human Arena.");
		System.out.println("How many battles?");
		size = scan.nextInt();
		generateArmy(size);

		// enter the arena
		arena();

		System.out.println("GAME OVER!");

	}// end main

	public static void arena()
	{

		// one member from each army must fight

		while (robotArmy.size() != 0 || humanArmy.size() != 0)
		{
			if (robotArmy.size() == 0 || humanArmy.size() == 0)
			{

				break;
			} else
			{
				battle(h, r);
			}

		} // end while
		winner();

	}// end arena

	public static void battle(int h, int r)
	{
		Random r2 = new Random();
		// first robot v first human
		int randNumber;
		while (true)
		{

			if (robotArmy.get(r).getHealth() <= 0)
			{

				try
				{
					if (robotArmy.size() != 0)
					{
						robotArmy.remove(r);
					} else
					{
						break;
					}

				}

				catch (IndexOutOfBoundsException ioob)
				{
					System.out.println("WE HAVE A WINNER!");

					break;

				}

			} // end if

			if (humanArmy.get(h).getHealth() <= 0)
			{

				try
				{
					if (humanArmy.size() != 0)
					{
						humanArmy.remove(h);
					} else
					{
						break;
					}

				}

				catch (IndexOutOfBoundsException ioob)
				{
					System.out.println("WE HAVE A WINNER!");

					break;

				}

			}

			System.out.println("\n....................\nRobots = " + robotArmy.size() + "\nHumans =" + humanArmy.size()
					+ "\n....................");

			if (robotArmy.size() == 0 || humanArmy.size() == 0)
			{
				System.out.println("\nDown to the last fight\n");
				break;
			}

			randNumber = r2.nextInt(10);
			randNumber = randNumber % 2;

			switch (randNumber)
			{
			case 0:
			{
				if (humanArmy.size() != 0)
				{
					robotAttack(r);
				} else
				{
					break;
				}
				// robot attacks

			}

			case 1:
			{
				if (robotArmy.size() != 0)
				{
					humanAttack(h);

				} else
				{
					break;
				}
				// human attacks

			}

			default:
			{
				// nobody attacks

			}
				break;

			}// end switch

		} // end while

	}// end battle

	public static void robotAttack(int i)
	{
		System.out.println(humanArmy.get(i).getName() + " VS " + robotArmy.get(i).getName());
		// battle commences
		scan.next();

		humanArmy.get(i).setHealth(humanArmy.get(i).getHealth() - robotArmy.get(i).getAttack());
		System.out.println("robot attacks human with attack of " + robotArmy.get(i).getAttack()
				+ " the humans health is now " + humanArmy.get(i).getHealth());

		if (humanArmy.get(i).getHealth() <= 0)
		{
			System.out.println("Human is dead!");
		}

	}// end robotAttack

	public static void humanAttack(int i)
	{
		System.out.println(humanArmy.get(i).getName() + " VS " + robotArmy.get(i).getName());
		// battle commences
		scan.next();

		robotArmy.get(i).setHealth(robotArmy.get(i).getHealth() - humanArmy.get(i).getAttack());
		System.out.println("Human attacks robot with attack of " + humanArmy.get(i).getAttack()
				+ " the robots health is now " + robotArmy.get(i).getHealth());

		if (robotArmy.get(i).getHealth() <= 0)
		{
			System.out.println("Robot is dead!");
		}

	}// end humanAttack

	public static void winner()
	{
		if (humanArmy.size() > robotArmy.size())
		{
			System.out.println("The Humans Win!");
		} else
		{
			System.out.println("The Robots Win!");
		}

	}

	public static void generateArmy(int size)
	{
		// generating the army of Robots
		for (int i = 0; i < size; i++)
		{
			createHuman((i + 1));
			createRobot((i + 1));

		}
		System.out.println("[Armies Generated]..........\n");

	}// end generateArmy

	public static void createHuman(int i)
	{
		String type = "Human";
		String name = "No. ";
		String humanName = name + i;
		int health = r1.nextInt(101);
		int attack = r1.nextInt(101);

		// create Human
		Army p = new Army(type, humanName, health, attack);
		// add to the army
		humanArmy.add(p);

	}

	public static void createRobot(int i)
	{
		String type = "Robot";
		String name = "T-";
		String robotName = name + i;
		int health = r1.nextInt(101);
		int attack = r1.nextInt(101);

		// create Robot
		Army p = new Army(type, robotName, health, attack);
		robotArmy.add(p);
	}

}// end class