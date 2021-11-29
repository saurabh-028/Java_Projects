package busbooking;
import java.sql.*;
public class conn {
	
	Connection c;
	Statement s;
	 public static void main(String[] args){
	    	new conn();
	        
	}
	
	public conn(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c =  DriverManager.getConnection("jdbc:mysql:///busbooking","root","");
			System.out.println("database connected");
			s = c.createStatement();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
