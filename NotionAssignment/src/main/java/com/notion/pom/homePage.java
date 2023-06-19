package com.notion.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	@FindBy(xpath="//span[text()='chevron_right']")
	private WebElement dropdownMenuBtn; 
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orderBtn;
	@FindBy(xpath="//button[text()='Add Bulk Orders']")
	private WebElement bulkOrdersBtn;
	@FindBy(xpath="//input[@type='file']")
	private WebElement chooseFileBtn;
	@FindBy(xpath="//button[text()='Import']")
	private WebElement importBtn;
	@FindBy(xpath="//table[@class='MuiTable-root css-9177x2']")
	private WebElement webtable;
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getDropdownBn() {
		return dropdownMenuBtn;
	}
	public WebElement getOrderBn() {
		return orderBtn;
	}
	public WebElement getbulkOrdesBn() {
		return bulkOrdersBtn;
	}
	public WebElement getChooseFileButon() {
		return chooseFileBtn;
	}
	public WebElement getImportBn() {
		return importBtn;
	}
	public WebElement getWebtbl() {
		return webtable;
	}
}
