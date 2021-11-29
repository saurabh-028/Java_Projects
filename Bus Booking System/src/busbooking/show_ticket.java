package busbooking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class show_ticket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public String prn, src, dst, buscode, bustime, capacity;
	private JButton btnShow;

	
	
	
	public show_ticket() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 391, 225);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Bus Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(43, 55, 122, 33);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(176, 55, 122, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 ticket tic = new ticket(textField.getText());
					 setVisible(false);
				}catch(Exception ex) {
					  System.out.println("The error is:"+ ex);
				}
			}
		});
		btnShow.setForeground(Color.WHITE);
		btnShow.setBackground(Color.BLACK);
		btnShow.setBounds(131, 110, 85, 33);
		contentPane.add(btnShow);
		
		setVisible(true);
		setLocation(500,100);
		
	
	}
public static void main(String[] args) {
		
		show_ticket v = new show_ticket();
	}

}
