/*
 * Lab 1- Hello World.... boring!
 * Author: Eric Strong
 * Date:
 */
package com.lab1.test;
import java.util.Scanner;
import java.util.ArrayList;



public class HelloWorld {
	
	public static ArrayList<String> list = new ArrayList<String>();
	
	public static void main (String [] args){
		
//		for(int i=0;i<10;i++){
//			System.out.println((i+1)+". Hello World!, you crazy place!!!");
//		}
		
		//part 3
		getDetails();
	
	}//end main
	
	public static void getDetails(){
		
		//get all details from user
		Scanner scan = new Scanner(System.in);
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		
		System.out.println("please enter Owner Details: ");
		String owner = scan.nextLine();
		System.out.println("please enter Reg: ");
		String reg = scan.nextLine();
		System.out.println("please enter Max Speed: ");
		int max = scan.nextInt();
		System.out.println("please enter colour: ");
		String colour = scan.next();
		System.out.println("please enter transmission: ");
		char transmission = scan.next(".").charAt(0);
		System.out.println("please enter number of wheels: ");
		int wheels = scan.nextInt();
				
		//instantiate new vehicle object DEFAULT
		Vehicle car1 = new Vehicle();
		list.add(car1);
		System.out.println(car1);
		
		//instantiate another vehicle (OVERLOADING)
		Vehicle car2 = new Vehicle(owner,reg,max,colour,transmission,wheels);
		list.add(car2);
		System.out.println(car2);
		
	}
	

}//end class
