package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SalesReport {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection(
				"jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;database=msdb;encrypt=true;trustServerCertificate=true");

		PreparedStatement ps = con.prepareStatement(
				"select Invno,ProdName,Qty,Amount,convert(varchar(10),Transdate,103) as transdate from products p JOIN sales s ON (s.Prodid = p.ProdId) where p.CatCode= ?");
		ps.setString(1, "pr");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.printf("%3d %-30s %3d  %8d %-10s\n",
					rs.getInt(1), rs.getString(2), rs.getInt(3), 
					rs.getInt(4), rs.getString(5));
		}

		ps.close();

		con.close();

	}

}
