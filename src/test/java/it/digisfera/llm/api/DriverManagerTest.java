package it.digisfera.llm.api;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

public class DriverManagerTest {

	private static final String PREFIX = Driver.URL_PREFIX + "prefix:";

	private static int counter;

	@BeforeClass
	public static void setUp() {
		DriverManager.registerDriver(new Driver() {

			@Override
			public Connection connect(String url, Properties properties) throws IOException {
				counter++;
				return null;
			}

			@Override
			public boolean acceptsURL(String url) {
				return url != null && url.startsWith(PREFIX);
			}
		});
	}

	@Test
	public void test() throws IOException {
		counter = 0;
	    assertThrows(IllegalArgumentException.class, () -> {
    		DriverManager.connect("http://localhost", null);
        });
		assertEquals(0, counter);
		DriverManager.connect(PREFIX + "http://localhost", null);
		assertEquals(1, counter);
	}

}
