import java.util.Scanner;

public class game1
{
    public static void main(String [] args)
    {
        
        Scanner input = new Scanner (System.in);
        boolean flag = true;
        String name ;
        String surname ;
        int age=0;
        
        while(flag == true)
        {
        System.out.println("Please enter your name:");
        name = input.nextLine();
        System.out.println("enter your surname");
        surname =input.nextLine();
        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("Thank you " + name + surname + " your age is " + age );
        
        if(surname == "eric" ||surname == "laura")
        {
            flag = false;
        }//end if
    }//end while
    }//end main
}//end class




