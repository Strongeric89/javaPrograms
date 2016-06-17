/*the following program is to print out a triangle using nested for loops*/
import java.util.Scanner;
public class projectTriangle{
	public static void main(String [] args)
	{
		Scanner scanf = new Scanner(System.in);
		int size = 10;
		int i,j,k,k1;
		char star = '*';

		for(i=0;i<size;i++)
		{
			for(j=i;j<size;j++)
			{
				System.out.print("*");
			}//end inner for
		System.out.println();
		}//end outter for

		System.out.println();
		//End of triangle 1

		for(i=size;i>=0;i--)
		{
			for(j=i;j<size;j++)
			{
				System.out.print("*");
			}//end inner for
		System.out.println();
		}//end outter for

		System.out.println();
		//end of triangle 2

		for( i=1;i<=size;i++)
			{
                		for( j=1;j<size-(i-1);j++)
				{
                    System.out.print(" ");
                }
                for(k=1;k<=i;k++){
                    System.out.print("*");
                    for(k1=1;k1<k;k1+=k){

                        System.out.print("*");
                    }
                }
                System.out.println();
            }



		System.out.println("HELLO dfkjdefkljasd;f kjsdalgjkhs;dkljgfhkl;juhd");
		System.out.println();

	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++)
		{
			System.out.print(star);
			if(i == 2 && j ==3)
				{
					star = 'X';
				}//end if
		else if(i == 4 && j ==4)
				{
					star = '*';
				}//end if

		}//end inner for
		System.out.println();
	}//end outter for


	}//end main
}//end class
