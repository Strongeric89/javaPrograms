import java.util.Scanner;
public class Eric{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        int userin;
        int num = 10;
        num = num + num;
        num ++;
        num = num + num;
        ++num;
        num++;
        num = num - (num);
        num= num + num;
        num = num * 10;

        System.out.println("int num = 10\nnum = num + num \nnum ++\nnum = num + num\n++num\nnum++\nnum = num - (num)\nnum= num + num\nnum = num * 10");
        System.out.println("\n possible answers: \n10 \n0 \n1 \n-1\n Other\nEnter your answer:");
        userin = scan.nextInt();

        if(userin == answer)
        {
            System.out.println("CORRECT!");
        }//end if
        else
        {
            System.out.println("INCORRECT!");
        }
        System.out.println(num);




    }//end main

}//end class
