/*The following program is to use a switch case*/
package com.eric;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class exSwitchJOP{

    public static String enter(){
        Scanner scan = new Scanner (System.in);
        String userInput = JOptionPane.showInputDialog(null, "Enter a Month:");

        return userInput;
    }

    public static void main(String [] args)
    {
        String userInput =exSwitchJOP.enter();
        switch(userInput){

            case "January":
            case "january": {
                JOptionPane.showMessageDialog(null, "you entered january:" + userInput);
            }break;//end case 1

            case "February":
            case "february": {
                JOptionPane.showMessageDialog(null, "you entered february: " + userInput);
            }break;//end case 2

            case "March":
            case "march": {
                JOptionPane.showMessageDialog(null, "you entered March: " + userInput);
            }break;//end case 3

            case "April":
            case "april": {
            JOptionPane.showMessageDialog(null, "you entered april : " + userInput);
            }break;//end case 4

            case "May":
            case "may": {
                JOptionPane.showMessageDialog(null, "you entered may: " + userInput);
            }break;//end case 5

            case "June":
            case "june": {
                JOptionPane.showMessageDialog(null, "you entered june: " + userInput);
            }break;//end case 6

            case "July":
            case "july": {
                JOptionPane.showMessageDialog(null, "you entered July: " + userInput);
            }break;//end case 7

            case "August":
            case "august": {
                JOptionPane.showMessageDialog(null, "you entered August: " + userInput);
            }break;//end case 8

            case "September":
            case "september": {
                JOptionPane.showMessageDialog(null, "you entered Septermber :  " + userInput);
            }break;//end case 9

            case "October":
            case "october": {
                JOptionPane.showMessageDialog(null, "you entered October: " + userInput);
            }break;//end case 10

            case "November":
            case "november": {
            JOptionPane.showMessageDialog(null, "you entered November: " + userInput);
            }break;//end case 11

            case "December":
            case "december": {
                JOptionPane.showMessageDialog(null, "you entered December: " + userInput);
            }break;//end case 12

            default: {
                JOptionPane.showMessageDialog(null, userInput + " is not a valid month");
            }break;//end default

        }//end switch
    }//end main()
}//end class
