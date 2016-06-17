package com.ericStrong; // setting up the package
import java.io.Console; // importing the io package for the Console Class
public class TaskApp{
   public static void main(String [] args)
   {

      Console con = System.console(); //naming the instance of the console class
      System.out.println("Hello and Welcome to the TaskApp Program!"); //part A
      String day = con.readLine("Please enter the current Day:  "); // part B
      System.out.println("Hope you're having a nice " + day); // part C
      System.out.println("Please enter the following:");
      String name = con.readLine("Name: "); //storing the users input into String name
      int age = Integer.parseInt(con.readLine("Age: ")); // parsing the users input into int variable age
      System.out.println("Thank you " + name + " , you are " + age + " years of age.");
      System.out.println(name + " ,You will be " + (age + 3) + " in 3 years time. Hate That!");

   }//end main()
}//end class
