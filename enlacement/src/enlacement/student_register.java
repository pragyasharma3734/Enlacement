package enlacement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;


import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class student_register {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_register window = new student_register();
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
	public student_register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 640, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 24));
		lblNewLabel.setBounds(177, 20, 236, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(78, 78, 152, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(78, 118, 152, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(78, 158, 123, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email id :");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(78, 198, 123, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile No. :");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(78, 239, 123, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DOB :");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(78, 279, 71, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("School :");
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(331, 279, 84, 30);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Course :");
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(78, 323, 152, 30);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField.setBounds(219, 78, 282, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_1.setBounds(219, 118, 282, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		passwordField.setBounds(219, 158, 282, 30);
		frame.getContentPane().add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_2.setBounds(219, 198, 282, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_3.setBounds(219, 239, 282, 30);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		comboBox.setBounds(416, 283, 84, 30);
		comboBox.addItem("SET");
		comboBox.addItem("SLAS");
		comboBox.addItem("SOA");
		comboBox.addItem("SOB");
		comboBox.addItem("SOD");
		comboBox.setSelectedItem(null);
		frame.getContentPane().add(comboBox);
		
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_4.setBounds(219, 327, 282, 30);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_5.setBounds(159, 283, 132, 30);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
					PreparedStatement ps=con.prepareStatement("insert into student_register values(?,?,?,?,?,?,?,?)");
					ps.setString(1,textField.getText());
					ps.setString(2,textField_1.getText());
					ps.setString(3,passwordField.getText());
					ps.setString(4,textField_2.getText());
					ps.setString(5,textField_3.getText());
					ps.setString(6,textField_5.getText());	
					ps.setString(7,(String) comboBox.getSelectedItem());
					ps.setString(8,textField_4.getText());
					int rowsaffected=ps.executeUpdate();
					if(rowsaffected==1)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Registration successfully done");
					}
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Registration failed.");
					e1.printStackTrace();
				}
				
				
			
				dashboard sp=new dashboard();
				sp.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnNewButton.setBounds(466, 367, 132, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select sp=new select();
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton_1.setBounds(535, 10, 81, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
