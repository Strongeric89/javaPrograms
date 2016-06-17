/*the following program is for a gui based app! Guess the planet*/
package com.eric;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.Color;


public class GuessPlanet{
    public static void main(String [] args)
    {
        int score = 0;
        Random r = new Random();
        String planets[] = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
        String planetDetail[] = {
            ":_________ is the closest planet to the sun. \nAs such, it circles the sun faster than all the other planets, \nwhich is why Romans named it after the swift-footed messenger god Mercury.",
            "The surface is obscured by thick sulfuric acid clouds. \n_______ is the second planet from the Sun, \norbiting it every 224.7 Earth days. It has the longest \nrotation period (243 days) of any planet in the Solar System and \nrotates in the opposite direction to most other planets.",
            "________, our home, is the third planet from the sun. \nIt is the only planet known \nto have an atmosphere containing free oxygen, \noceans of liquid water on its surface, and, of course, life",
            "________ is the fourth planet from the sun. \nBefitting the red planet's bloody color, \nthe Romans named it after their god of war. \nThe Romans copied the ancient Greeks, \nwho also named the planet after their god of war, \nAres. Other civilizations also typically gave the planet names based on its color — \nfor example, the Egyptians named it \"Her Desher,\" meaning \"the red one,\" while ancient Chinese astronomers dubbed it \"the fire star\"",
             "________ is the largest planet in the solar system. \nFittingly, it was named after the king of the gods in Roman mythology. \nIn a similar manner, the ancient \nGreeks named the planet after Zeus, the king of the Greek pantheon.",
              "_________ is the sixth planet from the \nsun and the second largest planet in the solar system. ________ was the Roman name for Cronus, \nthe lord of the Titans in Greek \nmythology. ________ is the root of the English word \"Saturday.\"",
              "_________ is the seventh planet \nfrom the Sun. It's not visible to the naked eye, and became the first planet \ndiscovered with the use of a telescope. \n_________ is tipped over on its side with an axial tilt of 98 degrees.",
              "___________ is the eighth planet from the sun. \nIt was the first planet to get its existence predicted by mathematical \ncalculations before it was actually seen through a telescope on Sept. 23, 1846. \nIrregularities in the orbit of Uranus led French astronomer \nAlexis Bouvard to suggest that the gravitational pull from another celestial body might be responsible. German astronomer \nJohann Galle then relied on subsequent calculations to help spot ______ via telescope. Previously, astronomer Galileo Galilei sketched the planet, but he mistook it for a star due to \nits slow motion. In accordance with all the other planets seen in the sky, this new world was given a name from Greek and Roman mythology — \nNeptune, the Roman god of the sea.",
              "________ is the second closest dwarf planet to the Sun and from 1930 when it was discovered up until 2006, \nit was also considered the ninth planet of the solar system. \nIt is also the second largest dwarf planet, with Eris being the most massive known dwarf planet."
        };

        List<String> planetList = new ArrayList<String>(Arrays.asList(planets));
        List<String> planetListDet = new ArrayList<String>(Arrays.asList(planetDetail));
        int count = 0;

        String name = JOptionPane.showInputDialog(null, "enter your name:");
        UIManager.put("OptionPane.messageForeground", Color.RED);
        JOptionPane.showMessageDialog(null, "Guess the Planet...");
        String userInput="eric";

        int gameNumber = (r.nextInt(planetList.size()));
        while(!userInput.equalsIgnoreCase("End"))
        {
                JOptionPane.showMessageDialog(null, planetListDet.get(gameNumber));
                userInput = JOptionPane.showInputDialog(null, name + ": " );
                if(userInput.equalsIgnoreCase(planetList.get(gameNumber)))
                {
                    count = count + 1;
                    score = score + 10;
                    UIManager.put("OptionPane.messageForeground", Color.BLUE);
                    JOptionPane.showMessageDialog(null, "Well done 10 points!\n your score is " + score);
                    System.out.println(planetList.size() + " : " + gameNumber);
                    planetList.remove(gameNumber);
                    planetListDet.remove(gameNumber);
                    gameNumber = (r.nextInt(planetList.size()));
                }//end if
                else if(count == 9)
                {
                    break;
                }//end else
                else {
                    JOptionPane.showMessageDialog(null, "Wrong! Try Again!!");
                }//end else
                i++;
        }//end while
        JOptionPane.showMessageDialog(null, "GAME OVER! YOU WIN!");
    }//end main
}//end class
