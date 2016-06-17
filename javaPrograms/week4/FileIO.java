/*
*FILE IO EXAMPLE
*
*/
package com.eric;
import java.io.*;                               //MUST BE IMPORTED
import java.io.IOException;                     //MUST BE IMPORTED
public class FileIO{
    public static void main(String [] args) throws IOException
    {
        String name = "Hello Mr.Eric Strong! How are you today??";
        FileWriter outFile = new FileWriter("ericStrong.txt"); //creating the output file and location
        PrintWriter text = new PrintWriter(outFile); //creating a buffer

        text.println(name);
        //close the FILE
        text.close();
    }//end main
}//end class
