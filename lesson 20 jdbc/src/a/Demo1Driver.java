package a;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Demo1Driver {

	public static void main(String[] args) {

		// to connect to a database we need a driver

		// the driver is part of the database vendor implementation

		Enumeration<Driver> drivers = DriverManager.getDrivers();

		System.out.println("list of drivers:");
		while (drivers.hasMoreElements()) {
			System.out.println(drivers.nextElement());
		}
		System.out.println("===============");

	}

}
