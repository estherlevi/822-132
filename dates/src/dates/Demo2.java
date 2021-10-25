package dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Demo2 {

	public static LocalDateTime localDateTimeFromDate(Date date) {
		Instant instant = date.toInstant();
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
		LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
		return localDateTime;
	}

	public static Date dateFromLocalDateTime(LocalDateTime localDateTime) {
		ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
		Instant instant = zonedDateTime.toInstant();
		Date date = Date.from(instant);
		return date;
	}

	public static LocalDateTime localDateTimeFromDateJava9(Date date) {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		return localDateTime;
	}
}
