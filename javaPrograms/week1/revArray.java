import java.io.Console;
public class revArray{
   public static void main(String [] args)
   {
      Console con = System.console();
      int SIZE = 5;

      int array1 [] = new int [SIZE];
      int array2 [] = new int [SIZE];
      //populating the array
      for(int i =0;i<array1.length;i++)
      {
         array1[i] = Integer.parseInt(con.readLine("Enter Number" + (i + 1)));
         array2[SIZE-1] = array1[i];
         SIZE --;
      }//end for
      System.out.println("copy elements from element 1 to element 2");
      //outputing both arrays
      System.out.println("Array1\t\t\t\tArray2");
      for(int i =0;i<array1.length;i++)
      {
         System.out.println("array1,element#" + i + ": " + array1[i] +"\t\tarray2,element#" + i + ": " + array2[i] );
      }//end for
   }//end main
}//end class
