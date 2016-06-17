import java.util.Properties;		//importing the Properties library
import java.util.Enumeration;		//importing the enumeration library

public class Dtest {
	public static void main(String[] args)
	{
		Properties props = System.getProperties(); //calling the properties function props and system call of get properties
		Enumeration keys = props.propertyNames();  //calling the numeration keys and from system calls property names
		
		while(keys.hasMoreElements()) //while there are elements......
		{
			String key = keys.nextElement().toString(); //take the next element,convert to string and store to key string variable
			String value = props.getProperty(key);		//value is assigned by get property
			System.out.println(key + " = " + value);	//printing to screen the name and value
		}//end while
	}//end main()
}//end class