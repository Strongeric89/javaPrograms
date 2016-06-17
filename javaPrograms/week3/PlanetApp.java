/*the following program is for a gui based app! Guess the planet*/
package com.eric;
import javax.swing.JOptionPane;

public class PlanetApp{
    public static void main(String [] args)
    {
        String planets[] = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};

        String name = JOptionPane.showInputDialog(null, "enter your name:");
        JOptionPane.showMessageDialog(null, planets);
        String userInput="eric";

        while(!userInput.equalsIgnoreCase("End"))
        {
            userInput = JOptionPane.showInputDialog(null, name + ". Enter a planet: ");

            if(userInput.equalsIgnoreCase(planets[0]))
            {
                JOptionPane.showMessageDialog(null, planets);
                JOptionPane.showMessageDialog(null, planets[0] + ":Mercury is the closest planet to the sun. \nAs such, it circles the sun faster than all the other planets, \nwhich is why Romans named it after the swift-footed messenger god Mercury.");
            }//end if

            else if(userInput.equalsIgnoreCase(planets[1]))
            {
                JOptionPane.showMessageDialog(null, planets[1
                ] + "The surface is obscured by thick sulfuric acid clouds. \nVenus is the second planet from the Sun, \norbiting it every 224.7 Earth days. It has the longest \nrotation period (243 days) of any planet in the Solar System and \nrotates in the opposite direction to most other planets.");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[2]))
            {
                JOptionPane.showMessageDialog(null, planets[2
                ] + "Earth, our home, is the third planet from the sun. \nIt is the only planet known \nto have an atmosphere containing free oxygen, \noceans of liquid water on its surface, and, of course, life");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[3]))
            {
                JOptionPane.showMessageDialog(null, planets[3
                ] + "Mars is the fourth planet from the sun. \nBefitting the red planet's bloody color, \nthe Romans named it after their god of war. \nThe Romans copied the ancient Greeks, \nwho also named the planet after their god of war, \nAres. Other civilizations also typically gave the planet names based on its color — \nfor example, the Egyptians named it \"Her Desher,\" meaning \"the red one,\" while ancient Chinese astronomers dubbed it \"the fire star\"");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[4]))
            {
                JOptionPane.showMessageDialog(null, planets[4
                ] + "Jupiter is the largest planet in the solar system. \nFittingly, it was named after the king of the gods in Roman mythology. \nIn a similar manner, the ancient \nGreeks named the planet after Zeus, the king of the Greek pantheon.");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[5]))
            {
                JOptionPane.showMessageDialog(null, planets[5
                ] + "Saturn is the sixth planet from the \nsun and the second largest planet in the solar system. Saturn was the Roman name for Cronus, \nthe lord of the Titans in Greek \nmythology. Saturn is the root of the English word \"Saturday.\"");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[6]))
            {
                JOptionPane.showMessageDialog(null, planets[6
                ] + "Uranus Facts. Uranus is the seventh planet \nfrom the Sun. It's not visible to the naked eye, and became the first planet \ndiscovered with the use of a telescope. \nUranus is tipped over on its side with an axial tilt of 98 degrees.");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[7]))
            {
                JOptionPane.showMessageDialog(null, planets[7
                ] + "Neptune is the eighth planet from the sun. \nIt was the first planet to get its existence predicted by mathematical \ncalculations before it was actually seen through a telescope on Sept. 23, 1846. \nIrregularities in the orbit of Uranus led French astronomer \nAlexis Bouvard to suggest that the gravitational pull from another celestial body might be responsible. German astronomer \nJohann Galle then relied on subsequent calculations to help spot Neptune via telescope. Previously, astronomer Galileo Galilei sketched the planet, but he mistook it for a star due to \nits slow motion. In accordance with all the other planets seen in the sky, this new world was given a name from Greek and Roman mythology — \nNeptune, the Roman god of the sea.");
            }//end else if

            else if(userInput.equalsIgnoreCase(planets[8]))
            {
                JOptionPane.showMessageDialog(null, planets[8
                ] + "Pluto Facts. \nPluto is the second closest dwarf planet to the Sun and from 1930 when it was discovered up until 2006, \nit was also considered the ninth planet of the solar system. \nIt is also the second largest dwarf planet, with Eris being the most massive known dwarf planet.");
            }//end else if

            else if(userInput.equalsIgnoreCase("End"))
            {
                JOptionPane.showMessageDialog(null, "thank you for playing the PlanetApp!");
                break;
            }//end else if

            else{
                JOptionPane.showMessageDialog(null, userInput + " is not a valide Planet");

            }//end else
        }//end while




    }//end main
}//end class
