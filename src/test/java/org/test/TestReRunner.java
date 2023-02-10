

	package org.test;

import org.junit.AfterClass;
	import org.junit.runner.RunWith;
	import org.stepdefinition.JVMReport;

	import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "@Rerun\\rear.txt", glue = "org.stepdefinition",  plugin = {
			
			"rerun:C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Rerun\\rear.txt" })

	public class TestReRunner {
	@AfterClass
public static void report() {
			JVMReport.generateJvmReport("C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Report\\jsonreport\\fb.json");

	}}

	


