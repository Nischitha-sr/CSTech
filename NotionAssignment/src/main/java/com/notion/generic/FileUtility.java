package com.notion.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/cd.property");
		Properties p1 = new Properties();
		p1.load(fis);
		String value = p1.getProperty(key);
		return value;
	}
}
