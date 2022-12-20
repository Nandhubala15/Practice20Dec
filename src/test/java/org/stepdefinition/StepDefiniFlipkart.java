package org.stepdefinition;

import java.time.Duration;
import java.util.Set;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.PojoFlipkart01;
import org.pom.PojoFlipkart02;
import org.pom.PojoMeesho;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefiniFlipkart extends BaseClass {
	PojoFlipkart01 page1;
	PojoFlipkart02 page2;
	PojoMeesho pojo;

	@Given("launch flipkart URL")
	public void launch_flipkart_URL() {

		launchUrl("https://www.flipkart.com/");

	}

	@When("Search Salwar suits")
	public void search_Salwar_suits() {

		page1 = new PojoFlipkart01();
		page1.getSearchBox().sendKeys("Salwar Suits");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		page1.getClickIcon().click();

	}

	@When("Select a suit")
	public void select_a_suit() {
		page1 = new PojoFlipkart01();
		page1.getSalwarSuit().click();

		toSwitchtoWindow(1);

	}

	@When("add into cart")
	public void add_into_cart() {

		page2 = new PojoFlipkart02();
		page2.getTopLength().click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		page2.getBottomLength().click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		page2.getAddCart().click();

	}

	@Then("Print the Order Details")
	public void print_the_Order_Details() {

		page2 = new PojoFlipkart02();
		WebElement orderStaus = page2.getOrderStaus();
		String text = orderStaus.getText();
		System.out.println(text);
	}

	@Given("Launch meesho url")
	public void launch_meesho_url() {
		launchUrl("https://www.meesho.com/");

	}

	@When("Search smart Watch")
	public void search_smart_Watch() {

		pojo = new PojoMeesho();
		WebElement electroniics = pojo.getElectroniics();
		toMoveCursor(electroniics);
		pojo.getSmartwatch().click();

	}

	@When("Scroll down")
	public void scroll_down() {

//		pojo = new PojoMeesho();
//		WebElement scrldown = pojo.getScrldown();
//		toScrollDown(scrldown);

	}

	@When("select any smart watch")
	public void select_any_smart_watch() {
		pojo = new PojoMeesho();
		pojo.getSelectWatch().click();

	}

	@Then("print the product Details")
	public void print_the_product_Details() {
		
		

		pojo = new PojoMeesho();
		WebElement productName = pojo.getProductName();
		String text = productName.getText();
		System.out.println(text);
		WebElement details = pojo.getDetails();
		String text2 = details.getText();
		System.out.println(text2);

	}

	@Then("Buy")
	public void buy() {
		pojo = new PojoMeesho();
		pojo.getBuyNow().click();

	}

	@Then("Enter Mobile Number")
	public void enter_Mobile_Number() {
		//pojo = new PojoMeesho();

	}

	@Then("enter details")
	public void enter_details() {

		pojo = new PojoMeesho();
		pojo.getName().sendKeys("Nandhu");
		pojo.getPhoneNo().sendKeys("9090909090");
		pojo.getBuildingName().sendKeys("Pearl Apartment");
		pojo.getAreaName().sendKeys("Nandanam");
		pojo.getPincode().sendKeys("567098");
		pojo.getCityName().sendKeys("Chennai");
		pojo.getStateName().sendKeys("Tamil Naadu");

	}

}
