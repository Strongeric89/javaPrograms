/*the following program is for lab 2 Q 2 comput the following
-the volume
-surface area 
of a box 10cm x len 11.5cm X width 2.5cm


*/
public class vol{
	public static void main(String [] args)
	{
		float height = 10f;
		float length = 11.5f;
		float width = 2.5f;

		//volume is h X L x W
		float volume = 0.0f;
		volume = height * length * width;
		System.out.printf("The volume of the box is %.2f",volume); 
	}//end main()
	
}//end class