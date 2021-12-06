package enlacement;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.SwingConstants;



import javax.swing.JButton;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;





public class company_view_applications {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					company_view_applications window = new company_view_applications("null");
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
	
	
	public company_view_applications(String n) {
		initialize(n);
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String n) {
		frame = new JFrame();
		frame.setBounds(700, 300, 1343, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student's Applications");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		lblNewLabel.setBounds(30, 25, 262, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 62, 262, 9);
		frame.getContentPane().add(separator);
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton_1.setBounds(572, 521, 106, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 153, 1266, 337);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//			},
//			new String[] {
//			}
//		));
		
		table.setModel(new MyTableModel(
				new String[][] {
				},
				new Object[] {
				}
			));
		
		
		table.setDefaultRenderer(Object.class,new MultipleLine());
		table.setShowVerticalLines(true);
		table.setShowHorizontalLines(true);
		table.setRowHeight(100);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JButton btnNewButton = new JButton("Show Applications");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					login lg=new login();
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con=DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:sslConnection=true;","jpj69369","tVphJ3Gbi6Fvqraj");
					PreparedStatement ps=con.prepareStatement("select student_post.* from company_post inner join student_post on student_post.job_code=company_post.job_code where company_post.company_username= ?");
					ps.setString(1,n);
					ResultSet rs=ps.executeQuery();
					table.setModel(resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		btnNewButton.setBounds(528, 69, 182, 34);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				CompanyDashboard sp=new CompanyDashboard(n);
				sp.frame.setVisible(true);
				frame.dispose();
				
			}
		});
	}
	
	 
	
	TableModel resultSetToTableModel(ResultSet rs) {
		try {
		    ResultSetMetaData metaData = rs.getMetaData();
		    int numberOfColumns = metaData.getColumnCount();
		    Vector<String> columnNames = new Vector<String>();

		    // Get the column names
		    for (int column = 0; column < numberOfColumns; column++) {
			columnNames.addElement(metaData.getColumnLabel(column + 1));
		    }

		    // Get all rows.
		    Vector<Vector<Object>> rows = new Vector<Vector<Object>>();

		    while (rs.next()) {
			Vector<Object> newRow = new Vector<Object>();
			for (int i = 1; i <= numberOfColumns; i++) {
			    	newRow.addElement(rs.getObject(i));
			    
			}

			rows.addElement(newRow);
		    }

		    return new DefaultTableModel(rows, columnNames);
		} catch (Exception e) {
		    e.printStackTrace();

		    return null;
		}
	    }
}
