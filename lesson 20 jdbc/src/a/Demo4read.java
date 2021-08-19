package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4read {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1"; // address of our database
		// RDBMS credentials:
		String user = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			// with Statement we can execute SQL commands
			Statement stmt = con.createStatement();
			// set the SQL command
			String sql = "select * from person";
			// execute the SQL command
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);

			// get the data from the ResultSet
			rs.next(); // go the line 1 if exist
			rs.next(); // go the line 2 if exist
			rs.next(); // go the line 3 if exist
			int id = rs.getInt(1); // get the data from column 1 of the current row
			String name = rs.getString(2); // get the data from column 2 of the current row
			System.out.println(id);
			System.out.println(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
