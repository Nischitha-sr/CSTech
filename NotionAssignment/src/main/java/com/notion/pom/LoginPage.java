package com.notion.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="username")
private WebElement untextbox; 
@FindBy(name="password")
private WebElement pwtxtbox;
@FindBy(xpath="//button[text()='Login']")
private WebElement loginBtn;
public WebElement getLoginBtn() {
	return loginBtn;
}
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getUnTbx() {
	return untextbox;
}
public WebElement getPwTbx() {
	return pwtxtbox;
}
}
