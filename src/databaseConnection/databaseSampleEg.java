package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseSampleEg {

	public static void main(String[] args) {
		
	try {
		
		//Registering DBdriver Class with Driver Manger
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//Establish connection with the database
		
		Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RQ3CM21;databaseName=HR;integratedSecurity=true");
		
		//create object of Statement
		
		Statement stmt=con.createStatement();
		
		System.out.println("Created DB Connection");
		
		
		//execute Query
		ResultSet rs=stmt.executeQuery("select country_id,country_name from countries");
		
		while(rs.next()) {
			System.out.println(rs.getString("Country_id"));
			System.out.println(rs.getString("Country_name"));
		}
		
		rs.close();
		con.close();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	}

}
