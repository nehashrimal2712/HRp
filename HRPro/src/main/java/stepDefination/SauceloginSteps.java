package stepDefination;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.*;
import common.CommonMethods;
import io.cucumber.java.en.*;

public class SauceloginSteps extends CommonMethods {
	
	static SauceloginSteps obj = null;
	
	@When("user is on swaglabs login page")
	public void user_is_on_swaglabs_login_page() {
		obj = new SauceloginSteps();
	    obj.openChromeBrowser("https://www.saucedemo.com/" , "C:/Users/Sumeet Jain/Desktop/Mom Docs PDF Converter/chromed/chromedriver.exe");
	    obj.implicitWait(30);
	}

	@And("user enters email")
	public void user_enters_email() {
	    obj.enterText(By.id("user-name"), "standard_user");
	    
	}

	@And("user enters password")
	public void user_enters_password_as() {
	    obj.enterText(By.id("password"), "secret_sauce");
	    
	}

	@And("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.clickAtAnyElement(By.id("login-button"));
	    
	}

	@Then("verify that user is successfully logged in")
	public void verify_that_user_is_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		//obj.verifyText(By.className("title"), "xy");
	    Assert.assertEquals("PRODUCTS", obj.getText(By.className("title")));
	}


}
