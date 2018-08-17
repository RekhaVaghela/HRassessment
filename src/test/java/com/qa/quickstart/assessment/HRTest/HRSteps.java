package com.qa.quickstart.assessment.HRTest;

import static junit.framework.TestCase.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRSteps {
	
	WebDriver driver;
	private static ExtentReports report = new ExtentReports(constants.path_hrReport, true);
	public ExtentTest test;
		
	@Before
	public void setup() {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		
	@After
	public void teardown() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}	
	
	@Given("^the login page$")
	public void the_login_page() {
		driver.get(constants.path_hrWebsite);
		test= report.startTest("HR Website");
		test.log(LogStatus.INFO, "Browser started");
        
        if(driver.getCurrentUrl().equals(constants.path_hrWebsite)) {
			test.log(LogStatus.PASS, "correct webpage accessed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
        assertEquals(driver.getCurrentUrl(), constants.path_hrWebsite);
	}

	@When("^I login$")
	public void i_login() {
		driver.get(constants.path_hrWebsite);
		String[] inputs= {"Admin","AdminAdmin"};
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.adminLogin(inputs);	
		
		test.log(LogStatus.INFO, "Admin logged in");
		test.log(LogStatus.PASS, "Successful login");	
		assertEquals(driver.getCurrentUrl(), constants.path_hrDashboard);		
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab() {
		driver.get(constants.path_hrDashboard);	
		
		pimTab click = PageFactory.initElements(driver, pimTab.class);
		click.clickpim();
		
		test.log(LogStatus.INFO, "clicked on pim");
		test.log(LogStatus.PASS, "Successfully clicked on pim");	
		assertEquals("Configuration", driver.findElement(By.xpath("//*[@id=\"menu_pim_Configuration\"]/a/span[2]")).getText());	
	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab() {
		driver.get(constants.path_hrDashboard);
		
		pimAddemployee clickon = PageFactory.initElements(driver, pimAddemployee.class);
		clickon.clickaddEM();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			
		}
		
		test.log(LogStatus.INFO, "clicked on Add Employee");
		test.log(LogStatus.PASS, "Successfully clicked on Add Employee");	
		assertEquals(driver.getCurrentUrl(), constants.path_hremployee);
	}

	@When("^I fill out the Add Employee Details correctly$")
	public void i_fill_out_the_Add_Employee_Details_correctly() {
		driver.get(constants.path_hremployee);	
		
		String[] employeeInputs= {"John","Lucifer", "Black", "London Office"};
		newEmployee addDetails = PageFactory.initElements(driver, newEmployee.class);
		addDetails.addEmployee(employeeInputs);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}		
	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {
		driver.get(constants.path_hremployee);	
		loginButton button = PageFactory.initElements(driver, loginButton.class);
		button.clickbutton();
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly() {
		String[] employeeInputs= {""};
		loginDetails loginDet = PageFactory.initElements(driver, loginDetails.class);
		loginDet.addEmployee(loginInputs);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}		
		
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() {
		
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created() {
		
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection() {
		
	}

}
