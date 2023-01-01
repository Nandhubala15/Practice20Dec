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

	
	@After(order=5)
	public void scrennsh(Scenario s) {

		if (s.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] snap = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(snap, "image/png");

		}
		
		}
	@After(order=1)
	public void closebrowser() {

		driver.quit();


	}
}

