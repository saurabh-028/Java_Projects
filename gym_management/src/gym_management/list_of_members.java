package gym_management;

import java.awt.*;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class list_of_members extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblid;


	
	
	public list_of_members() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,50 , 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 210, 1170, 520);
		contentPane.add(table);
		
		
		JLabel lblNewLabel = new JLabel("LIST OF MEMBERS");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER); 
		lblNewLabel.setBounds(307, 0, 581, 112);
		contentPane.add(lblNewLabel);
		
		
		lblid = new JLabel("Id");
		lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblid.setBounds(41, 173, 1139, 23);
		contentPane.add(lblid);
		
		JButton btnNewButton = new JButton("show");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					conn c4 = new conn();
					
					String str = "select * from member ";
					ResultSet rs = c4.stm.executeQuery(str);
					table.setModel(DbUtils.resultSetToTableModel(rs));     
					
				}catch(Exception ep) {
					System.out.println("erron" + ep);
				}
					
				
			}
		});
		btnNewButton.setBounds(556, 105, 90, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(133, 173, 1047, 23);
		contentPane.add(lblName);
		
		JLabel lblFathername = new JLabel("Address");
		lblFathername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFathername.setBounds(241, 173, 939, 23);
		contentPane.add(lblFathername);
		
		JLabel lblFather = new JLabel("Father Name");
		lblFather.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFather.setBounds(335, 173, 845, 23);
		contentPane.add(lblFather);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobile.setBounds(448, 173, 732, 23);
		contentPane.add(lblMobile);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(556, 173, 624, 23);
		contentPane.add(lblEmail);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAmount.setBounds(661, 173, 519, 23);
		contentPane.add(lblAmount);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTime.setBounds(1090, 173, 90, 23);
		contentPane.add(lblTime);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAge.setBounds(778, 173, 402, 23);
		contentPane.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(866, 173, 314, 23);
		contentPane.add(lblGender);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(981, 173, 199, 23);
		contentPane.add(lblDate);
		
		
	}
	public static void main(String[] args) {
		new list_of_members().setVisible(true);
	}
}
