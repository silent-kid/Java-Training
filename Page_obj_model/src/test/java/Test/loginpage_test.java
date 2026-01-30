package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class loginpage_test 
{
	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException 
	{
		LoginPage loginpage;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
		
		loginpage.navigate_to();
		loginpage.login("standard_user", "secret_sauce");
		
		
		loginpage.navigate_to();
		loginpage.login("incorrecr_user","incorrcer_pass");
		String err=loginpage.errrmsg();
		System.out.println(err);
		driver.quit();
		
		
		
	}
	
	
	
}
