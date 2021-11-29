package gym_management;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class update extends JFrame {

	private JPanel contentPane;
	private JTextField Id;
	private JTextField Name;
	private JTextField Address;
	private JTextField Gender;
	private JTextField Father;
	private JTextField Date;
	private JTextField Mob;
	private JTextField Email;
	private JTextField Age;
	private JTextField Time;
	private JTextField Money;

	public static void main(String[] args) {
		new update().setVisible(true);
	}

	public update() {
		getContentPane().setForeground(Color.CYAN);
		setBounds(200,50 , 1200, 800);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE AND DELETE MEMBER");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(344, 38, 487, 78);
		getContentPane().add(lblNewLabel);
		
		JLabel lblid = new JLabel("Member Id ");
		lblid.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblid.setBounds(95, 181, 94, 33);
		getContentPane().add(lblid);
		
		Id = new JTextField();
		Id.setFont(new Font("Tahoma", Font.BOLD, 15));
		Id.setBounds(209, 186, 79, 28);
		getContentPane().add(Id);
		Id.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int checkid = 0;
				String id = Id.getText();
				try {
					conn c = new conn();
					ResultSet rs = c.stm.executeQuery("select * from member where id = '"+id+"' ");
					while(rs.next()) {
						
						checkid = 1;
					    Id.setEditable(false);
					    Name.setText(rs.getString(2));
					    Address.setText(rs.getString(3));
					    Father.setText(rs.getString(4));
					    Mob.setText(rs.getString(5));
					    Email.setText(rs.getString(6));
					    Money.setText(rs.getString(7));
					    Age.setText(rs.getString(8));
					    Gender.setText(rs.getString(9));
					    Gender.setEditable(false);
					    Date.setText(rs.getString(10));
					    Date.setEditable(false);
					    Time.setText(rs.getString(11));
					    Time.setEditable(false);
					
					}
					if(checkid ==0) {
						JOptionPane.showMessageDialog(null, "Id is incorrect, Enter Correct Id");
					}

					
				}catch(Exception ex){
					System.out.print(ex);
					
				}
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(310, 185, 94, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(95, 266, 94, 33);
		getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(95, 345, 94, 33);
		getContentPane().add(lblAddress);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(95, 501, 94, 33);
		getContentPane().add(lblGender);
		
		JLabel lblid_1_3 = new JLabel("Father's Name");
		lblid_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblid_1_3.setBounds(95, 596, 119, 33);
		getContentPane().add(lblid_1_3);
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.BOLD, 15));
		Name.setBounds(237, 271, 297, 28);
		getContentPane().add(Name);
		Name.setColumns(10);
		
		Address = new JTextField();
		Address.setFont(new Font("Tahoma", Font.BOLD, 15));
		Address.setColumns(10);
		Address.setBounds(237, 350, 297, 88);
		getContentPane().add(Address);
		
		Gender = new JTextField();
		Gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		Gender.setColumns(10);
		Gender.setBounds(237, 506, 297, 28);
		getContentPane().add(Gender);
		
		Father = new JTextField();
		Father.setFont(new Font("Tahoma", Font.BOLD, 15));
		Father.setColumns(10);
		Father.setBounds(237, 601, 297, 28);
		getContentPane().add(Father);
		
		JLabel lblJoiningDate = new JLabel("Joining Date");
		lblJoiningDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJoiningDate.setBounds(601, 181, 119, 33);
		getContentPane().add(lblJoiningDate);
		
		JLabel lblMob = new JLabel("Mobile no");
		lblMob.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMob.setBounds(601, 266, 119, 33);
		getContentPane().add(lblMob);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(601, 345, 94, 33);
		getContentPane().add(lblEmail);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setBounds(601, 421, 94, 33);
		getContentPane().add(lblAge);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(601, 501, 94, 33);
		getContentPane().add(lblTime);
		
		JLabel lblMoney = new JLabel("Money to Pay");
		lblMoney.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMoney.setBounds(601, 596, 119, 33);
		getContentPane().add(lblMoney);
		
		Date = new JTextField();
		Date.setFont(new Font("Tahoma", Font.BOLD, 15));
		Date.setColumns(10);
		Date.setBounds(756, 181, 297, 28);
		getContentPane().add(Date);
		
		Mob = new JTextField();
		Mob.setFont(new Font("Tahoma", Font.BOLD, 15));
		Mob.setColumns(10);
		Mob.setBounds(756, 275, 297, 28);
		getContentPane().add(Mob);
		
		Email = new JTextField();
		Email.setFont(new Font("Tahoma", Font.BOLD, 15));
		Email.setColumns(10);
		Email.setBounds(756, 354, 297, 28);
		getContentPane().add(Email);
		
		Age = new JTextField();
		Age.setFont(new Font("Tahoma", Font.BOLD, 15));
		Age.setColumns(10);
		Age.setBounds(756, 430, 297, 28);
		getContentPane().add(Age);
		
		Time = new JTextField();
		Time.setFont(new Font("Tahoma", Font.BOLD, 15));
		Time.setColumns(10);
		Time.setBounds(756, 506, 297, 28);
		getContentPane().add(Time);
		
		Money = new JTextField();
		Money.setFont(new Font("Tahoma", Font.BOLD, 15));
		Money.setColumns(10);
		Money.setBounds(756, 601, 297, 28);
		getContentPane().add(Money);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = Name.getText();
				String address = Address.getText();
				String father = Father.getText();
				String mobile = Mob.getText(); 
				String email = Email.getText();
				String money = Money.getText();
				String age = Age.getText();
				
				try {
					 conn con = new conn();
		                String str = "update member set name='"+Name.getText()+"',address='"+Address.getText()+"',father='"+Father.getText()+"',mobile='"+Mob.getText()+"',email='"+Email.getText()+"', money='"+Money.getText()+"', age='"+Age.getText()+"', gender='"+Gender.getText()+"',date='"+Date.getText()+"',time='"+Time.getText()+"' where id='"+Id.getText()+"'";
		                con.stm.executeUpdate(str);
					
					JOptionPane.showMessageDialog(null, "Updated Successfully");
					setVisible(false);
					new update().setVisible(true);
					
					
					
				}catch(Exception ex){
					System.out.print(ex);
				}
				
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(280, 677, 104, 43);
		getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null,"Do you really want to Delete","Select",JOptionPane.YES_NO_OPTION);
				if(a == 0) {
					
					String id = Id.getText();
				try {
					conn con = new conn();
	                String str = "delete from member where id = '"+id+"'";
	                con.stm.executeUpdate(str);
	                JOptionPane.showMessageDialog(null,"deleted successfully");
					 setVisible(false);
					 new update().setVisible(true);
				
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Successfully Deleted ");
				}
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setBounds(475, 677, 104, 43);
		getContentPane().add(btnDelete);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new update().setVisible(true);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(Color.BLACK);
		btnReset.setBounds(657, 677, 104, 43);
		getContentPane().add(btnReset);
		
	}

}
