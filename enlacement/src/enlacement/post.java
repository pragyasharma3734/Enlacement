package enlacement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;


import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class post {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					post window = new post("null");
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
	public post(String n) {
		initialize(n);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String n) {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(700, 300, 867, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME...");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 26));
		lblNewLabel.setBounds(38, 21, 309, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(167, 233, -53, -85);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_1 = new JLabel("Provide the following job details to make a post :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(38, 73, 575, 58);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Job Description :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(124, 306, 157, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Required Skills :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(124, 446, 151, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Last Date to Apply :");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(124, 602, 171, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Emailid :");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(124, 190, 129, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_1.setBounds(318, 444, 268, 99);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea.setBounds(318, 304, 268, 130);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_2.setBounds(318, 188, 268, 22);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_3.setBounds(318, 601, 198, 22);
		frame.getContentPane().add(textArea_3);
		
		JLabel lblNewLabel_6 = new JLabel("Username :");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(124, 148, 157, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_4.setBounds(319, 148, 267, 22);
		frame.getContentPane().add(textArea_4);
		
		JLabel lblNewLabel_7 = new JLabel("Minimum Package :");
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(124, 562, 171, 22);
		frame.getContentPane().add(lblNewLabel_7);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_5.setBounds(318, 564, 198, 22);
		frame.getContentPane().add(textArea_5);
		
		JLabel lblNewLabel_8 = new JLabel("LPA");
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(526, 564, 46, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("No. of Vaccancies :");
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(124, 272, 171, 22);
		frame.getContentPane().add(lblNewLabel_9);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_6.setBounds(318, 272, 46, 22);
		frame.getContentPane().add(textArea_6);
		
		JLabel lblNewLabel_10 = new JLabel("Position :");
		lblNewLabel_10.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(124, 233, 129, 22);
		frame.getContentPane().add(lblNewLabel_10);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(367, 233, -44, 22);
		frame.getContentPane().add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_8.setBounds(318, 233, 268, 22);
		frame.getContentPane().add(textArea_8);
		
		JLabel lblNewLabel_11 = new JLabel("Job Code :");
		lblNewLabel_11.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(124, 640, 151, 22);
		frame.getContentPane().add(lblNewLabel_11);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_9.setBounds(318, 642, 198, 22);
		frame.getContentPane().add(textArea_9);
		
		JButton btnNewButton = new JButton("POST");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
					PreparedStatement ps=con.prepareStatement("insert into company_post values(?,?,?,?,?,?,?,?,?)");
					ps.setString(1,textArea_4.getText());
					ps.setString(2,textArea_2.getText());
					ps.setString(3,textArea_8.getText());
					ps.setString(4,textArea_6.getText() );
					ps.setString(5, textArea.getText());
					ps.setString(6, textArea_1.getText());
					ps.setString(7,textArea_5.getText() );
					ps.setString(8, textArea_3.getText());
					ps.setString(9,textArea_9.getText());
					int rowsaffected=ps.executeUpdate();
					if(rowsaffected==1)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Post successfully made.");
						CompanyDashboard sp=new CompanyDashboard(n);
						sp.frame.setVisible(true);
						frame.dispose();
					}
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Post failed.");
					e1.printStackTrace();
				}
						
				
			}
			});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton.setBounds(714, 654, 85, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CompanyDashboard sp=new CompanyDashboard(n);
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton_1.setBounds(714, 21, 85, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
	}
}
