package org.basee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Child extends BaseClass{
	 
		public static void main(String[] args) {
			launchBrowser();
			loadUrl("https://www.facebook.com/");
			toMaximize();
			toTitle();
			toCurrentUrl();
			WebElement email = driver.findElement(By.id("email"));
			fill(email, "renurenu123@gmail.com");
			WebElement pass = driver.findElement(By.id("pass"));
			fill(pass, "renurenu123");
			WebElement login = driver.findElement(By.name("login"));
			toClick(login);
			toQuit();
			
			
			
		}

}
