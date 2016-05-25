import java.util.Scanner;
public class Passwords
{
    public static void main(String [] args)
    {
        Scanner Scan = new Scanner (System.in);
        String [] username = {"admin1", "admin2", "admin3"};
        String [] password = {"pass1", "pass2", "pass3"};
        System.out.print("Please enter one of the following Usernames;");
        String userinput = Scan.nextLine();
        System.out.print("Please enter a password;");
        String userpass = Scan.nextLine();
        if(userinput== username[0] && userpass == password[0]){
            System.out.println("ACCESS GRANTED");}
            else if(userinput== username[1] && userpass == password[1]){
            System.out.println("ACCESS GRANTED");}
            else if(userinput== username[2] && userpass == password[2]){
            System.out.println("ACCESS GRANTED");}
            else{
                System.out.println("ACCESS DENIED. YOU DID NOT ENTER A VALID USERNAME OR PASSWORD. PLEASE TRY AGAIN");}
        }
    }
