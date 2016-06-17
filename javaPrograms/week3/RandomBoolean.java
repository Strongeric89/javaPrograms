import java.util.*;
public class RandomBoolean{
    public static void main(String [] args)
    {
        boolean answer;
        char operators[]= {'+','-','*','/','<','>','!'};
        int random = (int)(Math.random() * operators.length);
        int operands[] = {1,2,3,4,5,6,7,8,9,10};
        int random1 = (int)(Math.random() * operands.length);
        System.out.printf("%d %c %d",operands[random1/2],operators[random],operands[random1]);

        //answer = operands[random1/2] operators[random] operands[random1];

    }//end main
}//end class
