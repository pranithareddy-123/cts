package webpage;

import java.sql.*;  


public class Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/test","root","root");  
			 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Employees");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			
	}


