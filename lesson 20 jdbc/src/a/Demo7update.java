package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo7update {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			Statement stmt = con.createStatement();
			String sql = "update person set age = 60 where id = 1";
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
