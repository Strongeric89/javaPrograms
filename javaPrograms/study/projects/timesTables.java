import java.util.Scanner;
public class timesTables {
  public static void main(String [] args)
  {
  int j=1;
  int i=1;

    Scanner scanf= new Scanner(System.in);
    System.out.println("The times tables!");
    int answer=0;
    int j=1;
    int i=1;


    do
    {

      answer = i * j;
      System.out.printf("\n%d X %d = %d",j,i,answer);
      i++;
      if(i==13)
      {
        System.out.println("\n\npress any key to continue:");
         scanf.nextLine();
        i=1;
        j ++;
      }//reset counters
    }//end do
    while(j <=12);
    //for(int i=0;i<=12;i++)
  }//end main()
}//end class
