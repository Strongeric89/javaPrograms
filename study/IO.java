import java.util.Scanner;
public class IO{
  public static void main(String [] args)
  {
    Scanner Scanf = new Scanner(System.in);
    System.out.printf("Enter your name:\n");
    String name = Scanf.nextLine();

    System.out.printf("\tYou entered %s", name);

    System.out.println("Enter your age");
    int age = Scanf.nextInt();

    System.out.printf("\tYou entered %d", age);


  }//end main()
}//end class
