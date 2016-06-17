/*the following program is lab 2 Q 3 calculate the area of a circle
radius is 4.8;
pi is 3.14
*/
public class areaCircle{
	public static void main(String [] args)
	{
		float radius = 4.8f;
		float rSQ = radius * radius;
		float pi = 3.14f;
		//area of a circle is pi X r ^2
		float areaCircle = pi * rSQ;
		System.out.printf("The area of a circle is %f", areaCircle);
	}//end main()

}//end class
