package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection
				 ("jdbc:sqlserver://srikanthlaptop\\sqlexpress:1433;user=sa;password=sa;encrypt=true;trustServerCertificate=true");
		System.out.println(con.getClass());
		System.out.println("Connected To Sql Server!");
		con.close();
	}

}
