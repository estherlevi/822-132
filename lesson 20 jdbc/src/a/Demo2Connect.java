package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2Connect {

	public static void main(String[] args) {
		// to get a connection we need a url - Uniform Resource Locator
		String protocol = "jdbc:mysql://";
		String ip = "127.0.0.1:"; // this computer
		String port = "3306/"; // the mysql server application
		String rout = "db1"; // database name
		String url = protocol + ip + port + rout;
		System.out.println(url);

		String user = "root";
		String password = "1234";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("connected to " + con);
			con.close(); // close the connection when done
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
