package com.eric.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class EricAndYomiMachine extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblYouWon;
	private JTextField textField_3;
	private JTextField textField_4;
	private int spent = 0;
	private int jack = 0;

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
					EricAndYomiMachine frame = new EricAndYomiMachine();
					frame.setVisible(true);
					frame.setTitle("Eric and Yomi's blackjack game");
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
	public EricAndYomiMachine()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 77));
		textField.setBounds(10, 28, 128, 116);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 77));
		textField_1.setBounds(148, 28, 138, 116);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 77));
		textField_2.setBounds(296, 28, 128, 115);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton_1 = new JButton("Go Fish");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int score = 0;
				String array1[] = { "A", "7", "1", "2", "B", "2", "C" };

				Random r = new Random();

				// How to get the random character

				int rand1 = r.nextInt(5);
				int rand2 = r.nextInt(5);
				int rand3 = r.nextInt(5);

				textField.setText(array1[rand1]);
				String b1 = array1[rand1];
				textField_1.setText(array1[rand2]);
				String b2 = array1[rand2];
				textField_2.setText(array1[rand3]);
				String b3 = array1[rand3];

				textField_3.setText("€ " + ++spent);

				if(b1.equals(b2) && b1.equals(b3))
				{
					score = score + 1;
				} // end if

				if(score == 1)
				{
					JOptionPane.showMessageDialog(null, "Congrats you won the jackpot!");
					jack = jack + 10;
					textField_4.setText("€ " + jack++);
				}

			}
		});
		btnNewButton_1.setBounds(10, 155, 414, 96);
		contentPane.add(btnNewButton_1);

		lblNewLabel = new JLabel("You Spent:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 262, 96, 31);
		contentPane.add(lblNewLabel);

		lblYouWon = new JLabel("You won:");
		lblYouWon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYouWon.setBounds(252, 270, 86, 14);
		contentPane.add(lblYouWon);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(10, 297, 106, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(252, 296, 106, 38);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
