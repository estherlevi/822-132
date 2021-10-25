package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6readMetaData {

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

			ResultSetMetaData rsMeta = rs.getMetaData();
			for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
				System.out.print(rsMeta.getColumnLabel(i) + ", ");
			}
			System.out.println();

			// get the data from the ResultSet
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}

			// get meta data
			System.out.println(rsMeta.getColumnTypeName(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
