package com.eric.mytimetable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//logic
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyTimetable extends JFrame
{

	// structures
	public HashMap<Integer, String[]> mapMonday = new HashMap<Integer, String[]>();
	public HashMap<Integer, String[]> mapTuesday = new HashMap<Integer, String[]>();
	public HashMap<Integer, String[]> mapWednesday = new HashMap<Integer, String[]>();
	public HashMap<Integer, String[]> mapThursday = new HashMap<Integer, String[]>();
	public HashMap<Integer, String[]> mapFriday = new HashMap<Integer, String[]>();
	public String[] namesOfDays =
	{ "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MyTimetable frame = new MyTimetable();
					frame.setVisible(true);
					// Setting the title of the jframe
					frame.setTitle("Eric's Timetable App");

				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}

			private Image createImage(String string)
			{
				// TODO Auto-generated method stub
				return null;
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyTimetable()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// sizes of the frame
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// change this line tothe below so we can easily design our frame.
		// (null)
		contentPane.setLayout(null);

		setContentPane(contentPane);

		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(305, 146, 104, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(305, 200, 104, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(176, 146, 104, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(176, 200, 104, 20);
		contentPane.add(textField_4);

		JLabel lblClassNow = new JLabel("Class Now");
		lblClassNow.setBounds(175, 130, 105, 14);
		contentPane.add(lblClassNow);

		JLabel lblClassNext = new JLabel("Class Next");
		lblClassNext.setBounds(304, 130, 105, 14);
		contentPane.add(lblClassNext);

		JLabel lblRoomNow = new JLabel("Room Now");
		lblRoomNow.setBounds(175, 186, 105, 14);
		contentPane.add(lblRoomNow);

		JLabel lblClassNext_1 = new JLabel("Class Next");
		lblClassNext_1.setBounds(304, 186, 105, 14);
		contentPane.add(lblClassNext_1);

		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// add code in here

				String toCut = null;
				String buttonDisplay = null;
				String text1Display = null;
				String text2Display = null;
				String text3Display = null;
				String text4Display = null;
				String nowDisplay = null;
				String nextDisplay = null;
				String week1 = null;
				String mins = null;

				int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
				Date today = new Date();
				int hour = (int) today.getHours();
				int min = (int) today.getMinutes();
				int week = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);

				nowDisplay = "" + hour + ".00";
				nextDisplay = "" + (hour + 1) + ".00";
				week1 = "" + (week - 3);
				// min = Math.abs(min - 60);
				// mins = "" + min;

				day = day - 1;

				switch (day)
				{
				case 1:
				{
					// monday
					// call mondayMap

					if (hour < 8 || hour >= 18)
					{
						buttonDisplay = "no classes";
						break;
					}

					toCut = populateTimeTable(day, hour, min, week);

					String words[] = new String[4];
					int i = 0;
					for (String word : toCut.split("-"))
					{
						words[i] = word;
						i++;
					}
					text1Display = words[0];
					text2Display = words[1];
					text3Display = words[2];
					text4Display = words[3];

					// to get the remaining minutes per class
					// min = Math.abs(min - 60);
					// mins = "" + min;
					// off set of week 4, we start back in 4th week of the year
					week = week - 3;

					buttonDisplay = "Remaining Mins: " + min;

				}
					break;

				case 2:
				{
					// tuesday
					// call tueMap

					if (hour < 8 || hour >= 18)
					{

						buttonDisplay = "no classes";
						break;
					}

					toCut = populateTimeTable(day, hour, min, week);

					String words[] = new String[4];
					int i = 0;
					for (String word : toCut.split("-"))
					{
						words[i] = word;
						i++;
					}
					text1Display = words[0];
					text2Display = words[1];
					text3Display = words[2];
					text4Display = words[3];

					// to get the remaining minutes per class
					// min = Math.abs(min - 60);
					// mins = "" + min;
					// off set of week 4, we start back in 4th week of the year
					week = week - 3;
					week1 = "" + week;

					buttonDisplay = "Remaining Mins: " + min;

				}
					break;

				case 3:
				{
					// wedneday
					// call wedMap

					if (hour < 9 || hour >= 18)
					{
						buttonDisplay = "no classes";

						break;
					}
					toCut = populateTimeTable(day, hour, min, week);

					String words[] = new String[4];
					int i = 0;
					for (String word : toCut.split("-"))
					{
						words[i] = word;
						i++;
					}
					text1Display = words[0];
					text2Display = words[1];
					text3Display = words[2];
					text4Display = words[3];

					// to get the remaining minutes per class
					// min = Math.abs(min - 60);
					// mins = "" + min;
					// off set of week 4, we start back in 4th week of the year
					week = week - 3;
					week1 = "" + week;

					buttonDisplay = "Remaining Mins: " + min;

				}
					break;

				case 4:
				{
					// thursday
					// call thurMap

					if (hour < 8 || hour >= 18)
					{
						buttonDisplay = "no classes";

						break;
					}
					toCut = populateTimeTable(day, hour, min, week);

					String words[] = new String[4];
					int i = 0;
					for (String word : toCut.split("-"))
					{
						words[i] = word;
						i++;
					}
					text1Display = words[0];
					text2Display = words[1];
					text3Display = words[2];
					text4Display = words[3];

					// to get the remaining minutes per class
					// min = Math.abs(min - 60);
					// mins = "" + min;
					// off set of week 4, we start back in 4th week of the year
					week = week - 3;
					week1 = "" + week;

					buttonDisplay = "Remaining Mins: " + min;

				}
					break;

				case 5:
				{
					// friday
					// call friMap

					if (hour < 8 || hour >= 18)
					{
						buttonDisplay = "no classes";

						break;
					}
					toCut = populateTimeTable(day, hour, min, week);

					String words[] = new String[4];
					int i = 0;
					for (String word : toCut.split("-"))
					{
						words[i] = word;
						i++;
					}
					text1Display = words[0];
					text2Display = words[1];
					text3Display = words[2];
					text4Display = words[3];

					// to get the remaining minutes per class
					// min = Math.abs(min - 60);
					// mins = "" + min;
					// off set of week 4, we start back in 4th week of the year
					week = week - 3;
					week1 = "" + week;

					// buttonDisplay = "Remaining Mins: " + min;

				}
					break;

				default:
				{

					buttonDisplay = "No Classes";
					text1Display = "no classes";
					text2Display = "no classes";
					text3Display = "no classes";
					text4Display = "no classes";

				}
					break;

				}// end switch

				/*
				 * MAIN PART TO BE DISPLAYED
				 */

				min = Math.abs(min - 60);
				mins = "" + min;

				textField_1.setText(text3Display);
				textField_2.setText(text4Display);
				textField_3.setText(text1Display);
				textField_4.setText(text2Display);
				textField_5.setText(nextDisplay);
				textField_6.setText(nowDisplay);
				textField_7.setText(week1);
				textField_8.setText(mins);

			}// end onclick

			public String populateTimeTable(int flag, int key, int min, int week)
			{

				if (flag == 1)
				{
					// each field must have 4 indexes - current class - room,
					// next class = room
					mapMonday.put(8, new String[]
					{ "No class", "No class" });
					mapMonday.put(9, new String[]
					{ "Networking", "Annex 3022" });
					mapMonday.put(10, new String[]
					{ "Networking", "Annex 3022" });
					mapMonday.put(11, new String[]
					{ "Networking lab A", "AU 1005" });
					mapMonday.put(12, new String[]
					{ "Networking lab A", "AU 1005" });
					mapMonday.put(13, new String[]
					{ "free", "free" });
					mapMonday.put(14, new String[]
					{ "Free", "Free" });
					mapMonday.put(15, new String[]
					{ "Maths", "Annex 3020" });
					mapMonday.put(16, new String[]
					{ "Networking", "Lab AU1005 (group B/C)" });
					mapMonday.put(17, new String[]
					{ "Networking", "Lab AU1005(group B/C)" });
					mapMonday.put(18, new String[]
					{ "Finished", "Home" });

					// class room
					return mapMonday.get(key)[0] + "-" + mapMonday.get(key)[1] + "-" + mapMonday.get(key + 1)[0] + "-"
							+ mapMonday.get(key + 1)[1];
				}

				else if (flag == 2)
				{
					mapTuesday.put(8, new String[]
					{ "no class", "no class" });
					mapTuesday.put(9, new String[]
					{ "DataBases", "Annex 3011" });
					mapTuesday.put(10, new String[]
					{ "Java", "Annex G025" });
					mapTuesday.put(11, new String[]
					{ "Java", "Annex 3021" });
					mapTuesday.put(12, new String[]
					{ "Free", "Free" });
					mapTuesday.put(13, new String[]
					{ "DataBases", "Annex 3021" });
					mapTuesday.put(14, new String[]
					{ "Free", "Free" });
					mapTuesday.put(15, new String[]
					{ "HCI", "Main B034" });
					mapTuesday.put(16, new String[]
					{ "HCI", "Lab AU1006" });
					mapTuesday.put(17, new String[]
					{ "HCI", "Lab AU1006" });
					mapTuesday.put(18, new String[]
					{ "Finished", "No Class" });

					// class room
					return mapTuesday.get(key)[0] + "-" + mapTuesday.get(key)[1] + "-" + mapTuesday.get(key + 1)[0]
							+ "-" + mapTuesday.get(key + 1)[1];

				}

				else if (flag == 3)
				{
					mapWednesday.put(8, new String[]
					{ "no class", "no class" });
					mapWednesday.put(9, new String[]
					{ "Free", "Free" });
					mapWednesday.put(10, new String[]
					{ "Maths", "Annex G028" });
					mapWednesday.put(11, new String[]
					{ "Web Development", "Annex 3020" });
					mapWednesday.put(12, new String[]
					{ "Web Development", "Annex 3020" });
					mapWednesday.put(13, new String[]
					{ "Internship", "Main B034" });
					mapWednesday.put(14, new String[]
					{ "Free", "Free" });
					mapWednesday.put(15, new String[]
					{ "Free", "Free" });
					mapWednesday.put(16, new String[]
					{ "free", "free" });
					mapWednesday.put(17, new String[]
					{ "free", "free" });
					mapWednesday.put(18, new String[]
					{ "Finished", "No class" });

					// class room
					return mapWednesday.get(key)[0] + "-" + mapWednesday.get(key)[1] + "-"
							+ mapWednesday.get(key + 1)[0] + "-" + mapWednesday.get(key + 1)[1];

				}

				else if (flag == 4)
				{
					mapThursday.put(8, new String[]
					{ "no class", "no class" });
					mapThursday.put(9, new String[]
					{ "Free", "Free" });
					mapThursday.put(10, new String[]
					{ "Java", "Annex  G027" });
					mapThursday.put(11, new String[]
					{ "Java", "Lab Annex 3008" });
					mapThursday.put(12, new String[]
					{ "Java", "Lab Annex 3008" });
					mapThursday.put(13, new String[]
					{ "Internship", "Main G007" });
					mapThursday.put(14, new String[]
					{ "Web Development", "Lab Annex 3005" });
					mapThursday.put(15, new String[]
					{ "Web Development", "Lab Annex 3005" });
					mapThursday.put(16, new String[]
					{ "HCI", "Annex 3023" });
					mapThursday.put(17, new String[]
					{ "Free", "Free" });
					mapThursday.put(18, new String[]
					{ "finished", "no class" });

					// class room
					return mapThursday.get(key)[0] + "-" + mapThursday.get(key)[1] + "-" + mapThursday.get(key + 1)[0]
							+ "-" + mapThursday.get(key + 1)[1];

				}

				else if (flag == 5)
				{
					mapFriday.put(8, new String[]
					{ "no class", "no class" });
					mapFriday.put(9, new String[]
					{ "Free", "Free" });
					mapFriday.put(10, new String[]
					{ "Maths", "Annex 3022" });
					mapFriday.put(11, new String[]
					{ "DataBases", "Lab Annex 1016" });
					mapFriday.put(12, new String[]
					{ "DataBases", "Lab Annex 1016" });
					mapFriday.put(13, new String[]
					{ "Free", "Free" });
					mapFriday.put(14, new String[]
					{ "Free", "Free" });
					mapFriday.put(15, new String[]
					{ "Free", "Free" });
					mapFriday.put(16, new String[]
					{ "Free", "Free" });
					mapFriday.put(17, new String[]
					{ "Free", "Free" });
					mapFriday.put(18, new String[]
					{ "finished", "no class" });

					// class room
					return mapFriday.get(key)[0] + "-" + mapFriday.get(key)[1] + "-" + mapFriday.get(key + 1)[0] + "-"
							+ mapFriday.get(key + 1)[1];

				}

				else
				{

					return "No Classes";
				}
			}// endfuncion

		});
		btnClickMe.setBackground(Color.YELLOW);
		btnClickMe.setBounds(10, 145, 145, 75);
		contentPane.add(btnClickMe);

		JLabel lblDtcSemester = new JLabel("DT211C/2 Semester 2 Timetable");
		lblDtcSemester.setBounds(10, 11, 191, 14);
		contentPane.add(lblDtcSemester);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
				Date today = new Date();
				int hour = (int) today.getHours();
				int min = (int) today.getMinutes();
				int week = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);

				String nowDisplay = "" + hour + ".00";
				String nextDisplay = "" + (hour + 1) + ".00";
				String week1 = "" + (week - 3);
				min = Math.abs(min - 60);
				String mins = "" + min;

				day = day - 1;

				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText(nextDisplay);
				textField_6.setText(nowDisplay);
				textField_7.setText(week1);
				textField_8.setText(mins);

			}
		});
		btnClear.setBackground(Color.YELLOW);
		btnClear.setBounds(10, 49, 145, 75);
		contentPane.add(btnClear);

		JLabel lblNow = new JLabel("NOW");
		lblNow.setBounds(176, 79, 46, 14);
		contentPane.add(lblNow);

		JLabel lblNext = new JLabel("NEXT");
		lblNext.setBounds(306, 79, 46, 14);
		contentPane.add(lblNext);

		JLabel lblWeek = new JLabel("WEEK:");
		lblWeek.setBounds(306, 27, 46, 14);
		contentPane.add(lblWeek);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(305, 99, 104, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(176, 99, 104, 20);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(305, 49, 104, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(176, 48, 104, 20);
		contentPane.add(textField_8);

		JLabel lblRemainingMins = new JLabel("Remaining Mins:");
		lblRemainingMins.setBounds(176, 27, 104, 14);
		contentPane.add(lblRemainingMins);
	}

}
