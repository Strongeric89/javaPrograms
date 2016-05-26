/*Grade lab from AFP*/
import java.util.Scanner;
public class grade {
  public static void main(String [] args)
    {
      Scanner scanf = new Scanner(System.in);
      System.out.println("enter your grade:(0-100)");
      int grade = scanf.nextInt();
      //0-40
      if(grade >-1 && grade <40 )//0-39
        {
          System.out.println("You failed F. " + grade);
        }//end if

        else if(grade >39 && grade <60 )//40-59
          {
            System.out.println("You pass E,D " + grade);
          }//end if

          else if(grade >59 && grade <80 )//60-79
            {
              System.out.println("You Passed C,B " + grade);
            }//end if

            else if(grade > 79 && grade <=100 )//80-100
              {
                System.out.println("You Passed B+, A " + grade);
              }//end if
              else
              {
                System.out.println("Not a valid grade: " + grade);

              }//end

    }//end main()
}//end class
