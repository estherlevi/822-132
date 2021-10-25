package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Part1TableBuild {

	public static void main(String[] args) {
		String sql = "create table book(";
		sql += "isbn VARCHAR(50), ";
		sql += "title VARCHAR(50), ";
		sql += "author VARCHAR(50), ";
		sql += "price FLOAT, ";
		sql += "pages INT, ";
		sql += "published DATE, ";
		sql += "language VARCHAR(20))";

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
