/*another switch case example*/
import java.util.Scanner;
public class id{
  public static void main(String [] args)
    {
      Scanner scanf= new Scanner(System.in);

      int flag =0;
      do{
          System.out.print("Enter you Student ID:");
        String id = scanf.nextLine();

        switch(id){
          case "c15708709" :{
            System.out.println("thank you Eric Strong");
            flag =1;
          }break;//end case 1

          case "c1555555" :{
            System.out.println("thank you Alan Gavin");
          }break;//end case 2

          case "c111111" :{
            System.out.println("thank you Killian Walsh");
          }break;//end case 3

          default: {
            System.out.println("not a valid student.");
          }//end default

        }//end switch


      }//end do
      while(flag==0);
    }//end main

}//end class
