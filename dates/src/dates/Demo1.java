package dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo1 {

	public static void main(String[] args) {

		java.util.Date date = new java.util.Date();
		java.time.LocalDateTime dateTime = convertUtilDateToLocalDate(date);
		System.out.println("LocalDateTime: " + dateTime);

		System.out.println(convertLocalDateToUtilDate(dateTime));

	}

	public static java.time.LocalDateTime convertUtilDateToLocalDate(java.util.Date dateUtil) {
		// 1. get an Instant from the Date
		// Instant objects are time-zone agnostic — just points on the timeline.
		java.time.Instant instant = dateUtil.toInstant();
		System.out.println("Instant: " + instant);

		// 2. get the system zone id:
		/**
		 * A time-zone ID, such as Europe/Paris.
		 * 
		 * A ZoneId is used to identify the rules used to convert between an Instant and
		 * a LocalDateTime. There are two distinct types of ID:
		 * 
		 * •Fixed offsets - a fully resolved offset from UTC/Greenwich, that uses the
		 * same offset for all local date-times
		 * 
		 * •Geographical regions - an area where a specific set of rules for finding the
		 * offset from UTC/Greenwich apply
		 */
		java.time.ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("ZoneId: " + zoneId);

		// 3. get a ZonedDateTime from the Instant

		/**
		 * ZonedDateTime is a date-time with a time-zone in the ISO-8601 calendar
		 * system,such as 2007-12-03T10:15:30+01:00 Europe/Paris. s * This class handles
		 * conversion from the local time-line of LocalDateTime to the instant time-line
		 * of Instant. The difference between the two time-lines is the offset from
		 * UTC/Greenwich, represented by a ZoneOffset.
		 * 
		 * Converting between the two time-lines involves calculating the offset using
		 * the rules accessed from the ZoneId.
		 */
		java.time.ZonedDateTime zonedDateTime = instant.atZone(zoneId);
		System.out.println("ZonedDateTime: " + zonedDateTime);

		return zonedDateTime.toLocalDateTime();

	}

	public static java.util.Date convertLocalDateToUtilDate(java.time.LocalDateTime dateTime) {
		java.time.ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = dateTime.atZone(zoneId);
		java.time.Instant instant = zonedDateTime.toInstant();
		java.util.Date date = java.util.Date.from(instant);
		return date;
	}

	// all the above can be done in a single line:
	public static java.time.LocalDateTime convertUtilDateToLocalDateShort(java.util.Date dateUtil) {
		return dateUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	public static java.time.LocalDateTime convertUtilDateToLocalDateShortSteps(java.util.Date dateUtil) {
		// 1. Date to Instant:
		java.time.Instant instant = dateUtil.toInstant();
		// 2. Instant to ZonedDateTime:
		java.time.ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
		// 3. ZonedDateTime to LocalDateTime
		java.time.LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
		return localDateTime;
	}

	public static java.util.Date convertLocalDateToUtilDateShort(java.time.LocalDateTime dateTime) {
		return java.util.Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	public static java.util.Date convertLocalDateToUtilDateShortSteps(java.time.LocalDateTime dateTime) {
		// 1. LocalDateTime to ZonedDateTime
		java.time.ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault());
		// 2. ZonedDateTime to Instant
		java.time.Instant instant = zonedDateTime.toInstant();
		// 3. Instant to Date
		java.util.Date date = java.util.Date.from(instant);
		return date;
	}

}
