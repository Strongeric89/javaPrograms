import java.util.Scanner;
class Names
{
    public static void main (String []args)
    {
    Scanner Userinput = new Scanner (System.in);
String first_name;
String second_name;
int Phone_number;
System.out.print ("Please enter your first name: "); //prints "please enter your first name:" to screen
first_name = Userinput.nextLine (); // users input's via scanner called Userinput, first name
System.out.print ("Please enter your second name: "); // prints "please enter your second name" to screen
second_name = Userinput.nextLine (); // users input's via scanner called Userinput, second name
System.out.print ( first_name + ", Please enter your phone number: ");
Phone_number = Userinput.nextInt (); // user input's phone number 

 
System.out.println( " Hi " + first_name  +  second_name + " we can contact you at " + Phone_number);
}
    }




