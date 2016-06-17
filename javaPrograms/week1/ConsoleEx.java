import java.io.Console; //importing the console class from io package
public class ConsoleEx{
   public static void main(String [] args)
   {
      Console input = System.console(); //creating an instance of the console called input
      String name = input.readLine("Enter your name:"); //reading in from the console to a string variable
      System.out.println("Thank you " + name);
   }//end main
}//end class
