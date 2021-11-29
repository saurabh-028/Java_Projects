

package busbooking;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;


public class ticket extends JFrame {

	 JPanel contentPane;
	 JTextField t1;
	 String src, dst, buscode, bustime, capacity,name;
	 private JTextField textFielddate;
	 String Price;

	public ticket(String a) {
		try {
			conn c = new conn();
                       
			String str = "select bcode, jny_time, capacity, src, dest, name from bus, passenger where bcode = '"+a+"' and b_code= '"+a+"' ";
			ResultSet rs= c.s.executeQuery(str);
			
		
			while(rs.next()) {
				name = rs.getString("name");
				buscode = rs.getString("bcode");
				bustime = rs.getString("jny_time");
				capacity = rs.getString("capacity");
				src = rs.getString("src");
				dst = rs.getString("dest");
				
				
				
			}
		}catch(Exception ex) {
			  System.out.println("The error is:"+ex);
		}
		
		
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(400, 100, 730, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBackground(new Color(255, 255, 255));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Random ran = new Random();
		long first4 = (ran.nextLong()% 9000L + 1000L);
		long first = Math.abs(first4);
                String ticket_no = String.valueOf(first);
                
	
		JLabel ticketId = new JLabel("Ticket  ID : " + first);
		ticketId.setFont(new Font("Tahoma", Font.BOLD, 17));
		ticketId.setBounds(466, 34, 175, 30);
		contentPane.add(ticketId);
		
		JLabel ticket_book = new JLabel("Ticket Booking");
		ticket_book.setBackground(Color.LIGHT_GRAY);
		ticket_book.setForeground(Color.CYAN);
		ticket_book.setFont(new Font("Tahoma", Font.BOLD, 30));
		ticket_book.setBounds(48, 34, 354, 65);
		contentPane.add(ticket_book);
		
		JLabel lblname = new JLabel("Name :");
		lblname.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblname.setBounds(390, 136, 85, 30);
		contentPane.add(lblname);
		
		JLabel lbpnr = new JLabel(name);
		lbpnr.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbpnr.setBounds(525, 136, 85, 30);
		contentPane.add(lbpnr);
		
		JLabel Bcode = new JLabel("Bus Code :");
		Bcode.setFont(new Font("Tahoma", Font.BOLD, 17));
		Bcode.setBounds(58, 228, 99, 34);
		contentPane.add(Bcode);
		
		
		
		JLabel b = new JLabel(buscode);
		b.setFont(new Font("Tahoma", Font.BOLD, 17));
		b.setBounds(200, 228, 100, 34);
		contentPane.add(b);
		
		
		JLabel source = new JLabel("Source :");
		source.setFont(new Font("Tahoma", Font.BOLD, 17));
		source.setBounds(58, 306, 99, 34);
		contentPane.add(source);
		
		JLabel s = new JLabel(src);
		s.setFont(new Font("Tahoma", Font.BOLD, 17));
		s.setBounds(200, 306, 237, 34);
		contentPane.add(s);

		
		JLabel destination = new JLabel("Destination : " );
		destination.setFont(new Font("Tahoma", Font.BOLD, 17));
		destination.setBounds(58, 388, 119, 34);
		contentPane.add(destination);
		
		JLabel d = new JLabel(dst);
		d.setFont(new Font("Tahoma", Font.BOLD, 17));
		d.setBounds(200, 388, 119, 34);
		contentPane.add(d);
		
		
		JLabel time = new JLabel("Bus time : ");
		time.setFont(new Font("Tahoma", Font.BOLD, 17));
		time.setBounds(390, 228, 237, 34);
		contentPane.add(time);
		
		JLabel t = new JLabel(bustime);
		t.setFont(new Font("Tahoma", Font.BOLD, 17));
		t.setBounds(525, 228, 237, 34);
		contentPane.add(t);
		
		JLabel capa = new JLabel("Capacity : ");
		capa.setFont(new Font("Tahoma", Font.BOLD, 17));
		capa.setBounds(390, 306, 237, 34);
		contentPane.add(capa);
		
		JLabel c = new JLabel(capacity);
		c.setFont(new Font("Tahoma", Font.BOLD, 17));
		c.setBounds(525, 306, 237, 34);
		contentPane.add(c);
	
		JLabel Date = new JLabel("Date :");
		Date.setFont(new Font("Tahoma", Font.BOLD, 17));
		Date.setBounds(58, 132, 62, 34);
		contentPane.add(Date);
		

		JLabel date1 = new JLabel();
		date1.setFont(new Font("Tahoma", Font.BOLD, 17));
		date1.setBounds(390, 388, 237, 34);
		contentPane.add(date1);
		
		textFielddate = new JTextField();
		textFielddate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFielddate.setBounds(132, 136, 175, 30);
		contentPane.add(textFielddate);
		textFielddate.setColumns(20);

		
		JButton btnADD = new JButton("ADD");
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String getdate = textFielddate.getText();
				try {
					
					conn cc = new conn();
                    String status = "booked";
                                          
					String str = "insert into ticket values('"+ticket_no+"', '"+buscode+"' , '"+getdate+"', '"+bustime+"', '"+src+"','"+dst+"','"+name+"','"+status+"')";
					 cc.s.executeUpdate(str);
		                JOptionPane.showMessageDialog(null,"Ticket Added");
		                setVisible(false);
				}catch(Exception ee) {
					System.out.println("error is"+ee);
				}
				
				
				
			}
		});
		btnADD.setForeground(Color.WHITE);
		btnADD.setBackground(Color.BLACK);
		btnADD.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnADD.setBounds(270, 470, 99, 34);
		contentPane.add(btnADD);
		
	
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		
		new ticket("ticket");
		
		
	}
}
