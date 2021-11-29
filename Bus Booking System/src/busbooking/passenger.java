package busbooking;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class passenger extends JFrame{
			
			TextField t1,t2,t3,t4,t5;
			
			public passenger() {
				
				super("Add Customer");
				Font f = new Font("Tahoma", Font.PLAIN, 17);
				
				getContentPane().setForeground(Color.BLUE);
			    getContentPane().setBackground(Color.WHITE);
			   
			    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			    setSize(778, 486);
			    getContentPane().setLayout(null);
			    
			    JLabel name = new JLabel("Name");
			    name.setFont(f);
			    name.setBounds(60, 80, 150, 27);
				add(name);
				
				JTextField t1 = new JTextField();
				t1.setBounds(200, 80, 150, 27);
				add(t1);
				
				JLabel address = new JLabel("Address");
				address.setFont(f);
				address.setBounds(60, 140, 150, 27);
				add(address);
				
				JTextField t2 = new JTextField();
				t2.setBounds(200, 140, 150, 27);
				add(t2);
				
				JLabel mono = new JLabel("Mob Number");
				mono.setFont(f);
				mono.setBounds(60, 200, 150, 27);
				add(mono);
				
				JTextField t3 = new JTextField();
				t3.setBounds(200, 200, 150, 27);
				add(t3);
				
				JLabel gender = new JLabel("Gender");
				gender.setFont(f);
				gender.setBounds(60, 260, 150, 27);
				add(gender);
				
				JRadioButton male = new JRadioButton("Male");
				male.setBackground(Color.WHITE);
				male.setBounds(200, 260, 70, 27);
				add(male);
				
				JRadioButton female = new JRadioButton("Female");
				female.setBackground(Color.WHITE);
				female.setBounds(280,260,70,27);
				add(female);
				
				JLabel buscode = new JLabel("Bus Code");
				buscode.setFont(f);
				buscode.setBounds(60,320,150,27);
				add(buscode);
				
				JTextField t4 = new JTextField();
				t4.setBounds(200, 320, 150, 27);
				add(t4);
				
				JLabel pnr = new JLabel("Pnr_number");
				pnr.setFont(f);
				pnr.setBounds(60, 380, 150, 27);
				add(pnr);
				
				JTextField t5 = new JTextField();
				t5.setBounds(200,380, 150, 27);
				add(t5);
				
				Button save = new Button("save");
				save.setFont(new Font("Tahom",Font.BOLD, 15));
				save.setBounds(350,440,80,35);
				setBackground(Color.BLACK);
				setForeground(Color.WHITE);
				add (save);
				
				
				
				ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("busbooking/icon/user.png"));
				JLabel image = new JLabel(i1);
				image.setBounds(460,110, 282, 203);
				add(image);
				
				 save.addActionListener(new ActionListener(){
					 public void actionPerformed(ActionEvent ae) {
					 String name = t1.getText();
					 String address = t2.getText();
					 String mob = t3.getText();
					 String buscode = t4.getText();
					 String pnr = t5.getText();
					 
					 String gender = null;
					 
					 if(male.isSelected()) {
						 gender = "male";
					 }else if(female.isSelected()) {
						 gender = "female";
					 }
					 try {
						 conn c = new conn();
						 String str = "INSERT INTO passenger values('"+pnr+"','"+name+"', '"+mob+"', '"+address+"','"+gender+"', '"+buscode+"' )";
						 c.s.executeUpdate(str);
						 JOptionPane.showMessageDialog(null,"Customer Added");
		                 setVisible(false);
						 
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
					 }
					 
				 });
				
				
				
				
				setVisible(true);
				setSize(900,600);
				setLocation(400,200);
			}
			public static void main(String[] args) {
				new passenger();
			}

				
}			




			

				
			


  