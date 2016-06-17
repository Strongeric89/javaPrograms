/*the following program gets todays date and then calculates how old you are from it*/
import java.util.Calendar;
import java.util.Scanner;

class Cal {

    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);

    int calculateAge(int yearOfBirth){
    int age =  year - yearOfBirth;
    return age;
    }//end calculate age
}//end cal

public class Calendartest{
    public static void main(String [] args)
    {
        System.out.println(new java.util.Date());
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your year of Birth:");
        int yearOfBirth = scan.nextInt();
        Cal cal1 = new Cal();
        int answer = cal1.calculateAge(yearOfBirth);

        System.out.println("You are " + answer + " years old");
    }//end main
}//end class
