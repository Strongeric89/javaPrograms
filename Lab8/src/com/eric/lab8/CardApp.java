package com.eric.lab8;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CardApp extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField suit;
	private JTextField cardtype;

	/**
	 * Launch the application.
	 */

	// HashSet for cards
	public static HashSet<Card> cards = new HashSet<Card>();

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					CardApp frame = new CardApp();
					frame.setVisible(true);
					frame.setTitle("Card App Generator");
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
	public CardApp()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		suit = new JTextField();
		suit.setBounds(210, 52, 86, 20);
		contentPane.add(suit);
		suit.setColumns(10);

		JLabel lblSuit = new JLabel("SUIT:");
		lblSuit.setBounds(139, 55, 46, 14);
		contentPane.add(lblSuit);

		cardtype = new JTextField();
		cardtype.setBounds(210, 83, 86, 20);
		contentPane.add(cardtype);
		cardtype.setColumns(10);

		JLabel lblCard = new JLabel("CARD:");
		lblCard.setBounds(139, 86, 46, 14);
		contentPane.add(lblCard);

		JButton btnGenerate = new JButton("GENERATE");
		btnGenerate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				// when button is clicked create a card and add to the list
				String suitName = suit.getText();
				String typeName = cardtype.getText();

				if (suitName.equalsIgnoreCase("hearts") || suitName.equalsIgnoreCase("clubs")
						|| suitName.equalsIgnoreCase("diamonds") || suitName.equalsIgnoreCase("spades"))
				{
					if (typeName.equalsIgnoreCase("ace") || typeName.equalsIgnoreCase("1")
							|| typeName.equalsIgnoreCase("2") || typeName.equalsIgnoreCase("3")
							|| typeName.equalsIgnoreCase("4") || typeName.equalsIgnoreCase("5")
							|| typeName.equalsIgnoreCase("6") || typeName.equalsIgnoreCase("6")
							|| typeName.equalsIgnoreCase("7") || typeName.equalsIgnoreCase("8")
							|| typeName.equalsIgnoreCase("9") || typeName.equalsIgnoreCase("10")
							|| typeName.equalsIgnoreCase("jack") || typeName.equalsIgnoreCase("queen")
							|| typeName.equalsIgnoreCase("king"))
					{

						Card c1 = new Card(suitName, typeName);
						// add to the list of cards
						cards.add(c1);

						// clearing the boxes
						suit.setText("");
						cardtype.setText("");
						System.out.println("card created");
					} // end inner if
				} // end if

				else
				{
					System.out.println("not a valid type or suit");
					suit.setText("");
					cardtype.setText("");
				}

			}
		});
		btnGenerate.setBounds(139, 128, 180, 42);
		contentPane.add(btnGenerate);

		JButton btnPrintOutAll = new JButton("PRINT OUT ALL CARDS");
		btnPrintOutAll.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				// print out all of the cards
				Iterator i = cards.iterator();
				System.out.println("-----------Printing Cards-----------");
				while (i.hasNext())
				{
					System.out.println(i.next());
				}

			}
		});
		btnPrintOutAll.setBounds(139, 194, 180, 42);
		contentPane.add(btnPrintOutAll);
	}
}
