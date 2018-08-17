package com.qa.quickstart.assessment.HRTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pimAddemployee {
	@FindBy (xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
	private WebElement addEM;
	
	public void clickaddEM () {
		addEM.click();
	}


}
