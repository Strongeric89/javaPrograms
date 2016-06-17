import java.io.Console;
public class UserPass{
   public static void main(String [] args)
   {
      Console con = System.console();
      String username = con.readLine("Enter your name:");
      String address = con.readLine("Enter your Address:");
      String password = con.readLine("Enter your Password:");
      //parsing is same as casting will convert the string into an int
      int phone = Integer.parseInt(con.readLine("Enter your Phone:"));
      int favNum = Integer.parseInt(con.readLine("Enter your fav num: "));

      //displaying the profile information
      System.out.println("\nName: " + username +"\nAddress: " + address + "\nPassword: " + password + "\nphone: " + phone + "\nFav Num: " + favNum);

   }//end main
}//end class
