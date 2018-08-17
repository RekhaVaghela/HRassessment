package com.qa.quickstart.assessment.HRTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginButton {
	@FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement button;
	
	public void clickbutton() {
		button.click();
	}
	
	

}
