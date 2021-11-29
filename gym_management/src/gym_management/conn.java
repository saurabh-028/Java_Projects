package gym_management;

import java.sql.*;

public class conn {
	
	Connection con;
	Statement stm;
	
	public static void main(String[] args){
    	new conn();
        
}
	public conn(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql:/// gymmanagement","root","");
			stm = con.createStatement();
			 
			
		} catch (Exception e) { 
			
			System.out.println(e);
		}
		
	}

}
