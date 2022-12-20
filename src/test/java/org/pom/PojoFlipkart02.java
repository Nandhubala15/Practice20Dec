package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFlipkart02 extends BaseClass {
	
	public PojoFlipkart02() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='2 m']")
	private WebElement topLength;

	@FindBy(xpath = "//a[text()='2.35 m']")
	private WebElement bottomLength;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addCart;
	
	@FindBy(xpath="//div[text()='Out Of Stock']")
	private WebElement orderStaus;
	
	public WebElement getTopLength() {
		return topLength;
	}

	public WebElement getBottomLength() {
		return bottomLength;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getOrderStaus() {
		return orderStaus;
	}

}
