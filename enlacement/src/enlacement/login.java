package enlacement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.SystemColor;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.UIManager;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class login {

	JFrame frame;
	JTextField n;
	private JPasswordField p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 585, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENLACEMENT LOGIN");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		lblNewLabel.setBounds(154, 20, 243, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(64, 116, 120, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(64, 181, 120, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		n = new JTextField();
		n.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		n.setBounds(218, 120, 243, 33);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		comboBox.addItem("Student");
		comboBox.addItem("Company");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(218, 249, 243, 33);
		frame.getContentPane().add(comboBox);
		
		p = new JPasswordField();
		p.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		p.setBounds(218, 181, 243, 33);
		frame.getContentPane().add(p);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if ("Student".equals(comboBox.getSelectedItem()))
				{
					
					try
					{
						Class.forName("com.ibm.db2.jcc.DB2Driver");
						Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
						PreparedStatement ps=con.prepareStatement("select * from student_register where student_username=? and student_password=?");
						ps.setString(1,n.getText());
						ps.setString(2,p.getText());
						ResultSet rowsaffected=ps.executeQuery();
						if(rowsaffected.next())
						{
							StudentDashboard sp=new StudentDashboard(n.getText());
							sp.frame.setVisible(true);
							frame.dispose();
						}
						
						
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invalid Username or Password.");
						e.printStackTrace();
					}
					
				
				}
					
					else
					{
						try
						{
							Class.forName("com.ibm.db2.jcc.DB2Driver");
							Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
							PreparedStatement ps=con.prepareStatement("select * from company_register where company_username=? and company_password=?");
							ps.setString(1,n.getText());
							ps.setString(2,p.getText());
							ResultSet rowsaffected=ps.executeQuery();
							if(rowsaffected.next())
							{
								CompanyDashboard sp=new CompanyDashboard(n.getText());
								sp.frame.setVisible(true);
								frame.dispose();
							}
							
							
						}
						catch(Exception e)
						{
							JOptionPane.showMessageDialog(btnNewButton, "Invalid Username or Password.");
							e.printStackTrace();
						}
							
				}
			

				
				
			
			}
			
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnNewButton.setBounds(240, 304, 99, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Select :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(64, 252, 120, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard sp=new dashboard();
				sp.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton_1.setBounds(465, 20, 78, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
	}
}
