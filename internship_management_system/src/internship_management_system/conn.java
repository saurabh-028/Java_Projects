package internship_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
	
	Connection c;
	Statement s;
	 public static void main(String[] args){
	    	new conn();
	        
	}
	public conn(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c =  DriverManager.getConnection("jdbc:mysql:///internship_management","root","");
			s = c.createStatement();
			System.out.println("database connected");
			
		} catch (Exception e) { 
	
			e.printStackTrace();
		}
		
	}

}
