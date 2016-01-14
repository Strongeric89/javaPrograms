 

import java.util.Scanner;
class Calc
{
    public static void main (String []args)
    {
        Scanner Userinput = new Scanner (System.in);
        float first_number;
        float second_number;
        System.out.println ("Please enter your first number");
        first_number = Userinput.nextFloat ();
        System.out.println("please enter your second number");
        second_number = Userinput.nextFloat ();
        System.out.println(first_number + "+" + second_number + "=" + (first_number + second_number));
        System.out.println(first_number + "-" + second_number + "=" + (first_number - second_number));
        System.out.println(first_number + "*" + second_number + "=" + (first_number * second_number));
        System.out.println(first_number + "/" + second_number + "=" + (first_number / second_number));
    }
}