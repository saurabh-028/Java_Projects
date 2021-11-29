package internship_management_system;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User extends JFrame{

	
	private JTextField Name;
	private JTextField Address;
	private JTextField Birthdate;
	private JTextField Mobile;
	private JTextField Email;
	private JTextField Username;
	private JTextField Password;
	JPanel contentPane;
	private JTextField PRN;

	public User() {
	
		
		setTitle("add Member");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 50, 1200, 800);
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MEMBER REGISTRATION");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(380, 37, 407, 65);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(53, 178, 92, 27);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(53, 251, 92, 27);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Birthdate");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(53, 320, 92, 27);
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Mobile");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(53, 394, 92, 27);
		getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Email");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_4.setBounds(53, 451, 92, 27);
		getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Gender");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_5.setBounds(53, 517, 92, 27);
		getContentPane().add(lblNewLabel_2_5);
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.BOLD, 14));
		Name.setBounds(196, 178, 304, 27);
		getContentPane().add(Name);
		Name.setColumns(10);
		
		Address = new JTextField();
		Address.setFont(new Font("Tahoma", Font.BOLD, 16));
		Address.setColumns(10);
		Address.setBounds(196, 251, 304, 27);
		getContentPane().add(Address);
		
		Birthdate = new JTextField();
		Birthdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		Birthdate.setColumns(10);
		Birthdate.setBounds(196, 320, 304, 27);
		getContentPane().add(Birthdate);
		
		Mobile = new JTextField();
		Mobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		Mobile.setColumns(10);
		Mobile.setBounds(196, 394, 304, 27);
		getContentPane().add(Mobile);
		
		Email = new JTextField();
		Email.setFont(new Font("Tahoma", Font.BOLD, 14));
		Email.setColumns(10);
		Email.setBounds(196, 451, 304, 27);
		getContentPane().add(Email);
		
		JRadioButton Male = new JRadioButton("Male");
		Male.setBackground(Color.YELLOW);
		Male.setFont(new Font("Tahoma", Font.BOLD, 16));
		Male.setBounds(196, 520, 103, 21);
		getContentPane().add(Male);
		
		JRadioButton Female = new JRadioButton("Female");
		Female.setFont(new Font("Tahoma", Font.BOLD, 16));
		Female.setBackground(Color.YELLOW);
		Female.setBounds(324, 520, 103, 21);
		getContentPane().add(Female);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("internship_management_system/Icon/User.png")));
		lblNewLabel.setBounds(676, 164, 483, 464);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Username");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_5_1.setBounds(53, 584, 92, 27);
		getContentPane().add(lblNewLabel_2_5_1);
		 
		JLabel lblNewLabel_2_5_2 = new JLabel("Password");
		lblNewLabel_2_5_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_5_2.setBounds(53, 650, 92, 27);
		getContentPane().add(lblNewLabel_2_5_2);
		
		Username = new JTextField();
		Username.setFont(new Font("Tahoma", Font.BOLD, 14));
		Username.setColumns(10);
		Username.setBounds(196, 584, 304, 27);
		getContentPane().add(Username);
		
		Password = new JTextField();
		Password.setFont(new Font("Tahoma", Font.BOLD, 14));
		Password.setColumns(10);
		Password.setBounds(196, 650, 304, 27);
		getContentPane().add(Password);
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 String name = Name.getText();
				 String address = Address.getText();
				 String mob = Mobile.getText();
				 String email = Email.getText();
				 String birthdate = Birthdate.getText();
				 String username = Username.getText();
				 String password = Password.getText();
				 String gender = null;
				 
				 if(Male.isSelected()) {
					 gender = "male";
				 }else if(Female.isSelected()) {
					 gender = "female";
				 }
				 try {
					 conn c = new conn();
					 String str = "INSERT INTO user values('"+name+"','"+address+"', '"+mob+"', '"+email+"', '"+gender+"','"+birthdate+"', '"+username+"', '"+password+"')";
					 c.s.executeUpdate(str);
					 JOptionPane.showMessageDialog(null,"Added Successfully");
					 setVisible(false);
	                 
				 }catch(Exception e1) {
					 e1.printStackTrace();
				 }
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(504, 705, 116, 34);
		getContentPane().add(btnNewButton);
		
		
		
		setVisible(true);
		setLocation(150,50);
	}
	public static void main(String[] args) {
		
		new User().setVisible(true);
	}
}
