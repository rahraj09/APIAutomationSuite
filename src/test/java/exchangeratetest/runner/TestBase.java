package exchangeratetest.runner;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

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

}