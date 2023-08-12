package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePrice {

	public static void main(String[] args) throws Exception {
		int prodid = 122;
		int price = 6000;
		
		try(Connection con = DriverManager.getConnection
				 ("jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;database=msdb;encrypt=true;trustServerCertificate=true")) {
			
			Statement st = con.createStatement();
			int count = st.executeUpdate
			   ("update products set price = " + price + " where prodid = " + prodid);
			if(count == 1)
				System.out.println("Updated!");
			else
				System.out.println("Product Id Not Found!");
			st.close();
		}
	}
}
