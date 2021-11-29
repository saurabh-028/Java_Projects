package internship_management_system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class show_internship extends JFrame {

	private JPanel contentPane;
	private JTextField Name;

	
	public static void main(String[] args) {
		new show_internship().setVisible(true);
	}

	
	public show_internship() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 916, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(106, 59, 125, 35);
		contentPane.add(lblNewLabel);
		
		Name = new JTextField();
		Name.setBounds(241, 61, 177, 35);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JTable table = new JTable();
		table.setBackground(Color.WHITE);
        table.setBounds(50, 220, 800, 210);
        contentPane.add(table);
        
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						
						String name = Name.getText();
						
						conn c = new conn();
						
						String str = "select name, internship, type, date, duration from internship where name = '"+name+"'";
						ResultSet rs = c.s.executeQuery(str);
						 table.setModel(DbUtils.resultSetToTableModel(rs));
		                                 
						
					}catch(Exception ep) {
						System.out.println("erron" + ep);
					}
						
						
					}
			
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(480, 59, 96, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 184, 74, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Internship");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(211, 184, 113, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Internship Type");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(370, 184, 132, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Joining Date");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(536, 184, 105, 26);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Duration");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(695, 184, 74, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1 = new JButton("Show All");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String name = Name.getText();
					
					conn c = new conn();
					
					String str = "select name, internship, type, date, duration from internship";
					ResultSet rs = c.s.executeQuery(str);
					 table.setModel(DbUtils.resultSetToTableModel(rs));
	                                 
					
				}catch(Exception ep) {
					System.out.println("erron" + ep);
				}
					
					
				}
				
			
		});
		btnNewButton_1.setBounds(621, 59, 96, 35);
		contentPane.add(btnNewButton_1);
	}

}
