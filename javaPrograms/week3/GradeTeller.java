/*The following program takes a percentage and tells the user what grade they got
Author: Eric Strong
Date: 08/06/2016
*/
package com.eric;
import java.util.Scanner;
class Grade{
    public char findGrade(int result,String name)
    {
        if(result >=85)
        {
            System.out.println(name + " , You got an A.");
            return 'A';
        }//end if A
        else if(result >=75)
        {
            System.out.println(name + " , You got a B.");
            return 'B';
        }//end else if B
        else if(result >=65)
        {
            System.out.println(name + " , You got a C.");
            return 'C';
        }//end else if C
        else if(result >=55)
        {
            System.out.println(name + " , You got a D.");
            return 'D';
        }//end else if B
        else if(result < 0 || result >100)
        {
                System.out.println(name + " , Not a valid Grade.");
                return 0;
        }
        else
        {
            System.out.println(name + " , You got an F.");
            return 'F';
        }//end else

    }//end Grade
}//end class


public class GradeTeller{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Grade grade = new Grade();
        System.out.println("Please enter your Name:");
        String name = scan.nextLine();
        System.out.println("Please enter your Grade: (0-100):");
        int result = scan.nextInt();
        System.out.println("Thank you " + name + ".\nFetching your Grade now.....");
        char gradeLetter = grade.findGrade(result, name);

        switch (gradeLetter)
        {
            case 'A':{
                System.out.println("Congratulations " + name);
            }break;//end case A

            case 'B':{
                System.out.println("Excellent " + name);
            }break;//end case B

            case 'C':{
                System.out.println("Well Done " + name);
            }break;//end case C
            case 'D':{
                System.out.println("Good Result " + name);
            }break;//end case D
            default :{
                System.out.println("You Failed " + name + ". Very Dissapointing");
            }break;//end default
        }//end switch

        System.out.println("Thank you for using the Grade Teller App. \nGoodbye.");
    }//end main
}//end class
