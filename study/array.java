/*the following is a program to implement arrays in java*/
import java.util.Scanner;
public class array{
  public static void main(String [] args)
  {
  Scanner scanf= new Scanner(System.in);
  int [] numbers;
  numbers = new int [3];
  numbers[0] = 10;
  numbers[1]= 100;
  numbers[2]= 13;
  for(int i=0;i<3;i++)
  {
    System.out.println("Array element:" + i + "\t Array Value: " + numbers[i] );

  }//end for1
    //or another way using the array.length
  for(int i=0;i<numbers.length;i++)
  {
    System.out.println("Array element:" + i + "\t Array Value: " + numbers[i] 
  }//end for2

  //float array
  float[] values = {1.1f,2.2f,3.3f,4.4f};
  for(int i=0;i<values.length;i++)
  {
    System.out.println("Array element:" + i + "\t Array Value: " + values[i] );
  }//end for

  }//end main
}//end class
