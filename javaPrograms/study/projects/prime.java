public class prime {
 public static void main(String [] args)
 {
  int i,j;
  System.out.println("Prime Numbers \n________________");
  for(i=2;i<100;i++)
  {
    for(j=2;j<i;j++)
    {
      if(i%j==0)
      {
      break;
      }//end if
    }//end  inner for
    if(i==j)
    {
      System.out.println("The number " + i + " is Prime ");
    }//end if
  }//end outter for
 }//end main()
}//end class
