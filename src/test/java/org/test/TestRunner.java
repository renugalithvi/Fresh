
package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", monochrome = true, dryRun = false,  plugin = {
		"html:C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Report\\htmlreport",
		"json:C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Report\\jsonreport\\fb1.json",
		"junit:C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Report\\junitreport\\faceee2.xml",
		"rerun:C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Rerun\\rear.txt"})

public class TestRunner {
@AfterClass
	public static void report() {
		JVMReport.generateJvmReport("C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Report\\jsonreport\\fb1.json");

	}
}
