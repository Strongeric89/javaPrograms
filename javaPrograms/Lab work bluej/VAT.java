import java.util.Scanner;
import java.text.DecimalFormat;
public class VAT
{
    public static void main(String [] args)
    {
        Scanner Scan = new Scanner (System.in);
        DecimalFormat DF = new DecimalFormat("0.00");
        double sale_price= 0;
       int vat = 23;
       double total = sale_price - vat;

       System.out.print("How much was the TV . Euro ");
       sale_price = Scan.nextDouble();
       System.out.println("23% of " +sale_price+ " = "+ (sale_price/(100+vat)/100));
       //System.out.print("The cost price for the tv is " + DF.format(total));
    
}
 }       