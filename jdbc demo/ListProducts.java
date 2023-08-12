package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListProducts {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con = DriverManager.getConnection
				 ("jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;database=msdb;encrypt=true;trustServerCertificate=true")) {
			
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery("select prodname, price from products order by price ");
			   
		    
			while(rs.next()) {
				System.out.printf("%-50s %8.2f\n", 
						  rs.getString("prodname"), rs.getDouble(2));
			}
			rs.close();
			st.close();
		}
	}
}
