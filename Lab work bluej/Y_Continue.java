/*
 * Y_to continue app
 * version 1.0
 * Eric Strong
 */
import java.util.Scanner;
public class Y_Continue
{
    public static void main(String [] args)
    {
        System.out.println("Please press Y/y to continue: ");
        
        Scanner Input = new Scanner (System.in);
        boolean flag = false;
       String user_input = Input.nextLine();
        char c = user_input.charAt (0);
        
       while(flag == false)
       {if( c== 'y' || c =='Y'){flag=true;}
       else{System.out.println("You didn't enter Y/y please try again: ");
       user_input = Input.nextLine();
       c= user_input.charAt(0);
       
    }
    System.out.println("Thank you");

}


}
}



       
        