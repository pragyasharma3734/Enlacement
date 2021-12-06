package enlacement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class CompanyDashboard {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyDashboard window = new CompanyDashboard("null");
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
	public CompanyDashboard(String n) {
		initialize(n);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String n) {
		frame = new JFrame();
		frame.setBounds(700, 300, 588, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPANY DASHBOARD");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel.setBounds(153, 11, 272, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Make A Post");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				post sp=new post(n);
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton_1.setBounds(212, 93, 157, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Student Application");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				company_view_applications sp=new company_view_applications(n);
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton_2.setBounds(188, 158, 200, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dashboard sp=new dashboard();
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.setBounds(212, 221, 157, 37);
		frame.getContentPane().add(btnNewButton);
	}
}
