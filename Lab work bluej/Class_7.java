import java.util.Scanner;
public class Class_7
{
    public static void main (String [] args)
    {
        Scanner Scan= new Scanner (System.in);
          boolean END=false;
        String [] name = new String [100];
        String [] dob = new String [100];
        String [] number = new String [100];
        int position = 0;
        
      do
      {
          System.out.print("Enter name: ");
        name [position] = Scan.nextLine();
        
         System.out.print("Enter Date of Birth: ");
        dob [position]= Scan.nextLine();
        
         System.out.print("Enter Phone number: ");
         number[position] = Scan.nextLine();
         
         System.out.println(name [position] + "added to database");
         System.out.println();
         
         if(name [position].equals("end") || name[position].equals("END"))
         {
             END= true;
            }
            else
            {
                position ++;
            }
        }
          while (END==false);
            
            for(int count=0; count<=position-1; count ++)
            {
                System.out.println("Record #" + count + ":" + name[count] + " " + dob[count] + " "+ number[count]);
            }
        }
    }

        
    


       


       
    
        
        
        