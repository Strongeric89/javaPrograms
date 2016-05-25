/*
 * while app
 * version 1.0
 * eric strong
 */
import java.util.Scanner;
public class While
{
    public static void main (String [] args)
    {
         
        Scanner Scan= new Scanner (System.in);
        boolean flag = false;
        
          
        System.out.println("Please press y/Y to continue");
       String User_input = Scan.nextLine();
       char c = User_input.charAt(0);
        
     
        while(flag==false)
            {if(c== 'y' || c=='Y'){flag=true;}
            else{System.out.println("you did not enter Y/y. Please try again.");
            c=User_input.charAt(0);
            User_input = Scan.nextLine ();
        }
         System.out.println("Thank you");
    }
   
}
}

        
       
        
 

        

     
        

