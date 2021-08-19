package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Statement {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			// with Statement we can execute SQL commands
			Statement stmt = con.createStatement();
			// set the SQL command
			String sql = "insert into person values(201, 'Avi', 55);";

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
