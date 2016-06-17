/*the following program is the flow chart if else charts*/
import java.util.Scanner;
public class Flow{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        //PART1
        System.out.println("Left or Right?");
        String LR = scan.nextLine();

        if(LR.equals("Left") || LR.equals("left"))
        {
            System.out.println("1 or 2?");
            int oneTwo = scan.nextInt();
            if(oneTwo ==1)
            {
                System.out.println("X or Y?");
                char XY = scan.next(".").charAt(0);
                if(XY =='X' || XY=='x')
                {
                    System.out.println("YOU GOT 1!!");
                }//end X

                if(XY =='Y' || XY == 'y')
                {
                    System.out.println("Oranges or Apples");
                    String OA = scan.nextLine();
                    if(OA.equals("Orange") || OA.equals("orange"))
                    {
                        System.out.println("YOU GOT 2!");
                    }//end orange
                    else if(OA.equals("Apple") || (OA.equals("apple")))
                    {
                        System.out.println("YOU GOT 3!");
                    }//end Apple
                }//end Y

            }//end one
            else if(oneTwo ==2)
            {
                System.out.println("Up or Down?");
                String uD2 = scan.nextLine();
                if(uD2.equals("Up") || uD2.equals("up"))
                {
                    System.out.println("YOU GOT 4!");
                }//end up
                else if(uD2.equals("Down") || uD2.equals("down"))
                {
                    System.out.println("10 or 20?");
                    int TT = scan.nextInt();
                    if(TT ==10)
                    {
                        System.out.println("YOU GOT 5!!");
                    }//end 10
                    else if(TT ==20)
                    {
                        System.out.println("YOU GOT 6!!");
                    }//end 20

                }//end down
            }//end 2
        }//end LEFT


//-------------------------------------------------------------------------------
        else if(LR.equals("Right") || LR.equals("right"))
        {
            System.out.println("Yes or No?");
            String YN = scan.nextLine();
            if(YN.equals("Yes") || YN.equals("yes"))
            {

                System.out.println("Up or Down?");
                String uD1 = scan.nextLine();
                if(uD1.equals("up") || uD1.equals("Up"))
                {
                    System.out.println("YOU GOT 4!");
                }//end up
                else if(uD1.equals("Down") || uD1.equals("down"))
                {
                    System.out.println("10 or 20?");
                    int TT = scan.nextInt();
                    if(TT ==10)
                    {
                        System.out.println("YOU GOT 5!!");
                    }//end 10
                    else if(TT ==20)
                    {
                        System.out.println("YOU GOT 6!!");
                    }//end 20

                }//end down

            }//end yes
            else if(YN.equals("No") || YN.equals("no"))
            {

                System.out.println("United or Liverpool");
                String ansUL = scan.nextLine();
                if(ansUL.equals("United") || ansUL.equals("united"))
                {
                    System.out.println("Cat or Dog?");
                    String ansCD = scan.nextLine();
                    if(ansCD.equals("Dog") || ansCD.equals("dog"))
                    {
                        System.out.println("YOU GET 6!!");
                    }//end dog
                    else if(ansCD.equals("Cat") || ansCD.equals("cat"))
                    {
                        System.out.println("YOU GET 7!!");
                    }//end cat
                }//end United
                else if(ansUL.equals("Liverpool") || ansUL.equals("liverpool"))
                {
                    System.out.println("Water or Milk?");
                    String ansWM = scan.nextLine();
                    if(ansWM.equals("Water") || ansWM.equals("water"))
                    {
                        System.out.println("YOU GET 8!!");
                    }//end water
                    else if(ansWM.equals("Milk") || ansWM.equals("milk"))
                    {
                        System.out.println("YOU GET 9!!");
                    }//end milk
                }//end else Liverpool

            }//end No
        }//end RIGHT


    }//end main
}//end class
