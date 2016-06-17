/*Deans extra home work */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Cars{
    public static void main(String [] args)
    {
        String euro = "\u20ac";
        int flag = 0;
        Scanner scan = new Scanner (System.in);
        String carsSports [] = {"Chevrolet Corvette","Jaguar F-type","Porshe Cayman","Alfa Romeo 4C","Audi TT","Audi TT RS","BMW Z4","Lotus Evora 400","Mercedes-AMG SLC43","Mercedes-Benz SLC-class"};
        float pricesSports[] = {65000,165000,85650,67495,52825,43825,67345,90000,50695,48875};

        String motorBike[] = {"Victory Octane","BMW R 1200 RS","Honda NM4","Suzuki GSX-S1000ABS","Aprilia Tuono V4 1100 RR ABS","Indian Scout","Harley Davidson Sportster Forty-Eight","Honda Africa Twin","Suzuki Hayabusa 1340","Suzuki Burgman"};
        float bikePrices[] = {110499,14950,10999,10499,14799,11299,11199,12999,14599,14599};

        String famCars[] = {"SEAT Leon Hatchback","Skoda Octavia Hatchback","KIA Cee'd Hatchback","Hyundai i30 Hatchback","Citreon C4 Picasso MPV","volkswagen Golf Hatchback","Ford B-MAX mini MPV","Skoda Superb hatchback","Vauxhall Astra Hatchback","Mazda3 Hatchback"};
        float famPrices[] = {24695,27990,24295,23695,27660,27785,19545,35165,23520,23995};

        System.out.println("Enter your balance: (Euro)");
        float balance = scan.nextFloat();
        System.out.println("You balance is " + balance + " Euro");
        System.out.println("What is your preference?\n1.Sports Cars\n2.Motorbikes\n3.Family Cars");
        int userOption = scan.nextInt();
        switch(userOption)
        {
            case 1 : {
                System.out.println("You picked Sports Cars.");
                System.out.println("----------------------------------");
                System.out.println("Record|\tPrice|\tModel|");
                for(int i=0;i<pricesSports.length;i++)
                {
                    if(pricesSports[i] <= balance)
                    {
                        System.out.println((i+1) + ".\t"+ pricesSports[i] + "\t" + carsSports[i]);
                        flag = 0;
                    }//end if
                    if(balance < pricesSports[i])
                    {
                        flag = 1;
                    }//end if
                }//end for
            }break;

            case 2 : {
                System.out.println("You picked Motorbikes.");
                System.out.println("----------------------------------");
                System.out.println("Record|\tPrice|\tModel|");
                for(int i=0;i<bikePrices.length;i++)
                {
                    if(bikePrices[i] <= balance)
                    {
                        System.out.println((i+1) + ".\t"+ bikePrices[i] + "\t" + motorBike[i]);
                        flag = 0;

                    }//end if
                    if(balance < pricesSports[i])
                    {
                        flag = 1;
                    }//end if

                }//end for

            }break;

            case 3 : {
                System.out.println("You picked Family Cars.");

                System.out.println("----------------------------------");
                System.out.println("Record|\tPrice|\tModel|");
                for(int i=0;i<famPrices.length;i++)
                {
                    if(famPrices[i] <= balance)
                    {
                        System.out.println((i+1) + ".\t"+ famPrices[i] + "\t" + famCars[i]);
                        flag = 0;
                    }//end if
                    if(balance < pricesSports[i])
                    {
                        flag = 1;
                    }//end if
                }//end for

            }break;

            default : {
                System.out.println("Not a valid option.");
            }break;
        }//end switch
        if(flag ==1)
        {
            System.out.println("We have no other options for the value " + balance);
        }//end if
    }//end main
}//end classcls
