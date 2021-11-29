package busbooking;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;


public class Main extends JFrame {	
	
	public Main(){
		super("BUS MANAGMENT SYSTEM");
		initialize();
		
	}
	 	
	 	
	private void initialize(){
 		setForeground(Color.CYAN);
 		setLayout(null);
 		
 	
 		JLabel NewLabel = new JLabel("");
 		NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("busbooking/icon/Main.jpg")));
 		NewLabel.setBounds(0, 0, 1920, 990);
 		add(NewLabel);
 		
 		JLabel bb = new JLabel("WELCOME  TO  HOBS & SHAW  TRAVELS");
 		bb.setForeground(Color.BLACK);
                
 		bb.setFont(new Font("Tahoma",Font.BOLD,36));
 		bb.setBounds(400, 40, 1000, 55);
 		NewLabel.add(bb);
 		
 		
 		JButton addpass = new JButton("Add_Passenger");
 		addpass.setForeground(Color.WHITE);
        addpass.setBackground(Color.BLACK);
 		addpass.setBounds(100, 150, 150 , 40 );
 		addpass.setFont(new Font("serie",Font.BOLD,15));
 		add(addpass);
                
        JButton addbus = new JButton("Add_Bus");
 		addbus.setForeground(Color.WHITE);
        addbus.setBackground(Color.BLACK);
 		addbus.setBounds(100, 250, 150 , 40);
 		addbus.setFont(new Font("serie",Font.BOLD,15));
 		add(addbus);
 		
 	
 		JButton journey = new JButton("Bus_Info");
 		journey.setForeground(Color.WHITE);
        journey.setBackground(Color.BLACK);
 		journey.setBounds(100, 350, 150 , 40);
 		journey.setFont(new Font("serie",Font.BOLD,15));
                
 		add(journey);
 		
 		
 		JButton ticket = new JButton("Add_Ticket");
 		ticket.setForeground(Color.WHITE);
        ticket.setBackground(Color.BLACK);
 		ticket.setBounds(100, 450, 150 , 40);
 		ticket.setFont(new Font("serie",Font.BOLD,15));
 		add(ticket);
                
        JButton show = new JButton("View_Ticket");
 		show.setForeground(Color.WHITE);
        show.setBackground(Color.BLACK);
 		show.setBounds(100, 550, 150 , 40);
 		show.setFont(new Font("serie",Font.BOLD,15));
 		add(show);
 		
 		
        JButton cancle = new JButton("Cancle_Ticket");
 		cancle.setForeground(Color.WHITE);
        cancle.setBackground(Color.BLACK);
 		cancle.setBounds(100, 650, 150 , 40);
 		cancle.setFont(new Font("serie",Font.BOLD,15));
 		add(cancle);
 		
                
 		
 		
 		
 		addpass.addActionListener(new ActionListener(){
 	            public void actionPerformed(ActionEvent ae){
 	                new passenger();
 	            }
 	            
 		});
 		
       
        ticket.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new show_ticket();
            }
            
	});
        journey.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent ae) {
        		new journey();
        		
        	}
        });
        
        addbus.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	                new admin_login();
	            }
	            
		});
         cancle.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	                new cancle_ticket();
	            }
	            
		});
         show.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae){
	                new ticket_show();
	            }
	            
		});
   

 		
 		setSize(1920,1010);
        setLocation(0,0);
 		setVisible(true);
 	}

   
		public static void main(String[] args) {
			new Main().setVisible(true);;
			
 		}
 	}
 	


	

