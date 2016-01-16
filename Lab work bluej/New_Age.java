import java.util.Scanner;
import java.util.Calendar;

public class New_Age
{
    public static void main(String []args)
    {
        Scanner Userinput = new Scanner(System.in);
       Calendar cal= Calendar.getInstance ();
        String name;
        int year;
        int now = cal.get(Calendar.YEAR); // will be delcared 
        
        System.out.print("Please enter your name: ");
        name = Userinput.nextLine ();
        System.out.print("Hello" + name + "What is your Date of birth?" );
        year = Userinput.nextInt ();
        System.out.println();
        System.out.print("Ok" + name + "This means this year you will be" + (year-now));
    }
}
        