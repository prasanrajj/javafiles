package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TotalSales {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con = DriverManager.getConnection
				 ("jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;database=msdb;encrypt=true;trustServerCertificate=true")) {
			
			var ps = con.prepareStatement
					 ("select isnull(sum(amount),0) from sales where prodid = ?");
			ps.setInt(1, 122);
			
			ResultSet rs =  ps.executeQuery();
			rs.next();
		    var amount = rs.getDouble(1);
		    System.out.println(amount);
			 
			rs.close();
			ps.close();
		}
	}
}
