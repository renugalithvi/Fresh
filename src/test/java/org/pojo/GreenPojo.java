package org.pojo;

import org.basee.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenPojo extends BaseClass {
	public GreenPojo() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
	private WebElement Scroll;
	
@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
private WebElement Scrollup;

public WebElement getScroll() {
	return Scroll;
}

public WebElement getScrollup() {
	return Scrollup;
}



}
