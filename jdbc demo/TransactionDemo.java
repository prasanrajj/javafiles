package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionDemo {

	public static void updateProduct(PreparedStatement ps, int prodid) throws Exception {
		ps.setInt(1, prodid);
		int count = ps.executeUpdate();
		if (count == 0)
			throw new Exception();
	}

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection(
					"jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;database=msdb;encrypt=true;trustServerCertificate=true");
			c.setAutoCommit(false);

			try {
				PreparedStatement ps = 
						c.prepareStatement("Update products set price= price*1.1 where prodid=?");

				updateProduct(ps, 101);
				updateProduct(ps, 102);
				updateProduct(ps, 106);

				c.commit();
				System.out.println("Updated products and committed!");
			} catch (Exception e) {
				System.out.println("Process failed");
				c.rollback();
			} finally {
				c.close();
			}
		} catch (Exception ex) {
			System.out.println("Connection issue!");
		}
	}

}
