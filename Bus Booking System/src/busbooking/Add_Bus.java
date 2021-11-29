package busbooking;

import java.awt.*;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Add_Bus extends JFrame {

	public JPanel contentPane;
	private JTextField B_code;
	private JTextField time;
	private JTextField capacity;
	

	public static void main(String[] args) {
		
		new Add_Bus().setVisible(true);
	}

	public Add_Bus() {
		
		setTitle("add bus");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 706, 493);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBcode = new JLabel("B_Code");
		lblBcode.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBcode.setBounds(50, 230, 98, 35);
		contentPane.add(lblBcode);
		
		JLabel lblJrntime = new JLabel("Bus_Time");
		lblJrntime.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblJrntime.setBounds(50, 305, 98, 35);
		contentPane.add(lblJrntime);
		
		JLabel lblNewLabel_1 = new JLabel("ADD BUS");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(227, 40, 257, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFrom.setBounds(50, 153, 98, 35);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTo.setBounds(350, 153, 98, 35);
		contentPane.add(lblTo);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCapacity.setBounds(350, 230, 98, 35);
		contentPane.add(lblCapacity);
		
		JComboBox dst = new JComboBox();
		dst.setModel(new DefaultComboBoxModel(new String[] {"Mumbai", "Ahmadnagar", "Thane", "Kalyan", "Aurangabad", "Pune", "Surat"}));
		dst.setFont(new Font("Tahoma", Font.BOLD, 15));
		dst.setBounds(458, 154, 150, 35);
		contentPane.add(dst);
		
		B_code = new JTextField();
		B_code.setBounds(157, 230, 151, 35);
		contentPane.add(B_code);
		B_code.setColumns(10);
		
		time = new JTextField();
		time.setBounds(158, 308, 150, 35);
		contentPane.add(time);
		time.setColumns(10);
		
		capacity = new JTextField();
		capacity.setBounds(458, 233, 147, 35);
		contentPane.add(capacity);
		capacity.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String b = B_code.getText();
				String t = time.getText();
				String c = capacity.getText();
				String d = (String) dst.getSelectedItem();
				String s = "Nashik";
				
				 try{
		                conn cc = new conn();
		                String q = "insert into bus values('"+b+"','"+t+"','"+c+"','"+s+"','"+d+"')";
		                cc.s.executeUpdate(q);
		                JOptionPane.showMessageDialog(null,"Bus Added");
		                setVisible(false);
		              
		               
		            }catch(Exception ee){
		                System.out.println("The error is:"+ee);
		            }
				
			
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(291, 374, 111, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNashik = new JLabel("Nashik");
		lblNashik.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNashik.setBounds(158, 153, 150, 35);
		contentPane.add(lblNashik);
		
	
		
	
		
		
		
		setVisible(true);
		setLocation(400,100);
	}
}
