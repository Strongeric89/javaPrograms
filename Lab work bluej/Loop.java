import java.util.Scanner;
public class Loop
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int value = 5;
        String first = "Hello User, Enter your second name;";
        String name;
        System.out.println(first);
        name = scan.nextLine();
        
       while( value < 10){
           value = value + 1;
           System.out.print(name );
           System.out.println("");
        
    }
}
}
