package shoestore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class shoes {
    int item =0;
    int amount=0;
	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shoes window = new shoes();
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
	public shoes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SHOE STORE");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(45, 35, 133, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\images (3).jfif"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				item=item+1;
				amount=amount+4000;
				tb1.setText(""+item);
				tb2.setText(""+amount);
				
			}
		});
		btnNewButton.setBounds(22, 120, 124, 159);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				item=item+1;
				amount=amount+5999;
				tb1.setText(""+item);
				tb2.setText(""+amount);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\510f37fb7fbcfc79014a780f96699f2e.jpg"));
		btnNewButton_1.setBounds(236, 145, 124, 153);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				item=item+1;
				amount=amount+8999;
				tb1.setText(""+item);
				tb2.setText(""+amount);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\images (4).jfif"));
		btnNewButton_2.setBounds(432, 126, 133, 153);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("RS 4000/-");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(51, 290, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RS 5999/-");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(272, 302, 64, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("8999/-");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(492, 284, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ITEMS");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_4.setBounds(271, 21, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(342, 19, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("AMOUNT");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_5.setBounds(250, 63, 66, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb2 = new JTextField();
		tb2.setBounds(342, 61, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\360_F_571060336_lRFo9ZoUUYDzcKb6dHKMs8unl2TM98rr.jpg"));
		lblNewLabel_6.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lblNewLabel_6);
	}

}
