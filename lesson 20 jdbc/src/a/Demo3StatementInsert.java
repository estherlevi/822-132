package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3StatementInsert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1"; // address of our database
		// RDBMS credentials:
		String user = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			// with Statement we can execute SQL commands
			Statement stmt = con.createStatement();
			// set the SQL command
			String sql = "insert into person values(202, 'Dina', 22);";
			// execute the SQL command
			stmt.executeUpdate(sql);
			// print the successful sql command
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
