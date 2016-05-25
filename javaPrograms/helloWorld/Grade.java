package Grade;

import java.util.Scanner;
class Grade

{
    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in); // scanner is called input
        int mark;
        System.out.print ("Please enter your Score"); // ask student to enter their percentage to determine the grade
        mark = input.nextInt ();
        
        if(mark  >=0 && mark <= 39)
        {
        System.out.print ("Your grade is an F (Fail).");
    }
        else if (mark >=40 && mark <= 49)
        {
        System.out.print ("Your grade is an D (Pass).");
    }
        else if (mark >=50 && mark <= 59)
        {
        System.out.print ("Your grade is an C (Pass).");
    }
        else if (mark >=60 && mark <= 69)
        {
        System.out.print ("Your grade is an B (Pass).");
    }
        else if (mark >=70 && mark <= 89)
        {
        System.out.print ("Your grade is an A (Pass).");
    }
        else if (mark >=90 && mark <= 100)
        {
        System.out.print ("Your grade is an A+ (Pass).");
    }
        // enter grades
    }
}