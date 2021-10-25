package b;

import java.time.LocalDate;
import java.util.Calendar;

public class DatesConversion {

	public static void main(String[] args) {

		// ====== there are 4 types of dates:
		// 1. java.sql.Date - appropriate for JDBC (SQL)
		// 2. java.time.LocalDate - best choice for general date representation
		// less recommended
		// 3. java.util.Date - most general and old
		// 4. java.util.Calendar - old and heavy

		java.util.Date dateUtil = new java.util.Date();
		java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());

		System.out.println(dateUtil);
		System.out.println(dateSql);

		LocalDate localDate = LocalDate.now();
		// convert localDate to java.sql.Date
		dateSql = java.sql.Date.valueOf(localDate);

		// convert java.sql.Date to localDate
		localDate = dateSql.toLocalDate();

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

	}

}
