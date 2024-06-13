package metroticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METROTICKET {

	private JFrame frame;
	private JTextField TB1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTICKET window = new METROTICKET();
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
	public METROTICKET() {
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
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 11, 214, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(56, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(55, 91, 73, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(56, 141, 139, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER TICKET");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(56, 189, 145, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		TB1 = new JTextField();
		TB1.setBounds(230, 59, 99, 21);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MIYAPUR", "KPHB", "JBS"}));
		CB1.setBounds(230, 96, 89, 22);
		frame.getContentPane().add(CB1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 170, -9, 5);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MIIYAPUR", "KPHB", "JBS"}));
		CB2.setBounds(230, 140, 99, 22);
		frame.getContentPane().add(CB2);
		
		JComboBox CB3 = new JComboBox();
		CB3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3"}));
		CB3.setBounds(230, 190, 99, 16);
		frame.getContentPane().add(CB3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String name=TB1.getText();
			String source=(String) CB1.getSelectedItem();
			String destination=(String) CB2.getSelectedItem();
			String tickets=(String) CB3.getSelectedItem();
			int nt=Integer.parseInt(tickets);
			int bill=0;
			if(source.equals(destination))
			{
				JOptionPane.showMessageDialog(btnNewButton,"please check stations");
			}
			else
			{
				bill=bill+nt*45;
				JOptionPane.showMessageDialog(btnNewButton, "NAME :"+destination+"\n SOURCE :"+source+ "\n DESTINATION :"+destination+"\n NUMBER TICKETS :"+tickets+"\n AMOUNT :"+bill);
			}
			
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(175, 227, 121, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\14.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
