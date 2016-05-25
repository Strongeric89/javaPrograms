/**
 * press x to continue
 * version 1.0
 * eric
 */
import java.util.Scanner;
public class press_x
{
    public static void main (String [] args)
    {
        
        System.out.print("Press x/X to continue;");Scanner Scan = new Scanner (System.in);
        boolean flag = false;
        String Username = Scan.nextLine ();
        char c = Username.charAt(0);
        
      
      
      while(flag == false){
          if(c=='x' || c== 'X'){flag = true;}
          else {System.out.print("You did not enter x/X please try again?");}
          Username = Scan.nextLine();
          c = Username.charAt(0);
        }
        System.out.println("Thank you");
    }
}
        