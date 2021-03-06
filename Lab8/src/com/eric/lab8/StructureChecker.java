package com.eric.lab8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author Eric Strong Date: 15 Mar 2017 Lab: 8 ID: C15708709
 */
public class StructureChecker
{

	public static void main(String[] args)
	{
		/*
		 * PART 2
		 */
		ArrayList<String> list = new ArrayList<String>();

		System.out.print("\nList is an instance of ArrayList: ");
		System.out.print(list instanceof ArrayList);

		System.out.print("\nList is an instance of List: ");
		System.out.print(list instanceof List);

		System.out.print("\nList is an instance of Collection: ");
		System.out.print(list instanceof Collection);

		System.out.print("\nList is an instance of Iterable: ");
		System.out.print(list instanceof Iterable);

		System.out.print("\nList is an instance of Queue: ");
		System.out.print(list instanceof Queue);

		System.out.print("\nList is an instance of Set: ");
		System.out.print(list instanceof Set);

		/*
		 * PART 3
		 * 
		 */
		HashSet<String> humanSkullParts = new HashSet<String>();
		humanSkullParts.add("Nasal");
		humanSkullParts.add("Lacrimal");
		humanSkullParts.add("Inferior Nasal Concha");
		humanSkullParts.add("Maxiallary");
		humanSkullParts.add("Zygomatic");
		humanSkullParts.add("Temporal");
		humanSkullParts.add("Palatine");
		humanSkullParts.add("Parietal");
		humanSkullParts.add("Malleus");
		humanSkullParts.add("Incus");
		humanSkullParts.add("Stapes");

		Iterator i = humanSkullParts.iterator();
		System.out.println("------------LIST------------" + humanSkullParts.size());
		while (i.hasNext())
			System.out.println(i.next());

		humanSkullParts.add("Frontal");
		humanSkullParts.add("Ethmoid");
		humanSkullParts.add("Vomer");
		humanSkullParts.add("Sphenoid");
		humanSkullParts.add("Mandible");
		humanSkullParts.add("Occipital");

		i = humanSkullParts.iterator();
		System.out.println("------------NEW LIST------------" + humanSkullParts.size());

		while (i.hasNext())
			System.out.println(i.next());

		System.out.println("Does the set containt \"Humerus\": " + humanSkullParts.contains("Humerus"));
		System.out.println("Does the set containt \"Temporal\": " + humanSkullParts.contains("Temporal"));

		/*
		 * PART 4
		 * 
		 */

		// Collections.sort(humanSkullParts);
		// This will not work as the hashset is not a list so i used a list
		// which can be sorted
		ArrayList<String> hsp = new ArrayList<String>();
		hsp.addAll(humanSkullParts);
		Collections.sort(hsp);
		Iterator sortedSet = hsp.iterator();
		System.out.println("-----------Sorted Set----------------");
		while (sortedSet.hasNext())
		{
			System.out.println(sortedSet.next());
		}

		// reverse
		Collections.reverse(hsp);
		sortedSet = hsp.iterator();
		System.out.println("-----------Reverse Sorted Set----------------");
		while (sortedSet.hasNext())
		{
			System.out.println(sortedSet.next());
		}

		// shuffle
		Collections.shuffle(hsp);
		sortedSet = hsp.iterator();
		System.out.println("-----------Shuffled Set----------------");
		while (sortedSet.hasNext())
		{
			System.out.println(sortedSet.next());
		}

	}// end main

}// end class
