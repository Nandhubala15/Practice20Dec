package org.runallclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportgeneration {
	
	public static void buildReport(String jsonPath) {
		
		File f = new File("C:\\Users\\USER-PC\\eclipse-workspace\\BDDFlipkart\\Reports\\JVMReport");
		
		Configuration configure = new Configuration(f, "Online SHOPPING");
		
		configure.addClassifications("Platform", "Windows 10");
		configure.addClassifications("JDK", "Version 1.8");
        configure.addClassifications("Tool", "Eclipse Oxygen");
        
        List<String> li = new ArrayList<String>();
        li.add(jsonPath);
        
        ReportBuilder report = new ReportBuilder(li, configure);
        report.generateReports();



	}
	











}
