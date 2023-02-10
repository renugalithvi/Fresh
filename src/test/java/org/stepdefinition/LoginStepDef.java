package org.stepdefinition;

import org.basee.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.pojo.FBForgot;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass{
	
	@Given("User have to click the forgotten keyword")
	public void user_have_to_click_the_forgotten_keyword() {
		FBForgot f=new FBForgot();
		toClick(f.getForgotKey());
		
	}


	
	   
	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {
	    launchBrowser();
	    loadUrl("https://www.facebook.com/");
toMaximize();

	}
	@When("user have to enter email or phoneno")
	public void user_have_to_enter_email_or_phoneno() {
		 FBForgot f=new FBForgot(); 
		 fill(f.getTxtUser(), "vanitha123@gmail.com");
	}



	

	@Then("user have to click the search button")
	public void user_have_to_click_the_search_button() {
		 FBForgot f=new FBForgot(); 
		  toClick(f.getSearch());
	}

	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		LoginPojo l=new LoginPojo();
		
		
		 fill(driver.findElement(By.id("email")),"renu123@gmail.com");
		   fill(driver.findElement(By.id("pass")), "renu2341");
	    
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		LoginPojo l=new LoginPojo();
		l.getBtnLogin().click();
	   
	}

	@Then("user should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("to check theurl", url.contains( "https://www.facebook.com/"));
			
	}

	@When("user enter valid username and invalidpassword")
	public void user_enter_valid_username_and_invalidpassword() {
		LoginPojo l=new LoginPojo();
		   fill(l.getTxtUser(), "werty@gmail.com");
		   fill(l.getTxtPass(), "gertjdsnd");
		   
	}


	@When("user enter{string} and {string}")
	public void user_enter_and(String user, String pass) {
LoginPojo l=new LoginPojo();
fill(l.getTxtUser(),user);
fill(l.getTxtPass(),pass);

	}



}