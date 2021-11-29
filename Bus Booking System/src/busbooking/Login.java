package busbooking;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame  {
		
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	Button b2, b3;
	Font f1,f2;
	
	
	Login(){
		
		super("User Login");
		
		setLayout(null);	
		setForeground(Color.CYAN);
		setBackground(Color.WHITE);
		
		
		
		
		JLabel l1 = new JLabel("Username");
		l1.setFont(new Font("Tahoma",Font.BOLD,15));
		l1.setBounds(50, 50, 100, 20);
		add(l1);
		
		JLabel l2 = new JLabel("Password");
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setBounds(50, 100, 100, 20);
		add(l2);
		
		JTextField t1 = new JTextField();
		
		t1.setBounds(160, 50, 125, 23);
		add(t1);
		
		JTextField t2 = new JTextField();
		
		t2.setBounds(160, 100, 125, 23);
		add(t2);
		
		JButton b1 = new JButton("Reset");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,13));
		b1.setBounds(70, 150, 80, 23 );
		add(b1);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				t1.setText("");
				t2.setText("");
			}
			
		});
		
		
		
		
		JButton b2 = new JButton("Login");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,13));
		b2.setBounds(160, 150, 80, 23 );
		add(b2);
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				try {
					conn c1 = new conn();
					String s1 = t1.getText();
					String s2 = t2.getText();
					
					String str = "select * from login where username = '"+s1+"' and password ='"+s2+"'";
					ResultSet rs = c1.s.executeQuery(str);
					
					if(rs.next()) {
						new Main();
						setVisible(false);	
					}else {
						JOptionPane.showMessageDialog(null,"invalid input");
						setVisible(false);
					}
					
					
				}catch(Exception ex) {
					System.out.println("erro" + ex);
					
				}
			}
			
		});
		JButton b3 = new JButton("Cancle");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Tahoma",Font.BOLD,13));
		b3.setBounds(250, 150, 80, 23 );
		add(b3);
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
			
		});
		
	
		setVisible(true);
		setSize(400,250);
		setLocation(400,200);		
	}

	public static void main(String[] args) {
		new Login().setVisible(true);;	

	}

	
}
