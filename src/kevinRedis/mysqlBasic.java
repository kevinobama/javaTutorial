package kevinRedis;

import java.sql.*;

public class mysqlBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mysql start");
		
		try {  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/robo2_1228","root","1");  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		} catch(Exception e) { 
			System.out.println(e);
		}		
		
		System.out.println("mysql end");
	}

}
