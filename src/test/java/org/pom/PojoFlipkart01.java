package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFlipkart01 extends BaseClass {

	public PojoFlipkart01() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[contains(@placeholder,'Search for product')]")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickIcon;

	@FindBy(xpath = "(//a[contains(text(),'Unstitched Crepe Salwar Suit Material Floral Print')])[3]")
	private WebElement salwarSuit;

	

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getClickIcon() {
		return clickIcon;
	}

	public WebElement getSalwarSuit() {
		return salwarSuit;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
