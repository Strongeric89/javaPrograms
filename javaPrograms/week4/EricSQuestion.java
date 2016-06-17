public class EricSQuestion{
    public static void main(String [] args)
    {
    char stringletter = 'a';

        switch(stringletter)
        {
            case "A":
            System.out.println("you picked A");
            break;

            case "a" :
            System.out.println("you picked a");
            break;

            case "Aa":
            System.out.println("you picked a/A");
            break;

            default :
            System.out.println("error");
            break;
        }//end switch
    }//end main()
}//end class
/*
What is the output?
A - A
B - a
C - Aa
D - A a Aa
E - output error
F - compiler error


*/
