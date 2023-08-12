package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrice2 {

	public static void main(String[] args) throws SQLException {
		int prodid = 102;
		int price = 6000;
		
		try(Connection con = DriverManager.getConnection
				 ("jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;database=msdb;encrypt=true;trustServerCertificate=true")) {
			
			PreparedStatement ps = con.prepareStatement
					  ("update products set price = ? where prodid = ?");
			// replace parameters with values 
			ps.setInt(1,price);
			ps.setInt(2, prodid);
			
			int count = ps.executeUpdate();
			if(count == 1)
				System.out.println("Updated!");
			else
				System.out.println("Product Id Not Found!");
			ps.close();
		}
	}
}
