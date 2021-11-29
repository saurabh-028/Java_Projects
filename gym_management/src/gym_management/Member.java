package gym_management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;


public class Member extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Add New Member");
	private JTextField name;
	private JTextField Address;
	private JTextField father;
	private JTextField mobile;
	private JTextField email;
	private JTextField money;
	private JTextField age;
	private JTextField textFielddate;

	
	
	public Member() {
		super("Member"); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,50 , 1200, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		
		JLabel lblMember_Id_1 = new JLabel("00");
		lblMember_Id_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMember_Id_1.setBounds(201, 152, 109, 36);
		contentPane.add(lblMember_Id_1);
		
		try {
			int id = 1;
			String str1 = String.valueOf(id);
			lblMember_Id_1.setText(str1);
			conn c1 = new conn();
			ResultSet rs1 = c1.stm.executeQuery("select max(id) from member");
			while(rs1.next()) {
				id = rs1.getInt(1);
				id = id + 1;
				String str = String.valueOf(id);
				lblMember_Id_1.setText(str);
				
			}
			
			
			
		}catch(Exception e) {
			System.out.print(e);
		}
		 
		
		
		
		contentPane.setLayout(null);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(373, 32, 356, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(63, 235, 147, 36);
		contentPane.add(lblName);
		
		
		
		JLabel lblMember_Id = new JLabel("Member Id");
		lblMember_Id.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMember_Id.setBounds(63, 152, 109, 36);
		contentPane.add(lblMember_Id);
		
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddress.setBounds(63, 325, 147, 36);
		contentPane.add(lblAddress);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGender.setBounds(63, 468, 147, 36);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(201, 471, 70, 31);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.BLACK);
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(291, 471, 86, 31);
		contentPane.add(rdbtnFemale);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 15));
		name.setBounds(201, 239, 239, 30);
		contentPane.add(name);
		name.setColumns(10);
		
		Address = new JTextField();
		Address.setFont(new Font("Tahoma", Font.BOLD, 15));
		Address.setColumns(10);
		Address.setBounds(201, 325, 239, 82);
		contentPane.add(Address);
		
		JLabel lblFather_Name = new JLabel("Father's Name");
		lblFather_Name.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFather_Name.setBounds(63, 572, 147, 36);
		contentPane.add(lblFather_Name);
		
		father = new JTextField();
		father.setFont(new Font("Tahoma", Font.BOLD, 15));
		father.setColumns(10);
		father.setBounds(201, 576, 239, 30);
		contentPane.add(father);
		
		JLabel Date = new JLabel("Joining Date");
		Date.setFont(new Font("Tahoma", Font.BOLD, 16));
		Date.setBounds(509, 152, 161, 36);
		contentPane.add(Date); 
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"05.00AM : 11.00AM", "04.00PM : 08.00PM"}));
		comboBox.setBounds(659, 473, 239, 31);
		contentPane.add(comboBox);
		
		
		JLabel lableTIme = new JLabel("Time");
		lableTIme.setFont(new Font("Tahoma", Font.BOLD, 16));
		lableTIme.setBounds(509, 468, 147, 36);
		contentPane.add(lableTIme);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(509, 325, 147, 36);
		contentPane.add(lblEmail);
		
		JLabel lblmoney_to_pay = new JLabel("Money to pay");
		lblmoney_to_pay.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmoney_to_pay.setBounds(509, 570, 147, 36);
		contentPane.add(lblmoney_to_pay);
		
		JLabel lblmobile = new JLabel("Mobile no");
		lblmobile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblmobile.setBounds(509, 235, 147, 36);
		contentPane.add(lblmobile);
		
		
		mobile = new JTextField();
		mobile.setFont(new Font("Tahoma", Font.BOLD, 15));
		mobile.setColumns(10);
		mobile.setBounds(659, 241, 239, 30);
		contentPane.add(mobile);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.BOLD, 15));
		email.setColumns(10);
		email.setBounds(659, 325, 239, 30);
		contentPane.add(email);
		
		money = new JTextField();
		money.setFont(new Font("Tahoma", Font.BOLD, 15));
		money.setColumns(10);
		money.setBounds(659, 572, 239, 30);
		contentPane.add(money);
		

		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 15));
		age.setColumns(10);
		age.setBounds(659, 398, 239, 30);
		contentPane.add(age);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = lblMember_Id_1.getText();
				String Name = name.getText();
				String address = Address.getText();
				String Father = father.getText();
				String Mob = mobile.getText();
				String Email = email.getText();
				String Money = money.getText();
				String Age = age.getText();
                String gender = null;
				 
				           if( rdbtnNewRadioButton.isSelected()) {
					          gender = "male";
				          }else if(rdbtnFemale .isSelected()) {
					       gender = "female";
				            }
				String date = textFielddate.getText();
				String time = (String) comboBox.getSelectedItem();
				
				try {
					conn c = new conn();
					 String str = "INSERT INTO member values('"+id+"','"+Name+"', '"+address+"', '"+Father+"','"+Mob+"', '"+Email+"','"+Money+"','"+Age+"','"+gender+"', '"+date+"', '"+time+"')";
					 c.stm.executeUpdate(str);
					 JOptionPane.showMessageDialog(null,"Member Added");
	                 setVisible(false);
	                 new Member().setVisible(true);
					 
					
					
					
				}catch(Exception ex) {
					System.out.print(ex);
					
				}
		
			}
		});
		save.setBackground(Color.BLACK);
		save.setForeground(Color.WHITE);
		save.setFont(new Font("Tahoma", Font.BOLD, 14));
		save.setBounds(360, 686, 99, 36);
		contentPane.add(save);
		
		JButton cancle = new JButton("Cancle");
		cancle.setForeground(Color.WHITE);
		cancle.setFont(new Font("Tahoma", Font.BOLD, 14));
		cancle.setBackground(Color.BLACK);
		cancle.setBounds(545, 686, 99, 36);
		contentPane.add(cancle);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(509, 398, 147, 36);
		contentPane.add(lblAge);
		
		textFielddate = new JTextField();
		textFielddate.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFielddate.setColumns(10);
		textFielddate.setBounds(659, 163, 239, 30);
		contentPane.add(textFielddate);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Member().setVisible(true);
	}
}
