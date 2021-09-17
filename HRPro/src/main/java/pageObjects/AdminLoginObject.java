package pageObjects;

import org.openqa.selenium.By;

public class AdminLoginObject {
	
	public static By login_email = By.id("Email");
	public static By login_password = By.id("Password");
	public static By login_button = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	public static By login_adminEmail = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[2]/div[2]/p/text()[2]\r\n" + 
			"");
	
	public static By login_adminPassword = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[2]/div[2]/p/text()[2]\r\n" + 
			"");
	
	public static By home_element = By.xpath("/html/body/div[3]/div[1]/div[1]/h1");
	
	

}
