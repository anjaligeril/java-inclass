package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUpdate_QueryMethod {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RQ3CM21;databaseName=pubs;integratedSecurity=true");
			
			Statement stmt= con.createStatement();
			
			System.out.println("Created DB Connection");
			
			//String query="update jobs set job_desc='Senior Marketing Manager' where job_id='7'";
			
			String query="select job_id,job_desc from jobs";
			
			boolean b=stmt.execute(query);
			
			System.out.println(b);
			
			if(b) {
				ResultSet rs=stmt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getString("job_id"));
					System.out.println(rs.getString("job_desc"));
				}
			}else {
				int value=stmt.getUpdateCount();
				
				System.out.println(value+" updated");
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
