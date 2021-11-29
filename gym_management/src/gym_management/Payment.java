package gym_management;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField Id;
	private JTextField Name;
	private JTextField Mob;
	private JTextField Email;
	private JTextField Amount;
	private JTable table;

	public void tableDetails() {
		
		
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
		String id = Id.getText();
		try {
			conn c = new conn();
			ResultSet rs = c.stm.executeQuery("select from payment where id = '"+id+"'");
			while(rs.next()) {
				
				dtm.addRow(new Object[] {rs.getString(2),rs.getString(3)});
			}
			
			
		}catch(Exception e) {
			System.out.print(e);
		}
	
	}
	

	public Payment() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,50 , 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblNewLabel = new JLabel("PAYMENT");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(270, 20, 496, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblId = new JLabel("Member ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBounds(66, 112, 99, 30);
		contentPane.add(lblId);
		
		Id = new JTextField();
		Id.setFont(new Font("Tahoma", Font.BOLD, 16));
		Id.setBounds(185, 112, 99, 27);
		contentPane.add(Id);
		Id.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDate.setBounds(66, 182, 99, 30);
		contentPane.add(lblDate);
		
		JLabel lbldate = new JLabel("dd-mm-yyyy");
		lbldate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbldate.setBounds(138, 182, 146, 30);
		contentPane.add(lbldate);
		
		SimpleDateFormat dFormat = new SimpleDateFormat("MMM-yyyy"); 
		Date date = new Date();
		String month = dFormat.format(date);
		lbldate.setText(month);
		
		JButton btnsave = new JButton("save");
		btnsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = Id.getText();
				String month = lbldate.getText();
				String amount = Amount.getText();
				
				try {
					conn c3 = new conn();
					String str = "update member set id='"+Id.getText()+"',month='"+lbldate.getText()+"',amount='"+Amount.getText()+"'";
	                c3.stm.executeUpdate(str);
				
				JOptionPane.showMessageDialog(null, "Updated Successfully");
				setVisible(false);
				new update().setVisible(true);
				
					
				}catch(Exception exp) {
					System.out.print(exp);
					
				}
				
				
			}
		});
		btnsave.setForeground(Color.WHITE);
		btnsave.setBackground(Color.BLACK);
		btnsave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnsave.setBounds(113, 693, 85, 30);
		contentPane.add(btnsave);
	
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tableDetails();
				int checkid = 0;
				String id = Id.getText();
				String month = lbldate.getText();
				
				try {
					conn c = new conn();
					ResultSet rs = c.stm.executeQuery("select * from member where id = '"+id+"' ");
					while(rs.next()) {
						
						checkid = 1;
					    Id.setEditable(false);
					    Name.setText(rs.getString(2));
					    
					    Mob.setText(rs.getString(5));
					    Email.setText(rs.getString(6));
					   
					    Amount.setText(rs.getString(7));
					    
					
					}
					if(checkid ==0) {
						JOptionPane.showMessageDialog(null, "Id is incorrect, Enter Correct Id");
						
						ResultSet rs1 = c.stm.executeQuery("select * from payment inner join member where payment.month='"+month+"' and payment.id='"+id+"' and member.id='"+id+"' ");
					    while(rs.next()) {
					    	btnsave.setVisible(false);
					    	JOptionPane.showMessageDialog(null, "Payment allready done for this month");
					    }
					}

					
				}catch(Exception ex){
					System.out.print(ex);
					
				}
			}
		});
		btnNewButton.setBounds(314, 112, 85, 27);
		contentPane.add(btnNewButton);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(66, 252, 146, 30);
		contentPane.add(lblName);
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.BOLD, 16));
		Name.setColumns(10);
		Name.setBounds(66, 296, 369, 27);
		contentPane.add(Name);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(66, 464, 146, 30);
		contentPane.add(lblEmail);
		
		JLabel lblMob = new JLabel("Mobile no");
		lblMob.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMob.setBounds(66, 364, 146, 30);
		contentPane.add(lblMob);
		
		Mob = new JTextField();
		Mob.setFont(new Font("Tahoma", Font.BOLD, 16));
		Mob.setColumns(10);
		Mob.setBounds(66, 404, 369, 27);
		contentPane.add(Mob);
		
		Email = new JTextField();
		Email.setFont(new Font("Tahoma", Font.BOLD, 16));
		Email.setColumns(10);
		Email.setBounds(66, 515, 369, 27);
		contentPane.add(Email);
		
		JLabel lblAmount = new JLabel("Amount To Pay");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAmount.setBounds(66, 574, 146, 30);
		contentPane.add(lblAmount);
		
		Amount = new JTextField();
		Amount.setFont(new Font("Tahoma", Font.BOLD, 16));
		Amount.setColumns(10);
		Amount.setBounds(66, 623, 369, 27);
		contentPane.add(Amount);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Payment().setVisible(true);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(262, 693, 85, 30);
		contentPane.add(btnReset);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMonth.setBounds(607, 112, 99, 30);
		contentPane.add(lblMonth);
		
		JLabel lblAmount1 = new JLabel("Amount");
		lblAmount1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAmount1.setBounds(943, 112, 99, 30);
		contentPane.add(lblAmount1);
		
		table = new JTable();
		table.setBounds(576, 164, 530, 529);
		contentPane.add(table);
	}
	
	public static void main(String[] args) {
		new Payment().setVisible(true);
	}
}
