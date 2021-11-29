package gym_management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame {

	 
	
	public Main() {
		super("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,50 , 1200, 800);
		setLayout(null);
		
		
	    JLabel gym= new JLabel("");
	    gym.setIcon(new ImageIcon("C:\\Users\\Saurabh028\\eclipse-workspace\\gym_management\\bin\\gym_management\\icon\\gym.jpg"));
		gym.setBounds(0, 0, 1200, 800);
	    add(gym);
 		 
 		JLabel bb = new JLabel("GRAVITY");
 		getContentPane().add(bb);
 		bb.setForeground(Color.WHITE);
 		
 		bb.setFont(new Font("Tahoma", Font.BOLD, 45));
 		bb.setBounds(485, 40, 229, 55);
 		gym.add(bb);
 		
 		JButton btnNewButton = new JButton("New Member");
 		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
 		btnNewButton.setBackground(Color.BLACK);
 		btnNewButton.setForeground(Color.WHITE);
 		btnNewButton.setBounds(192, 187, 155, 41);
 		add(btnNewButton);

 		 btnNewButton.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	                new Member().setVisible(true);;
	            }
	            
		});
		
   
 		JButton btnUpdateMember = new JButton("Update Member");
 		btnUpdateMember.setForeground(Color.WHITE);
 		btnUpdateMember.setFont(new Font("Tahoma", Font.BOLD, 14));
 		btnUpdateMember.setBackground(Color.BLACK);
 		btnUpdateMember.setBounds(192, 314, 155, 41);
 		add(btnUpdateMember);
 		

 		btnUpdateMember.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	                new update().setVisible(true);;
	            }
	            
		});
		
 		JButton btnNewButton_1_1 = new JButton("List Of Members");
 		btnNewButton_1_1.setForeground(Color.WHITE);
 		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
 		btnNewButton_1_1.setBackground(Color.BLACK);
 		btnNewButton_1_1.setBounds(192, 443, 155, 41);
 		add(btnNewButton_1_1);
 		
 		btnNewButton_1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new list_of_members().setVisible(true);;
            }
            
	});
 		
 		JButton btnPayment = new JButton("Payment");
 		btnPayment.setForeground(Color.WHITE);
 		btnPayment.setFont(new Font("Tahoma", Font.BOLD, 14));
 		btnPayment.setBackground(Color.BLACK);
 		btnPayment.setBounds(755, 187, 155, 41);
 		add(btnPayment);
 		
 		btnPayment.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);;
            }
            
	});
 		
 		JButton btnLogout = new JButton("Logout");
 		btnLogout.setForeground(Color.WHITE);
 		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
 		btnLogout.setBackground(Color.BLACK);
 		btnLogout.setBounds(755, 299, 155, 41);
 		add(btnLogout);
 		
	
	}
	public static void main(String[] args) {
		new Main().setVisible(true);;
		
		}
}
