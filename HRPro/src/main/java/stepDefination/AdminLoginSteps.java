package stepDefination;

import org.testng.Assert;

import common.CommonMethods;
import io.cucumber.java.en.*;
import pageObjects.AdminLoginObject;

public class AdminLoginSteps extends CommonMethods {

	public static AdminLoginSteps obj = null;
	public static String[] whole = null;
	
	@When("user is on login page")
	public void user_is_on_login_page() {
		
		obj = new AdminLoginSteps();
		obj.openChromeBrowser("https://admin-demo.nopcommerce.com/login","C:/Users/Sumeet Jain/Desktop/downs/chromed/chromedriver.exe");
		obj.maximzeBrowser();
		obj.implicitWait(15);
		obj.clearTextField(AdminLoginObject.login_email);
		obj.clearTextField(AdminLoginObject.login_password);
		}
	
	@And("user enters correct email id")
	public void user_enters_correct_email_id() {
		obj.enterText(AdminLoginObject.login_email, "admin@yourstore.com");
	}
	
	@And("user enters correct password")
	public void user_enters_correct_password() {
		obj.enterText(AdminLoginObject.login_password, "admin");
	}
	
	@And("user clicks on Login Button")
	public void user_clicks_on_Login_button() {
		obj.clickAtAnyElement(AdminLoginObject.login_button);
		
	}
	
	@Then("verify that user is login successfully")
	public void user_is_login_successful() {
		Assert.assertEquals("Dashboard",obj.getText(AdminLoginObject.home_element));
		obj.closeAllBrowser();
	}
	
	
	@And("user enters Incorrect email id")
	public void user_enters_Incorrect_email_id() {
		obj.enterText(AdminLoginObject.login_email, "kjsajshjds");
		}
	
	@And("user enters Incorrect password")
	public void user_enters_Incorrect_password() {
		obj.enterText(AdminLoginObject.login_password, "sdjksd");
	}
	
	@Then("verify that user is not able to login")
	public void verify_that_user_is_not_able_to_login() {
		Assert.assertEquals("Welcome, please sign in!", obj.getText(AdminLoginObject.login_Welcome_Text));
		obj.closeAllBrowser();
	}
	
	@Then("verify that user is able to see the Admin email")
	public void verify_that_user_is_able_to_see_the_Admin_email() {
		whole = obj.getText(AdminLoginObject.login_adminEmailPassword).split("\\R");
		Assert.assertEquals("Admin email: admin@yourstore.com", whole[0]);
		obj.closeAllBrowser();
		}
	
	@Then("verify that user is able to see the Admin password")
	public void verify_that_user_is_able_to_see_the_Admin_password() {
		Assert.assertEquals("Admin password: admin",whole[1]);
		
	}
}
