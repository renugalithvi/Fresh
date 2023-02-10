package org.pojo;

import org.basee.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPojo extends BaseClass {
	public HotelPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement txtUser;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtPass;
	@FindBy(xpath = "//input[@name='login']")
	private WebElement btnLogin;
	
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
