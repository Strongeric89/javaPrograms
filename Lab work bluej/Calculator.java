import java.util.Scanner;
public class Calculator
{
    public static void main(String []args)
    {
        Scanner Userinput = new Scanner(System.in);
        
        int first_number;
        int second_number;
        
        System.out.print("Please enter your first number: ");
        first_number = Userinput.nextInt ();
         System.out.print("Please enter your second number: ");
        second_number = Userinput.nextInt ();
        
        System.out.println(first_number + "+" + second_number + "=" + (first_number + second_number));
        System.out.println(first_number + "-" + second_number + "=" + (first_number - second_number));
        System.out.println(first_number + "*" + second_number + "=" + (first_number * second_number));
        System.out.println(first_number + "/" + second_number + "=" + (first_number / second_number));
    }
}
        