package pageObjects;

import org.openqa.selenium.By;

public class AdminLoginObject {
	
	public static By login_email = By.id("Email");
	public static By login_password = By.id("Password");
	public static By login_button = By.xpath("//button[@type='submit']");
	public static By login_adminEmailPassword = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[2]/div[2]/p");
	//public static By login_adminPassword = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[2]/div[2]/p/text()[3]");
	public static By home_element = By.xpath("/html/body/div[3]/div[1]/div[1]/h1");
	public static By login_Welcome_Text = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]/strong");
	

}
