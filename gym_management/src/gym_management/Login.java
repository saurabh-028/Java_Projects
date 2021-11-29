package gym_management;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 506, 375);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(55, 75, 116, 38);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(181, 79, 183, 35);
		contentPane.add(textField);
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(55, 140, 116, 38);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(181, 143, 183, 35);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					conn con = new conn();
					String s1 = textField.getText();
					String s2 = textField_1 .getText();
					 
					String st = "select * from login where username = '"+s1+"' and password = '"+s2+"'";
					ResultSet rs = con.stm.executeQuery(st);
					
					if(rs.next()) {
						new Main().setVisible(true);;
						setVisible(false);
						}
					else { 
						JOptionPane.showMessageDialog(null,"invalid Input");
					}
					 
					
				}
				catch(Exception ex){
					System.out.println("erro" + ex);
				
					
				}
			}
		});
		btnNewButton.setBounds(100, 209, 101, 38);
		contentPane.add(btnNewButton);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		}); btnCancle.setForeground(Color.WHITE);
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancle.setBackground(Color.BLACK);
		btnCancle.setBounds(250, 209, 101, 38);
		contentPane.add(btnCancle);
		
		
	}
}
