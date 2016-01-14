 

import java.util.Scanner;
public class Age

{
    public static void main (String []args)
    {
        Scanner Userinput = new Scanner (System.in);
        String first_name;
        int year_of_birth, year;
        System.out.print ("Please enter your first name: ");
        first_name = Userinput.nextLine ();
        System.out.print ("Hello " +  first_name  + " what year were you born in ? ");
         year_of_birth = Userinput.nextInt();
        System.out.print ("What is the current year?: ");
         year = Userinput.nextInt();
       
        System.out.println ("");
        System.out.print ("That would mean this year sometime, you will be " + (year-year_of_birth));
   
    } 
}
        
