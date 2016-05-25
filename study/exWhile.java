public class exWhile {
  public static void main(String [] args)
  {
    boolean flag = true;
    String name = "Eric\n";
    int value = 0;
    while(value < 5)
    {
      if(value % 2 ==1)
      {
        System.out.print(name);
      }//end if
      else
      {
          System.out.print("\t" + name);
      }//end else
      value ++;
    }//end while

  }//end main()
}//end class
