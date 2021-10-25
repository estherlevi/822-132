package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		List<Person> persons = Person.getRandomPerson(200);

		String url = "jdbc:mysql://localhost:3306/db1"; // address of our database
		String user = "root";
		String password = "1234";

		String sql = "insert into person values(?, ?, ?)";

		try (Connection con = DriverManager.getConnection(url, user, password);) {
//			Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement(sql);

			for (Person person : persons) {
				pstmt.setInt(1, person.getId());
				pstmt.setString(2, person.getName());
				pstmt.setInt(3, person.getAge());
//				stmt.executeUpdate(sql);
				pstmt.executeUpdate();
			}

			System.out.println("done");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
