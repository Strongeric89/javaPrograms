import java.util.Scanner;
public class temps{
   public static void main(String [] args)
   {
      int SIZE = 5;
      Scanner scan = new Scanner (System.in);
      float fah[] = new float [SIZE];
      float cel[] = new float [SIZE];
      //get readings in Fahrenhiet
      for(int i=0;i<fah.length;i++)
         {
            System.out.print("Fah #" + i + " : ");
            fah[i] = scan.nextFloat();
            cel[i] =(float)((fah[i] - 32.0) * (5.0 / 9.0));

         }//end for
      System.out.println("Fahrenhiet\t\tCelcius");
      for(int i=0;i<cel.length;i++)
      {
         System.out.println("fah #" + i + ": " + fah[i] + "\t\tfah #" + i + ": " + cel[i]);
      }//end for

   }//end main
}//end class
