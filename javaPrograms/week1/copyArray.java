//copy arrays
import java.io.Console;
public class copyArray{
   public static void main (String [] args)
   {
      int SIZE = 5;
      Console con = System.console();
      String array1 [] = new String[SIZE];
      String array2 [] = new String[SIZE];
      System.out.println("Enter " + SIZE + " Elements into the array");
      for(int i = 0; i<array1.length;i++)
      {
         array1[i] = con.readLine("element #" + i);
         array2[i] = array1[i];
      }//END for

      //displaying the array2 contents to ensure it was copied correctly
      for(int i =0;i<array2.length;i++)
      {
         System.out.println("element #" + i + " . of array 2: " + array2[i]);

      }//end display for
   }//end main()
}//end class
