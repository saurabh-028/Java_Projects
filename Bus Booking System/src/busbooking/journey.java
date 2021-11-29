package busbooking;

import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class journey extends JFrame {

	public JPanel contentPane;
	public String buscode ;
	String jny_time ;
	String source ;
	String dest;
        JTable table;
       
	public static void main(String[] args) {
		
		new journey();
	}

	public journey() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 701, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Source");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(27, 50, 111, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblDestinatio = new JLabel("Destination");
		lblDestinatio.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDestinatio.setBounds(326, 50, 127, 35);
		contentPane.add(lblDestinatio);
		
		
		 String[] item = {"Mumbai", "Ahmadnagar", "Thane", "Kalyan", "Aurangabad", "Pune", "Surat", ""};
		JComboBox comboBox_1 = new JComboBox(item);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mumbai", "Ahmadnagar", "Thane", "Kalyan", "Aurangabad", "Pune", "Surat"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setBounds(475, 51, 157, 35);
		contentPane.add(comboBox_1);
		
                JTable table = new JTable();
                table.setBounds(50, 220, 550, 210);
                
                contentPane.add(table);
                
		
		JButton btnNewButton = new JButton("SHOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				
				String dst = (String) comboBox_1.getSelectedItem();
				
				conn c = new conn();
				
				String str = "select * from bus where  dest = '"+dst+"'";
				ResultSet rs = c.s.executeQuery(str);
				 table.setModel(DbUtils.resultSetToTableModel(rs));
                                 
				
			}catch(Exception ep) {
				System.out.println("erron" + ep);
			}
				
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(267, 121, 111, 35);
		contentPane.add(btnNewButton);
		
		JLabel prn = new JLabel("Prn");
		prn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prn.setBounds(60, 193, 75, 20);
		contentPane.add(prn);
		
               JLabel capacity = new JLabel("capacity");
		capacity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		capacity.setBounds(267, 190, 111, 20);
		contentPane.add(capacity);
                
                JLabel bustime = new JLabel("Bus time");
		bustime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bustime.setBounds(161, 190, 111, 20);
		contentPane.add(bustime);
	
		
		
                
                JLabel source = new JLabel("Source");
		source.setFont(new Font("Tahoma", Font.PLAIN, 15));
		source.setBounds(383, 193, 111, 20);
		contentPane.add(source);
                
                JLabel destination = new JLabel("Destination");
		destination.setFont(new Font("Tahoma", Font.PLAIN, 15));
		destination.setBounds(489, 190, 111, 20);
		contentPane.add(destination);
		
		JLabel lblNashik = new JLabel("Nashik");
		lblNashik.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNashik.setBounds(138, 50, 111, 35);
		contentPane.add(lblNashik);

		
		
		
		setVisible(true);
		setLocation(400,200);
	}
}
