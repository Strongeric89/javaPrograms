package com.library;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Eric Date: 19 Dec 2016 Lab: implementation of Python Library Test Lab
 *         1, in Java
 */
public class LibrarySystemApp
{
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Book> catalogue = new ArrayList<Book>();
	// for part5
	public static ArrayList<Book> catalogue2 = new ArrayList<Book>();

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Java Library system App");

		while (true)
		{
			System.out.println(
					"[1]Display Books\n[2]Add a Book\n[3]Check out a book\n[4]Search for Book\n[5]Merge Libraries\nUSER:");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{
				System.out.println("Display Book..............");
				if (catalogue.size() == 0)
				{
					System.out.println("The Catalogue is Empty....");
				} // end if
				else
				{
					System.out.println("title\tauthor\tISBN\tQuantity\n----------------------------------------");
					for (Book b1 : catalogue)
					{
						System.out.printf("%s\t%s\t%s\t%d\n", b1.getTitle(), b1.getAuthor(), b1.getIsbn(),
								b1.getQuantity());

					} // end enhanced for
				} // end else
			} // end case 1
				break;
			case 2:
			{
				// add a book
				System.out.println("Add a Book........");
				getDetails(false);

			} // end case 2
				break;

			case 3:
			{
				System.out.println("Check out a book..........");
				if (catalogue.size() == 0)
				{
					System.out.println("no books in catalogue.");
				} // end if
				else
				{
					// find book first
					System.out.println("Enter book to find: ");
					String toFind = scan.next();
					int index = findBook(toFind);
					if (index == -1)
					{
						System.out.println("The Book " + toFind + " was not int the catalogue\n");
					}
				} // end else
			} // end case 3
				break;

			case 4:
			{
				if (catalogue.size() == 0)
				{
					System.out.println("Not books in catalogue");
				} else
				{
					System.out.println("Search for book.....");
					System.out.println("Enter a book to find:");
					String toFind = scan.next();
					search(toFind);
				} // end else

			} // end case 4
				break;

			case 5:
			{
				// create some random books
				System.out.println("How many other books in the other catalogue?");
				int num = scan.nextInt();
				for (int i = 0; i < num; i++)
				{

					getDetails(true);
				} // end for

				// update the first list
				catalogue.addAll(catalogue2);

			}
				break;
			default:
			{
				System.out.println("not a valid option");
			}

			}// end switch
		} // end while loop

	}// end main

	// function to create a book object
	public static void getDetails(Boolean flag)
	{

		System.out.print("Title:");
		String title = scan.next();
		System.out.print("Author:");
		String author = scan.next();
		System.out.print("ISBN:");
		String isbn = scan.next();
		System.out.print("Quantity:");
		int quantity = scan.nextInt();

		if (flag == true)
		{
			// create object of Book
			Book newBook = new Book(title, author, isbn, quantity);
			// add book to the catalogue
			catalogue2.add(newBook);

		} else
		{

			// create object of Book
			Book newBook = new Book(title, author, isbn, quantity);
			// add book to the catalogue
			catalogue.add(newBook);
		}
	}

	public static int findBook(String toFind)
	{
		int index = -1;
		// search the list for the book
		for (Book b1 : catalogue)
		{

			if (b1.getTitle().equalsIgnoreCase(toFind))
			{
				index = catalogue.indexOf(b1);
				System.out.printf("%s was found at index %d of the catalogue\n", toFind, index);
				System.out.println("How many do you want to check out?");
				int checkout = scan.nextInt();
				if (checkout > b1.getQuantity())
				{
					System.out.println("not enough to withdraw");
				} else
				{
					int newQuantity = b1.getQuantity() - checkout;
					b1.setQuantity(newQuantity);

					System.out.printf("Quantity update: %d", b1.getQuantity());
				}

			} // end if

		} // end for
		return index;

	}// end findBook

	public static void search(String toFind)
	{
		for (Book b1 : catalogue)
		{

			if (b1.getTitle().equalsIgnoreCase(toFind))
			{

				System.out.println(b1);
			} // end if

			else
			{
				System.out.println("Book not found");
			}

		} // end for
	}// end search
}// end class
