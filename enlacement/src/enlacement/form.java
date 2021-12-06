package enlacement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Choice;
import javax.swing.DropMode;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class form {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form("null");
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
	public form(String n) {
		initialize(n);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String n) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		frame.setBounds(700, 300, 957, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
		lblNewLabel.setBounds(330, 10, 242, 83);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(83, 116, 117, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		textField.setBounds(216, 116, 368, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Year of Passing :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(421, 346, 149, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_2.setBounds(580, 344, 89, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CGPA of last year :");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(96, 346, 168, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_3.setBounds(274, 344, 89, 27);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Job Code :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(93, 153, 122, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		textField_1.setBounds(216, 158, 203, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("(from Job Details Table)");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(429, 156, 155, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Educational Details :");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(49, 220, 189, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Percentage :");
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(100, 270, 109, 27);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_4.setBounds(216, 271, 89, 27);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("10th :");
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(29, 270, 61, 27);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Board :");
		lblNewLabel_10.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(357, 270, 82, 27);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_6.setBounds(429, 273, 96, 27);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Year of Passing :");
		lblNewLabel_11.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(570, 270, 149, 27);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_7.setBounds(713, 272, 89, 27);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("12th :");
		lblNewLabel_12.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(29, 307, 50, 27);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Percentage :");
		lblNewLabel_13.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(99, 307, 107, 27);
		frame.getContentPane().add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_8.setBounds(216, 309, 89, 27);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Board :");
		lblNewLabel_14.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(357, 307, 62, 27);
		frame.getContentPane().add(lblNewLabel_14);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_9.setBounds(429, 309, 96, 27);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Year of Passing :");
		lblNewLabel_15.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(570, 307, 142, 27);
		frame.getContentPane().add(lblNewLabel_15);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField_10.setBounds(713, 308, 89, 27);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Technical Skills :");
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(49, 422, 189, 27);
		frame.getContentPane().add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea.setBounds(216, 422, 221, 119);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_16 = new JLabel("Extra Curricular :");
		lblNewLabel_16.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_16.setBounds(483, 422, 155, 27);
		frame.getContentPane().add(lblNewLabel_16);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textArea_1.setBounds(648, 427, 221, 119);
		frame.getContentPane().add(textArea_1);

		
		JButton btnNewButton = new JButton("APPLY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try
				{
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
					PreparedStatement ps=con.prepareStatement("insert into student_post values(?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1,textField.getText());
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_4.getText());
					ps.setString(4,textField_6.getText());
					ps.setString(5,textField_7.getText());
					ps.setString(6,textField_8.getText());
					ps.setString(7,textField_9.getText());
					ps.setString(8,textField_10.getText());
					ps.setString(9,textField_3.getText());
					ps.setString(10,textField_2.getText());
					ps.setString(11,textArea.getText());
					ps.setString(12,textArea_1.getText());
					int rowsaffected=ps.executeUpdate();
					if(rowsaffected==1)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Application successfully done");
						dashboard sp=new dashboard();
						sp.frame.setVisible(true);
						frame.dispose();
					}
					
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Application failed.");
					e.printStackTrace();
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		btnNewButton.setBounds(409, 590, 132, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				studentpost sp=new studentpost(n);
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton_1.setBounds(806, 23, 96, 42);
		frame.getContentPane().add(btnNewButton_1);
		
				
		
	}
}
