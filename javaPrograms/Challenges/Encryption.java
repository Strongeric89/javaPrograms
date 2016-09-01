import java.util.Scanner;
public class Encryption
{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Encryption-----------------------\n");
    System.out.println("Enter a word:");
    String word = scan.nextLine();
    System.out.println("Please enter a key:");
    int key = scan.nextInt();
    System.out.println("Plain-Text: " + word);
    //algorithm to encrypt the word
    int index = 0;
    System.out.print("Cypher-Text: ");

    for(int i =0;i<word.length();i++)
    {
      char ch = word.charAt(i);
      index = ch + key;
      System.out.printf("%c",index);
    }//end for
  }//end main
}//end class
