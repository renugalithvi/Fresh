
package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JVMReport {
	public static void generateJvmReport(String jsonfile) {
		File f = new File("C:\\Users\\A R\\eclipse-workspace123\\CucumberFresh\\Report\\JVMReport");
		Configuration c = new Configuration(f, "Facebook application");
		c.addClassifications("plateform", "windows");
		c.addClassifications("jdk", "1.8");
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
