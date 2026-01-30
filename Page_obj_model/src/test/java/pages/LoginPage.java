package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	 private WebDriver driver;
	  
	 private String url ="https://www.saucedemo.com";
	 
	 private By username = By.id("user-name");
	 private By password = By.id("password");
	 private By loginbtn = By.id("login-button");
	 private By errmsg   = By.cssSelector("h3[data-test='error']");
	 
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public void navigate_to() throws InterruptedException 
	 
	 {	
		 //System.out.println(driver.getCurrentUrl());
		 //if(driver.getCurrentUrl().equals(url))
		    Thread.sleep(2000);
			 driver.get(url);
		 
	 }
	 public void login(String user,String pass) throws InterruptedException 
	 {
		 Thread.sleep(4000);
		 driver.findElement(username).sendKeys(user);
		 Thread.sleep(3000);
		 driver.findElement(password).sendKeys(pass);
		 Thread.sleep(2000);
		 driver.findElement(loginbtn).click();
	 }
	 public String errrmsg()
	 {
		return driver.findElement(errmsg).getText();
	 }
	
}
