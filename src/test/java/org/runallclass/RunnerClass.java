package org.runallclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue = "org.stepdefinition",
        dryRun = false, strict = true, snippets = SnippetType.UNDERSCORE, tags = "@Sanity", plugin = {
		"html:C:\\Users\\USER-PC\\eclipse-workspace\\BDDFlipkart\\Reports\\HTMLReport",
        "junit:C:\\Users\\USER-PC\\eclipse-workspace\\BDDFlipkart\\Reports\\JunitReport\\Shopping.xml",
		"json:C:\\Users\\USER-PC\\eclipse-workspace\\BDDFlipkart\\Reports\\JsonReport\\Shopping.json",
		"rerun:Rerun\\flipkart.txt" })

public class RunnerClass {

	@AfterClass

	public static void getReport() {
		JVMReportgeneration
				.buildReport("C:\\\\Users\\\\USER-PC\\\\eclipse-workspace\\\\BDDFlipkart\\\\Reports\\\\JsonReport\\\\Shopping.json");

	}

}
