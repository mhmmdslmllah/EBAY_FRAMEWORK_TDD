package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	

	public Configuration() {
		loadProperties();
	}

	public void loadProperties() {

		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
/*
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		// configuration.loadProperties();
		System.err.println(configuration.getProperties().get("url"));

	}
	*/
}
