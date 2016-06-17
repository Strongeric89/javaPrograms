import java.util.Scanner;
public class PrimVarApp {
	public static void main(String [] args)
	{
	Scanner scanf = new Scanner (System.in);
	int num = 10;
	boolean flag = true;
	float balance = 100.50f;
	double temperture = 11.45;
	char grade = 'A';
	short age = 27;
	long population = 500000000l;
	byte nibble = 5;


	long scale = 6000000000L;
	char letter = 'A';



	
System.out.println("the value of boolean is " + flag);
	System.out.println("the value of int is " + num);
	System.out.println("the value of float is " + balance);
	System.out.println("the value of double is " + temperture);
	System.out.println("the value of char is " + grade);
	System.out.println("the value of short is " + age);
	System.out.println("the value of long is " + population);
	System.out.println("the value of byte is " + nibble);

	System.out.println("Enter your Salary Please:");
	float grossSalary = scanf.nextFloat();
	
	int tax = 21;
	//get 21 percent of gross
	float totalTax = (grossSalary / 100) * tax;
	float netSalary = grossSalary - totalTax;
	System.out.println("My Salary is " + netSalary);
		
	}//end main()
}//end class