package mticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieticket {

	protected static final int yes = 0;
	protected static final int no = 0;
	protected static final int cancle = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(111, 11, 206, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(52, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(52, 92, 55, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TOTAL TICKETS");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(28, 135, 116, 18);
		frame.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\pic01.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(154, 54, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KALKI", "KGF ", "SALAR", "RRR"}));
		cb1.setBounds(154, 88, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4"}));
		cb2.setBounds(154, 131, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets =(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill =0;
				if(movie.equals("KALKI"))
				{
					bill=bill+nt*200;
				}
				if(movie.equals("KGF"))
				{
					bill=bill+nt*200;
				}
				if(movie.equals("SALAR"))
				{
					bill=bill+nt*200;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME:"+name+"\nMOVIE"+movie+"\nTICKETS"+tickets+"\nAMOUNT"+bill);
				if(res==yes)
				{
					JOptionPane.showMessageDialog(btnNewButton, "TICKETS CONIFRMED");
				}
				else if(res==cancle)
				
				{
					JOptionPane.showMessageDialog(btnNewButton, "TICKETS CANCELED");
				}
        		else
				{
					int res2=0;
					JOptionPane.showConfirmDialog(btnNewButton, "are you sure do you want to cancle");	
					if(res2==yes)
					{
						JOptionPane.showMessageDialog(btnNewButton, "TICKETS CANCELED");
					}
					else if (res2==no)
					{
						JOptionPane.showMessageDialog(btnNewButton, "try again");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "TICKETS CANCELED");
					}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(154, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	
	}
}
