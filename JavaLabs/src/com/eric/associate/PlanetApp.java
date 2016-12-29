package com.eric.associate;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PlanetApp
{
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Planet> solarSystem = new ArrayList<Planet>();

	public static void main(String[] args)
	{
		int numPlanets = 2;
		for (int i = 0; i < numPlanets; i++)
		{
			getInfo();
		} // end for

		// display all of the planets (use joption pane)
		for (Planet p : solarSystem)
		{
			// jOptionPane messageDialog
			JOptionPane.showMessageDialog(null,
					"\nplanet: " + p.getName() + "\nInfo:" + p.getInfo() + "\nsize:" + p.getSize(), "PlanetApp",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(p);
		}

	}// end main

	public static void getInfo()
	{
		// jOPtion pane inputDialog

		/*
		 * synthax: String name= JOptionPane.showInputDialog(frame,
		 * "text to display","title of pane",JOptionPane.INFORMATION_MESSAGE);
		 */

		String name = JOptionPane.showInputDialog(null, "enter planet name:", "PlanetApp",
				JOptionPane.INFORMATION_MESSAGE);
		UIManager.put("OptionPane.messageForeground", Color.RED);

		String info = JOptionPane.showInputDialog(null, "enter planet info:", "PlanetApp",
				JOptionPane.INFORMATION_MESSAGE);
		UIManager.put("OptionPane.messageForeground", Color.RED);

		String size = JOptionPane.showInputDialog(null, "enter planet size:", "PlanetApp",
				JOptionPane.INFORMATION_MESSAGE);
		UIManager.put("OptionPane.messageForeground", Color.RED);
		// convert string to float
		float size1 = Float.parseFloat(size);

		// create planet object
		Planet p = new Planet(name, size1, info);
		// add planet to the solar system
		solarSystem.add(p);

	}// end get info
}// end class
