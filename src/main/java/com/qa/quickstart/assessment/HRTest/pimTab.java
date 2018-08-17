package com.qa.quickstart.assessment.HRTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pimTab {
	@FindBy (xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[3]")
	private WebElement pim;
	
	public void clickpim () {
		pim.click();
	}
}
