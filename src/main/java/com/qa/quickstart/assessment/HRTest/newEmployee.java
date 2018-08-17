package com.qa.quickstart.assessment.HRTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class newEmployee {
	@FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[1]/div/sf-decorator/div/sf-decorator[1]/div/label")
	private WebElement firstName;
		
	@FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[1]/div/sf-decorator/div/sf-decorator[2]/div/label")
	private WebElement middleName;
	
	@FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[1]/div/sf-decorator/div/sf-decorator[3]/div/label")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"firstName\"]")
	private WebElement firstName_field;
	
	@FindBy(xpath = "//*[@id=\"middleName\"]")
	private WebElement middleName_field;

	@FindBy(xpath = "//*[@id=\"lastName\"]")
	private WebElement lastName_field;
	
	@FindBy(xpath = "//*[@id=\"select-options-aa991aad-1ee6-2abe-db47-b36bd3794b72\"]/li[1]/span")
	private WebElement location_field;
	
	public void addEmployee(String[] employeeInputs){
		
		WebElement[] elements= {firstName_field, middleName_field, lastName_field, location_field}; 
		
		for(int i=0; i<elements.length; i++) {
			elements[i].click();
			elements[i].sendKeys(employeeInputs[i]);
		}
	}
}
