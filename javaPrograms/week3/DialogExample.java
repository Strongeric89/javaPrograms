/*the following program is my first jOption Pane example using dialog boxes*/
package com.eric;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class DialogExample{
    public static void main(String [] args)
    {
        //System.out.println("My first Dialog box!");
        String userName;
        UIManager.put("OptionPane.messageForeground", Color.RED);
        userName = JOptionPane.showInputDialog(null, "Enter Name:");

        //
        System.out.println(userName);

        JOptionPane.showMessageDialog(null,"Hello " + userName);
    }//end main
}//end class
