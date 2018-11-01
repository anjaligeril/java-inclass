package databaseConnection;

import java.sql.*;


public class DBDeleteQuery {

	public static void main(String[] args) {


		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RQ3CM21;databaseName=Login;integratedSecurity=true");
			
			Statement stmt= con.createStatement();
			
			System.out.println("Created DB Connection");
			
			int value=stmt.executeUpdate("delete from Login where loginId='l1'");
			
			System.out.println(value+" row deleted");
			
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
