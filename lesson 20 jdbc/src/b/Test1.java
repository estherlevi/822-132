package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {

		List<Person> persons = Person.getRandomPerson(200);

		String url = "jdbc:mysql://localhost:3306/db1"; // address of our database
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();

			for (Person person : persons) {
				String sql = "insert into person values(" + person.getId() + ", '" + person.getName() + "', "
						+ person.getAge() + ")";
				stmt.executeUpdate(sql);
			}

			System.out.println("done");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
