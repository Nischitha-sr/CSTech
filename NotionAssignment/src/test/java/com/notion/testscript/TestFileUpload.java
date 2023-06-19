package com.notion.testscript;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.notion.generic.BaseClass;
import com.notion.generic.FileUtility;
import com.notion.pom.homePage;
import com.notion.pom.LoginPage;


public class TestFileUpload extends BaseClass {
	@Test
	public void testFileUpload() throws Throwable {
		LoginPage loginPg = new LoginPage(driver);
		FileUtility fileUtils = new FileUtility();
		String username = fileUtils.readDataFromPropertyFile("username");
		String password = fileUtils.readDataFromPropertyFile("password");
		loginPg.getUnTbx().sendKeys(username);
		loginPg.getPwTbx().sendKeys(password);
		loginPg.getLoginBtn().click();
		homePage homePg = new homePage(driver);
		homePg.getDropdownBn().click();
		homePg.getOrderBn().click();
		homePg.getbulkOrdesBn().click();
		WebElement fileUpload = homePg.getChooseFileButon();
		String relativePath = fileUtils.readDataFromPropertyFile("path");
		File f1 = new File(relativePath);
		String path = f1.getAbsolutePath();
		fileUpload.sendKeys(path);
		homePg. getImportBn().click();
		WebElement table = homePg.getWebtbl();
		File src = table.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File destFile = new File("./screenshot/table " + timeStamp + ".png");
		FileUtils.copyFile(src, destFile);
	}
}
