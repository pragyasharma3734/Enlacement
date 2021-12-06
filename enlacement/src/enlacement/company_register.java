package enlacement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;

public class company_register {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					company_register window = new company_register();
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
	public company_register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 619, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Company Registration");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 26));
		lblNewLabel.setBounds(154, 10, 306, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Company Name :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(75, 95, 164, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(75, 147, 164, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(75, 199, 164, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField.setBounds(249, 99, 287, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_1.setBounds(249, 147, 289, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
					PreparedStatement ps=con.prepareStatement("insert into company_register values(?,?,?)");
					ps.setString(1,textField.getText());
					ps.setString(2,textField_1.getText());
					ps.setString(3,passwordField.getText());
					int rowsaffected=ps.executeUpdate();
					if(rowsaffected==1)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Registration successfully done");
					}
					
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Registration failed.");
					e.printStackTrace();
				}
								
				dashboard sp=new dashboard();
				sp.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnNewButton.setBounds(405, 269, 131, 42);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		passwordField.setBounds(250, 201, 286, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				select sp=new select();
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton_1.setBounds(512, 10, 83, 35);
		frame.getContentPane().add(btnNewButton_1);
	}

}
