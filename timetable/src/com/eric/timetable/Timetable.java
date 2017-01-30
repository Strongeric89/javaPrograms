package com.eric.timetable;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Timetable
{
	public static HashMap<Integer, String> mapMonday = new HashMap<Integer, String>();
	public static HashMap<Integer, String> mapTuesday = new HashMap<Integer, String>();
	public static HashMap<Integer, String> mapWednesday = new HashMap<Integer, String>();
	public static HashMap<Integer, String> mapThursday = new HashMap<Integer, String>();
	public static HashMap<Integer, String> mapFriday = new HashMap<Integer, String>();
	public static String[] namesOfDays =
	{ "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public static void main(String[] args)
	{

		int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		Date today = new Date();
		int hour = (int) today.getHours();

		day = day - 1;

		switch (day)
		{
		case 1:
		{
			// monday
			// call mondayMap
			System.out.println("Monday");
			if (hour < 9 || hour > 18)
			{
				break;
			}
			populateTimeTable(day, hour);
			getEntry(hour);

		}
			break;

		case 2:
		{
			// tuesday
			// call tueMap
			System.out.println("Tuesday");
			if (hour < 9 || hour > 18)
			{
				System.out.println("no classes");
				break;
			}
			populateTimeTable(day, hour);

		}
			break;

		case 3:
		{
			// wedneday
			// call wedMap
			System.out.println("Wednesday");
			if (hour < 9 || hour > 18)
			{
				System.out.println("no classes");
				break;
			}
			populateTimeTable(day, hour);

		}
			break;

		case 4:
		{
			// thursday
			// call thurMap
			System.out.println("Thursday");
			if (hour < 9 || hour > 18)
			{
				System.out.println("no classes");
				break;
			}
			populateTimeTable(day, hour);

		}
			break;

		case 5:
		{
			// friday
			// call friMap
			System.out.println("Friday");
			if (hour < 9 || hour > 18)
			{
				System.out.println("no classes");
				break;
			}
			populateTimeTable(day, hour);

		}
			break;

		default:
		{
			// no classes
			System.out.println("no classes");
		}
			break;

		}// end switch

	}// end main

	public static String populateTimeTable(int flag, int key)
	{
		if (flag == 1)
		{
			mapMonday.put(9, "9-10. Free");
			mapMonday.put(10, "10-11. Networking - Annex 3022");
			mapMonday.put(11, "11-12. Free");
			mapMonday.put(12, "12-13. Free");
			mapMonday.put(13, "13-14. Networking - Annex 3010");
			mapMonday.put(14, "14-15. Free");
			mapMonday.put(15, "15-16. Maths - Annex 3020");
			mapMonday.put(16, "16-17. Networking - Lab AU1005");
			mapMonday.put(17, "17-18. Networking - Lab AU1005");

			System.out.println("You are now in:  " + mapMonday.get(key));
			System.out.println("Your next class is: " + mapMonday.get(key + 1));

			return "You are now in:  " + mapMonday.get(key) + "\nYour next class is: " + mapMonday.get(key + 1);
		}

		else if (flag == 2)
		{
			mapTuesday.put(9, "9--10. DataBases - Annex 3011");
			mapTuesday.put(10, "10-11. Java - Main G025");
			mapTuesday.put(11, "11-12. Java - Annex 3025");
			mapTuesday.put(12, "12-13. Free");
			mapTuesday.put(13, "13-14. DataBases - Annex 3021");
			mapTuesday.put(14, "14-15. Free");
			mapTuesday.put(15, "15-16. HCI - Main b034");
			mapTuesday.put(16, "16-17. HCI - Lab Annex 3005");
			mapTuesday.put(17, "17-18. HCI - Lab Annex 3005");

			System.out.println("You are now in:  " + mapTuesday.get(key));
			System.out.println("Your next class is: " + mapTuesday.get(key + 1));
			return "You are now in:  " + mapTuesday.get(key) + "\nYour next class is: " + mapTuesday.get(key + 1);

		}

		else if (flag == 3)
		{
			mapWednesday.put(9, "9--10. Free");
			mapWednesday.put(10, "10-11. Maths - Main G028");
			mapWednesday.put(11, "11-12. WebDevelopment - Annex 3020");
			mapWednesday.put(12, "12-13. WebDevelopment - Annex 3020");
			mapWednesday.put(13, "13-14. Free");
			mapWednesday.put(14, "14-15. Free");
			mapWednesday.put(15, "15-16. Free");
			mapWednesday.put(16, "16-17. Free");
			mapWednesday.put(17, "17-18. Free");

			System.out.println("You are now in:  " + mapWednesday.get(key));
			System.out.println("Your next class is: " + mapWednesday.get(key + 1));
			return "You are now in:  " + mapWednesday.get(key) + "\nYour next class is: " + mapWednesday.get(key + 1);

		}

		else if (flag == 4)
		{
			mapThursday.put(9, "9--10. Free");
			mapThursday.put(10, "10-11. Java - Annex  g027");
			mapThursday.put(11, "11-12. Java - Lab Annex 3005");
			mapThursday.put(12, "12-13. Java - Lab Annex 3005");
			mapThursday.put(13, "13-14. Internship Main G007");
			mapThursday.put(14, "14-15. WebDevelopment - Lab Annex 3005");
			mapThursday.put(15, "15-16. WebDevelopment - Lab Annex 3005");
			mapThursday.put(16, "16-17. HCI - Annex 3023");
			mapThursday.put(17, "17-18. Free");

			System.out.println("You are now in:" + mapThursday.get(key));
			System.out.println("Your next class is: " + mapThursday.get(key + 1));

			return "You are now in:  " + mapThursday.get(key) + "\nYour next class is: " + mapThursday.get(key + 1);

		}

		else if (flag == 5)
		{
			mapFriday.put(9, "9--10. Free");
			mapFriday.put(10, "10-11. Maths - Annex 3022");
			mapFriday.put(11, "11-12. DataBases - Lab Annex 3008");
			mapFriday.put(12, "12-13. DataBases - Lab Annex 3008");
			mapFriday.put(13, "13-14. Free");
			mapFriday.put(14, "14-15. Free");
			mapFriday.put(15, "15-16. Free");
			mapFriday.put(16, "16-17. Free");
			mapFriday.put(17, "17-18. Free");

			System.out.println("You are now in:  " + mapFriday.get(key));
			System.out.println("Your next class is: " + mapFriday.get(key + 1));

			return "You are now in:  " + mapFriday.get(key) + "\nYour next class is: " + mapFriday.get(key + 1);

		}

		else
		{
			System.out.println("No Classes");
			return "nothing";
		}
	}// end

	// ptt
}// end class
