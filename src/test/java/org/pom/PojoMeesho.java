package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoMeesho extends BaseClass {
	
	public PojoMeesho() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement search;
	
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement electroniics;
	
	
	@FindBy(xpath="//p[text()='Smartwatches']")
	private WebElement smartwatch;
	
	@FindBy(xpath="//span[text()='10371']")
	private WebElement scrldown;
	
	@FindBy(xpath="(//p[text()='Elite Smart Watches'])[1]")
	private WebElement selectWatch;
	
	@FindBy(xpath="//span[text()='ID116 Smart Watches']")
	private WebElement productName;
	
	@FindBy(xpath="(//div[@class='sc-jRQAMF dvZTPy'])[1]")
	private WebElement details;
	
	@FindBy(xpath="//span[text()='Buy Now']")
	private WebElement BuyNow;
	
	@FindBy(xpath="//span[text()='Name']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneNo;
	
	@FindBy(xpath="//input[@id='address_line_1']")
	private WebElement buildingName;
	
	@FindBy(xpath="//input[@id='address_line_2']")
	private WebElement areaName;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityName;
	
	@FindBy(xpath="//span[text()='State']")
	private WebElement stateName;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getElectroniics() {
		return electroniics;
	}

	public WebElement getSmartwatch() {
		return smartwatch;
	}

	public WebElement getScrldown() {
		return scrldown;
	}

	public WebElement getSelectWatch() {
		return selectWatch;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getDetails() {
		return details;
	}

	public WebElement getBuyNow() {
		return BuyNow;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getBuildingName() {
		return buildingName;
	}

	public WebElement getAreaName() {
		return areaName;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getStateName() {
		return stateName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
