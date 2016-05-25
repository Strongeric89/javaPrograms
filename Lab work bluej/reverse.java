import java.util.Scanner;
public class reverse
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        String original, reverse = "";
        System.out.println("Enter a String to reverse;");
        original=in.nextLine ();
        int length = original.length ();
        for (int i = length-1;i>=0;i--)
        reverse = reverse + original.charAt(i);
        
        System.out.println("Reverse of entered string is:" + reverse);
    }
}
