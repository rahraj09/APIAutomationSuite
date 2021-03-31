package exchangeratetest.runner;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

public class TestBase {
	protected String server = LoadProperties().getProperty("url");

	public Properties LoadProperties() {
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Rahul\\eclipse-workspace\\ExchangeRateAPIProject\\src\\test\\resources\\config.properties");
			prop.load(fis);
			return prop;
		} catch (Exception e) {
			System.out.println("File not found exception thrown for config.properties file");
			return null;
		}

	}

	/* Function to get the Current European Date and Time */

	public static String EuropeanDate() {
		Date date1 = new java.util.Date();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		// Use Madrid's time zone to format the date in
		df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));

		String date = df.format(date1);
		return date;
	}
}