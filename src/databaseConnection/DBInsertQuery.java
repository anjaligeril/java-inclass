package databaseConnection;

import java.sql.*;

public class DBInsertQuery {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RQ3CM21;databaseName=Login;integratedSecurity=true");
			
			Statement stmt=con.createStatement();
			
			System.out.println("Created DB Connection");
			
			stmt.executeUpdate("insert into Login values('l1','l@gmail.com','l1')");
			 stmt.executeUpdate("insert into Login values('l2','l2@gmail.com','l2')");
			
			
			
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
