package org.runallclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\\\flipkart.txt", glue = "org.stepdefinition",
plugin="rerun:C:\\Users\\USER-PC\\eclipse-workspace\\BDDFlipkart\\Rerun\\flipkart.txt")

public class RerunClass {

}
