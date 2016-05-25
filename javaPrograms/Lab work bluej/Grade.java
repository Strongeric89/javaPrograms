/**
 * Grade App
 * V 1.0
 * Eric Strong
 */

import java.util.Scanner;
public class Grade
{
    public static void main(String [] args)
    {
    Scanner Button = new Scanner (System.in);
    int i =0;
       
    do{
    System.out.print("please enter your result : ");
    int Mark = Button.nextInt ();
    
    if(Mark >=0 && Mark <40)
    {System.out.println("Your result is F (Fail)");}
    else if(Mark >39 && Mark <50)
    {System.out.println("Your result is D (Pass)");}
    else if(Mark >49 && Mark <60)
    {System.out.println("Your result is C (Pass)");}
    else if(Mark >59 && Mark <79)
    {System.out.println("your result is B (Pass)");}
    else if(Mark >79 && Mark <90)
    {System.out.println("your result is A (Pass)");}
    else if(Mark >89 && Mark <=100)
    {System.out.println("your result is A+ (Pass)");}
    else 
    {System.out.println("Please enter a number between 0-100 ");}
   
    System.out.println();
}
while(i<5);
}
}


