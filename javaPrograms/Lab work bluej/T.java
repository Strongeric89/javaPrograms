import java.util.Scanner;
public class Name
{
public static void main(String []args)
{
Scanner Userinput = new Scanner (System.in);
String first_name;
String second_name;
String phone_number;
System.out.print("Please enter your first name: ");
first_name= Userinput.nextLine ();
System.out.print("Please enter your second name: ");
second_name= Userinput.nextLine ();
System.out.print("Please enter your Phone number: ");
phone_number= Userinput.nextLine ();
System.out.println();
System.out.print("Hi " + first_name + second_name +". We can contact you on " + phone_number + " Goodbye.");
}
}