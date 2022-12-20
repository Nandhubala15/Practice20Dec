package org.stepdefinition;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {

	@Before

	public void browserLaunching() {
		toOpenChromeDriver();
		Maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

	}

	@After(order = 1)
	public void closebrow() {

		toCloseBrowser();

	}

	@After
	public void takeSnap(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");

		}
	}
}
