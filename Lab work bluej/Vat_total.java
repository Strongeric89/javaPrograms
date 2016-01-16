import java.util.Scanner;
import java.text.DecimalFormat;
public class Vat_total
{
    public static void main(String [] args)
    {
        Scanner Scan = new Scanner (System.in);
        DecimalFormat precisionTwo = new DecimalFormat("0.00");
        double total = 0;
       
        System.out.print("Please enter the amount of the item :");
        total = Scan.nextDouble ();
       double vat_total = (total*23/100);
        System.out.print("The amount of tax on" + total + "is" + precisionTwo.format(vat_total));
        System.out.print("Therefore the cost price of the item is " + precisionTwo.format(total-vat_total));
    }
}
        
        
        
        