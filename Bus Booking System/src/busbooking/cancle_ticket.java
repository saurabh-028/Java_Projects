
package busbooking;

import java.sql.*;
import com.mysql.cj.protocol.Resultset;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public  class cancle_ticket extends JFrame{
 
   
public cancle_ticket(){
     super("Cancle_ticket");
 
    getContentPane().setLayout(null);
     setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    getContentPane().setBackground(Color.WHITE);
    getContentPane().setForeground(Color.CYAN);
    getContentPane().setBounds(400, 100, 550, 500);
    
    JLabel ticketno = new JLabel("Ticket_no ");
    ticketno.setFont(new Font("Tahoma",Font.BOLD,17));
    ticketno.setBounds(170, 50, 100, 30);
    add(ticketno);
    
    JTextField t = new JTextField();
    t.setBounds(280, 50,150,30);
    add(t);
    
    String b = t.getText();
   
    JTable table = new JTable();
    table.setBounds(45, 225, 650, 200);
    table.setBackground(Color.WHITE);
    add(table);

                JLabel buscode = new JLabel("B_Code");
		buscode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buscode.setBounds(60, 193, 75, 20);
		add(buscode);
		
		
		JLabel date = new JLabel("Jny_date");
		date.setFont(new Font("Tahoma", Font.PLAIN, 15));
		date.setBounds(150, 193, 111, 20);
		add(date);
                  
               JLabel time = new JLabel("Jny_time");
		time.setFont(new Font("Tahoma", Font.PLAIN, 15));
		time.setBounds(240, 193, 111, 20);
		add(time);
                
                JLabel source = new JLabel("Source");
		source.setFont(new Font("Tahoma", Font.PLAIN, 15));
		source.setBounds(330, 193, 111, 20);
		add(source);
                
                 JLabel destination = new JLabel("Destination");
		destination.setFont(new Font("Tahoma", Font.PLAIN, 15));
		destination.setBounds(420, 193, 111, 20);
                add(destination);

		
                JLabel pname = new JLabel("P_name");
		pname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pname.setBounds(516, 193, 111, 20);
		add(pname);
                
                JLabel status = new JLabel("Status");
                status.setFont(new Font("Tahoma", Font.PLAIN,15));
                status.setBounds(615, 193, 111, 20);
                add(status);
                
               
                   JButton cancle = new JButton("Cancle");
                    cancle.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        try{
                            conn c = new conn();
                            String b = t.getText();
                             String unbook = "unbooked";
                            String update = "update ticket set status = '"+unbook+"' where ticket_no ='"+b+"'";
                            c.s.executeUpdate(update);
                           
                           String input = "insert into cancellation select * from ticket where ticket_no = '"+b+"'";
                           c.s.executeUpdate(input);
                           
                          
                            String str = "select bcode, jny_date, jny_time, src, dst, P_name, status from ticket where ticket_no ='"+b+"' ";
                            ResultSet rs = c.s.executeQuery(str);
                       
                            table.setModel(DbUtils.resultSetToTableModel(rs));
                           
                            String delete = "delete from ticket where ticket_no = '"+b+"'";
                           c.s.execute(delete);
                            
                            
                        }catch(Exception ex){
                            System.out.println("Error"+ex);
                        }
                        
                    }
                    
                });
            
                 cancle.setBounds(280, 110,90 ,30 );
                 cancle.setFont(new Font("Tahoma",Font.PLAIN,15));
                 cancle.setBackground(Color.BLACK);
                 cancle.setForeground(Color.WHITE);
                 add(cancle);
                 
                 
                  
                
               
             
  
    setVisible(true);
    setLocation(400,200);
    setSize(750,500);
}
 public static void main(String[] arg){
        new cancle_ticket();
 
}
   
}
