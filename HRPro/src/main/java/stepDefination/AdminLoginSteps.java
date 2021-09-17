package stepDefination;

import org.testng.Assert;

import common.CommonMethods;
import io.cucumber.java.en.*;
import pageObjects.AdminLoginObject;

public class AdminLoginSteps extends CommonMethods {

	public static AdminLoginSteps obj = null;
	
	@When("user is on login page")
	public void user_is_on_login_page() {
		
		obj = new AdminLoginSteps();
		obj.openChromeBrowser("https://admin-demo.nopcommerce.com/login","C:/Users/Sumeet Jain/Desktop/downs/chromed/chromedriver.exe");
		obj.maximzeBrowser();
		obj.implicitWait(15);
		}
	
	@And("user enters correct email id")
	public void user_enters_correct_email_id() {
		obj.enterText(AdminLoginObject.login_adminEmail, "admin@yourstore.com");
	}
	
	@And("user enters correct password")
	public void user_enters_correct_password() {
		obj.enterText(AdminLoginObject.login_adminPassword, "admin");
	}
	
	@And("user clicks on Login Button")
	public void user_clicks_on_Login_button() {
		obj.clickAtAnyElement(AdminLoginObject.login_button);
		
	}
	
	@Then("verify that user is login successfully")
	public void user_is_login_successful() {
		Assert.assertEquals("Dashboard",obj.getText(AdminLoginObject.home_element));
	}
	
	
	
	
	
	
}
