package it.digisfera.llm.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DriverManager {

	private static List<Driver> drivers = new ArrayList<>();

	public static Connection connect(String url, String username, String password) throws IOException {
		Driver driver = getDriver(url);
		if (driver == null) {
			throw new IllegalArgumentException("Driver not found for " + url);
		}
		return driver.connect(url, username, password);
	}

	public static Driver getDriver(String url) {
		for (Driver driver : drivers) {
			if (driver.acceptsURL(url)) {
				return driver;
			}
		}
		return null;
	}

	public static void registerDriver(Driver driver) {
		drivers.add(driver);
	}

	private DriverManager() {}
}
