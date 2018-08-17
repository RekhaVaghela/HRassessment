package com.qa.quickstart.assessment.HRTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginDetails {
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement username;
		
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"confirmPassword\"]")
	private WebElement confirmpassword;
	
	public void addEmployee(String[] loginInputs){
		
		WebElement[] elements= {username, password, confirmpassword}; 
		
		for(int i=0; i<elements.length; i++) {
			elements[i].click();
			elements[i].sendKeys(loginInputs[i]);
		}
	}
}


}
