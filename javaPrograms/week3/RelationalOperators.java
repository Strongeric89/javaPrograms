/*The following program is to test relational operators*/
package com.eric;

class Test{
    public boolean operators(boolean call)
    {
        System.out.println(call);
        System.out.println("...but negated is " + !call);
        return call;
    }//end operators
}//end class


public class RelationalOperators{
    public static void main(String [] args)
    {
        int operands[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int random1 = (int)(Math.random() * operands.length);

        Test newTest = new Test ();
        System.out.printf("%d > 2\t",operands[random1]);
        newTest.operators(operands[random1/2]>2); //testing for greater than

        System.out.printf("%d < 2\t",operands[random1]);
        newTest.operators(operands[random1/2]<2); //testing for less than

        System.out.printf("%d == 2\t",operands[random1]);
        newTest.operators(operands[random1/2]==1);    //testing for equivelant

        System.out.printf("%d != 2\t",operands[random1]);
        newTest.operators(operands[random1/2]!=10);  //testing for not equal to

        System.out.printf("!true =\t",operands[random1]);
        newTest.operators(!true); //testing for not

        System.out.printf("%d >= 2\t",operands[random1]);
        newTest.operators(operands[random1/2]>= 33);    //testing for greater equal to

        System.out.printf("%d <= 2\t",operands[random1]);
        newTest.operators(operands[random1/2]<= 11);     //testing for less than equal to

    }//end main
}//end class
