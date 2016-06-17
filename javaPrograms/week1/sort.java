import java.io.Console;
public class sort{
   public static void main(String [] args)
   {
      Console con = System.console();
      int SIZE = 3;
      int swap;

      int array1 [] = new int [SIZE];

      //populating the array
      for(int i =0;i<array1.length;i++)
      {
         array1[i] = Integer.parseInt(con.readLine("Enter Number" + (i + 1) + " : "));
      }//end for

      //implement a bubble sort algorithm
      for(int i =0;i<SIZE-1; i ++)
      {
         for(int j =i; j<SIZE-1;j++)
         {
            if(array1[j] > array1[j +1])
               {
                  swap = array1[j];
                  array1[j] = array1[j + 1];
                  array1[j + 1]= swap;
               }//end if
         }//end inner for
      }//end outter for

      for(int i =0;i<SIZE;i++)
      {
         System.out.println("element " + i + ": " + array1[i]);
      }//end for
   }//end main
}//end class
