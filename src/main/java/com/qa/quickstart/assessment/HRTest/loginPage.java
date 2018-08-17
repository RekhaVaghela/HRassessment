package com.qa.quickstart.assessment.HRTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	@FindBy(xpath = "//*[@id=\"txtUsername\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	private WebElement Login;
	
	public void adminLogin(String[] inputs) {
		WebElement[] elements= {username,password};
		
		for(int i=0; i<elements.length; i++) {
			elements[i].click();
			elements[i].sendKeys(inputs[i]);
		}
		Login.click();
	}
}
 