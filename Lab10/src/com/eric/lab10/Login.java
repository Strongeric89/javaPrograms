package com.eric.lab10;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame
{

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

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
					Login frame = new Login();
					frame.setVisible(true);
					frame.setTitle("Please Authenticate");
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
	public Login()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(98, 71, 87, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(98, 96, 87, 14);
		contentPane.add(lblPassword);

		JLabel lblPasswordConfirm = new JLabel("Password Confirm:");
		lblPasswordConfirm.setBounds(98, 123, 131, 14);
		contentPane.add(lblPasswordConfirm);

		textField1 = new JTextField();
		textField1.setBounds(239, 68, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setBounds(239, 93, 86, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);

		textField3 = new JTextField();
		textField3.setBounds(239, 120, 86, 20);
		contentPane.add(textField3);
		textField3.setColumns(10);

		JButton passwordCheckBtn = new JButton("Check Passwords");
		passwordCheckBtn.setForeground(Color.RED);
		passwordCheckBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				// Check passwordsBtn
				String username = textField1.getText();
				String password1 = textField2.getText();
				String password2 = textField3.getText();

				Authentication a1 = new Authentication(password1, password2);

				// do the checks
				JOptionPane.showMessageDialog(null, a1.passwordCheck());
				System.out.println(a1.passwordCheck());

				// part 3 - create the actual password
				if (a1.passwordCheck().equalsIgnoreCase("PASSWORD"))
				{
					// create the new password
					Password p1 = new Password(username, password1, password1.length());

					// print p1
					JOptionPane.showMessageDialog(null, p1);
					System.out.println(p1);
				}

			}// end actionListener
		});
		passwordCheckBtn.setBounds(98, 171, 227, 38);
		contentPane.add(passwordCheckBtn);
	}
}
