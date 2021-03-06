package com.eric.lab6;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyFirstGUI extends JFrame
{
	public static int counter = 0; // counter to indicate number of clicks

	// PART 2
	private JPanel contentPane;
	private JTextField textField;
	// private JLabel label1;

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
					// PART 1
					MyFirstGUI frame = new MyFirstGUI();
					frame.setVisible(true);
					// adding size function
					frame.setSize(500, 500);
					frame.setTitle("my First Gui");
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstGUI()
	{

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// change this line to null
		// contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton pushButton1 = new JButton("Counter Button");
		pushButton1.setBackground(Color.GREEN);
		pushButton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				System.out.println("Button pushed: " + (counter + 1));
				pushButton1.setText(" " + (counter + 1));

				// adding a new object to the text pane
				textField.setText("you pressed the button: " + (counter + 1));
				counter++;

			}
		});
		pushButton1.setBounds(97, 48, 237, 47);
		contentPane.add(pushButton1);

		textField = new JTextField();
		textField.setBounds(95, 106, 237, 103);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel label1 = new JLabel("number of times button pressed:");

		label1.setBounds(10, 11, 176, 14);
		contentPane.add(label1);

		JButton reset = new JButton("reset");
		reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// event for reset button
				counter = 0;
				System.out.println("The counter was reset back to 0");
				// PART 3
				JOptionPane.showMessageDialog(null, "The counter has gone back to " + counter);

			}
		});
		reset.setBounds(97, 220, 89, 23);
		contentPane.add(reset);

		JRadioButton radioButtonFile = new JRadioButton("optionA");
		radioButtonFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// event for radiobutton
				JOptionPane.showMessageDialog(null, "You selected option A ");

			}
		});
		radioButtonFile.setBounds(213, 7, 109, 23);
		contentPane.add(radioButtonFile);

		JButton btnFile = new JButton("File");
		btnFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// event for FileButton

				// creating file object
				try
				{
					String display = "";
					ReadApp file1 = new ReadApp("roles.txt");
					file1.readFile();
					String lines[] = file1.getFileContents();

					for (int i = 0; i < lines.length; i++)
					{

						display += lines[i];

					}
					textField.setText(display);

				} catch (IOException e1)
				{

					System.out.println("file not found");
				}

			}
		});
		btnFile.setBounds(245, 220, 89, 23);
		contentPane.add(btnFile);

		JRadioButton rdbtnOptionb = new JRadioButton("optionB");
		rdbtnOptionb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// event for option b
				JOptionPane.showMessageDialog(null, "you selected option B");
			}
		});
		rdbtnOptionb.setBounds(325, 7, 109, 23);
		contentPane.add(rdbtnOptionb);

	}
}
