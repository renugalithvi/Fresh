
	package org.stepdefinition;

	import org.basee.*;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import io.cucumber.core.api.Scenario;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;

	public class Hooks extends BaseClass {
		@Before
		public void bef() {
			System.out.println("Before scenario>>>>>");
			launchBrowser();


			toMaximize();
		}

		@Before(order=34)
		public void befsc1() {
			System.out.println("bef1");

		}

		@Before(order=21)
		public void befsc2() {
			System.out.println("bef2");

		}

		@Before(order=5)
		public void befsc3() {
			System.out.println("bef3");

		}

	@After
		public void aft(Scenario s) {
			if(s.isFailed()) {
				TakesScreenshot tk=(TakesScreenshot)driver;
				byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
				s.embed(screen,"image/png");
			}
			
			toQuit();
		}

		@After(order=2)
		public void aftsc1() {

			System.out.println("fsc1");
		}
		@After(order=5)
		public void aftsc2() {

			System.out.println("fsc2");
		}
		@After(order=1)
		public void aftsc3() {

			System.out.println("fsc3");
		}
		@After(order=8)
		public void aftsc4() {

			System.out.println("fsc4");
			System.out.println("hai");
			System.out.println("its a new branch");
			System.out.println("reeee");
			
		}

	}



