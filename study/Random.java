
//random name picker

import java.util.*;
public class Random{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner (System.in);
    int flag =0;
    //String array of names
    String names[] = {"Zach", "Franklin", "Abayomi",
				"Abdeldjallel", "Pat", "Paddy",
				"Josh", "Gordon", "Craig", "Neil",
				"Tomas", "George", "Gerard",
				"Emanuel", "Jason", "Peter",
				"Eric", "Jamie"};

    int random = (int)(Math.random() * names.length);
    //int randNum = (int)(Math.random() * students.length);
    while(flag == 0)
    {
      random = (int)(Math.random() *names.length);
      System.out.println("Question for " + names[random]);
      System.out.println("press enter to generate another name...");
      scan.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }//end while

  }//end main
}//end class
