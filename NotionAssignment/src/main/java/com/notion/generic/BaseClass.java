package com.notion.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	private FileUtility fileUtils;

	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileUtility  fileUtils = new FileUtility();
		String url = fileUtils.readDataFromPropertyFile("url");
		driver.get(url);
	}

	@AfterClass
	public void closeApp() {
		driver.quit();
	}

}
