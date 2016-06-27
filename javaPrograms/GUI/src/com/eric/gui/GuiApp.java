package com.eric.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GuiApp extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnReverse;
	private JTextField textField_1;
	private JButton btnTransfere;

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
					GuiApp frame = new GuiApp();
					// ENTER NEW CODE HERE
					frame.setTitle("String Reverser");
					frame.setVisible(true);
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
	public GuiApp()
	{
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(GuiApp.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		setFont(new Font("Lucida Handwriting", Font.PLAIN, 17));
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null); // ADDED THIS
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setBounds(10, 43, 268, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnClearText = new JButton("Clear");
		btnClearText.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// this is where the code will be executed if the button is
				// clicked
				textField.setText("");

			}
		});
		btnClearText.setBounds(293, 43, 89, 26);
		contentPane.add(btnClearText);

		btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StringBuilder str = new StringBuilder(textField.getText());

				str.reverse();

				textField.setText(str.toString());

			}
		});
		btnReverse.setBounds(293, 11, 89, 23);
		contentPane.add(btnReverse);

		JLabel lblEnterAWord = new JLabel("Enter a word:");
		lblEnterAWord.setFont(new Font("Segoe Script", Font.PLAIN, 18));
		lblEnterAWord.setBounds(10, 15, 229, 17);
		contentPane.add(lblEnterAWord);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 80, 268, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		btnTransfere = new JButton("Transfere");
		btnTransfere.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StringBuilder str = new StringBuilder(textField.getText());
				textField_1.setText(str.toString());
			}
		});
		btnTransfere.setBounds(293, 82, 89, 23);
		contentPane.add(btnTransfere);
	}
}
