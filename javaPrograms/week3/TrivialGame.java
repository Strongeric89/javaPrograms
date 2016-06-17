/*The following program is a trivial game on music*/
package com.eric;
import java.util.Scanner;
public class TrivialGame{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String bands[] = {"Metallica", "Led Zeppellin", "Pink FLoyd", "The Police", "Korn", "Linkin Park", "Limp Bizkit", "Papa Roach", "The Doors", "Def Leppard"};

        System.out.println("Please pick a band from the list below:");
        for(int i=0;i<bands.length; i++)
        {
            System.out.println((i+1)+ ". " +bands[i]);
        }//end for
        System.out.print("\nenter \"End\" to exit");

        String userChoice;
        int flag =0;


        while(flag ==0)
        {
            
            System.out.print("\nUser:");
            userChoice = scan.nextLine();
            //metallica option
            if(userChoice.equalsIgnoreCase("Metallica"))
            {
                System.out.println("Did you know:\n\tMetallica's Drummer's name is Lars Ulrich!");
            }//end if
            //Led Zeppellin
            if(userChoice.equalsIgnoreCase("Led Zeppellin"))
            {
                System.out.println("Did you know:\n\tLed Zeppelin's Drummer's name is John Bohnam!");
            }//end if
            //pink floyd
            if(userChoice.equalsIgnoreCase("Pink Floyd"))
            {
                System.out.println("Did you know:\n\tPink Floyd's Original Singer/guitarist Sid Barret and Keyboard Player Richard Wright are deseased.");
            }//end if
            //The Police
            if(userChoice.equalsIgnoreCase("The Police"))
            {
                System.out.println("Did you know:\n\tThe Police's Drummer's name is Steward Copeland");
            }//end if
            //Korn
            if(userChoice.equalsIgnoreCase("Korn"))
            {
                System.out.println("Did you know:\n\tLKorn's Singer Jonathan Davis plays the Bagpipes");
            }//end if
            //Linkin Park
            if(userChoice.equalsIgnoreCase("Linkin Park"))
            {
                System.out.println("Did you know:\n\tLinkin Park wrote the entire scores for all of the Transformer movies");
            }//end if
            //limp bizkit
            if(userChoice.equalsIgnoreCase("Limp Bizkit"))
            {
                System.out.println("Did you know:\n\tLimp bizkit's Guitarist Wes Borland, wears facepaint for every gig");
            }//end if
            //Papa Roach
            if(userChoice.equalsIgnoreCase("Papa Roach"))
            {
                System.out.println("Did you know:\n\tPapa Roach's front mans name is Jocoby Shadox");
            }//end if
            //the Doors
            if(userChoice.equalsIgnoreCase("The doors"))
            {
                System.out.println("Did you know:\n\tThe Door's Front man Jim Morrison died at the age of 27");
            }//end if
            //def Leppard
            if(userChoice.equalsIgnoreCase("Def Leppard"))
            {
                System.out.println("Did you know:\n\tDef Leppards Drummer Rick Allen, only has one arm");
            }//end if

            if(userChoice.equalsIgnoreCase("END"))
            {
                System.out.println("Thank you for playing!");
                flag =1;
            }//end if
            else {
                System.out.println("Not a valid Band.");
            }

        }//end while
    }//end main
}//end class
