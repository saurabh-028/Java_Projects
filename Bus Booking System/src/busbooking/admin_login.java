package busbooking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class admin_login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		
		new admin_login().setVisible(true);
		
	}

	
	public admin_login() {
		setTitle("Admin_Login");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 420, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Passsword");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(37, 82, 107, 35);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 84, 154, 35);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					conn c2 = new conn();
					String s1 = passwordField.getText();
					
					
					String str = "select * from admin_login where password ='"+s1+"'";
					ResultSet rs = c2.s.executeQuery(str);
					
					if(rs.next()) {
						new Add_Bus();
						setVisible(false);	
					}else {
						JOptionPane.showMessageDialog(null,"invalid input");
				
					}
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
					
				}
			}
			
		});
		btnNewButton.setBounds(120, 152, 81, 27);
		contentPane.add(btnNewButton);
                
                JButton cancle = new JButton("Cancle");
		cancle.setFont(new Font("Tahoma", Font.BOLD, 15));
                cancle.setBounds(220, 152, 90, 27);
                
                cancle.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        setVisible(false);
                    }
                    
                });
                contentPane.add(cancle);
                
		
		setVisible(true);
		setLocation(400,200);
	}
}
