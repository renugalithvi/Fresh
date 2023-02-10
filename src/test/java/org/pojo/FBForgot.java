package org.pojo;

import org.basee.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBForgot extends BaseClass {
	public FBForgot() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[text()='Forgotten password']")
private WebElement forgotKey;
@FindBy(xpath="//input[@id='identify_email']")
private WebElement txtUser;
@FindBy(xpath="//button[text()='Search']")
private WebElement search;
public WebElement getForgotKey() {
	return forgotKey;
}
public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getSearch() {
	return search;
}
}

