import java.util.Scanner;
public class TESST
{
    public static void main(String [] args)
    {
        Scanner Scan = new Scanner (System.in);
        int mark;
        int i = 0;
        do{System.out.print("Please enter your result to get your grade:");
            mark= Scan.nextInt();
            if(mark>0 || mark<40){
                System.out.println("You got an F (fail)");}
                else if(mark >39 && mark<101){
                    System.out.println("Well done you passed the exam");}
                }
                while(i<5);
            }
        }
