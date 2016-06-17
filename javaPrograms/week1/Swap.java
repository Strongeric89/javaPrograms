import java.io.Console;
public class Swap{
   public static void main(String [] args)
   {
      Console con = System.console();
      int SIZE = 4;
      int swap;
      int numbers [] = new int [SIZE];

      //ask user to enter the 4 numbers
      for(int i=0;i<SIZE;i++)
      {
         numbers[i]= Integer.parseInt(con.readLine("enter Number# " + (i+1) + ":  "));
      }//end for

      //implement a Swap 1 and 2
      swap = numbers[0];
      numbers[0] = numbers[1];
      numbers[1] = swap;

      //implement a swap 3 and 4
      swap = numbers[2];
      numbers[2]= numbers[3];
      numbers[3]=swap;

      System.out.println("AFTER THE SWAP....");
      //print out new order
      for(int i =0; i<SIZE;i++)
      {
         System.out.println("Number #" + (i+1) + " is " + numbers[i]);
      }//end for


   }//end main
}//end class
