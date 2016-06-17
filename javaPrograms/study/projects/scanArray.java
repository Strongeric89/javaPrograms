/*using scanner and arrays together*/
import java.util.Scanner;
public class scanArray{
  public static void main(String [] args)
  {
    Scanner scanf = new Scanner(System.in);
    System.out.println("How many elements in the array?");
    int SIZE = scanf.nextInt();
    int numbers[] = new int [SIZE]; // assinging the memory for SIZE X elements
    //populate the arrays
    for(int i=0;i<numbers.length;i++)
    {
      System.out.print((i+1) + ".\t");
      numbers[i]= scanf.nextInt();
    }//end for

    for(int i=0;i<numbers.length;i++)
    {
      System.out.print(numbers[i] + "\t");
    }//end for

  }//end main()
}//end class
