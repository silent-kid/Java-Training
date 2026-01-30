package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Page_factory_prp;

public class Page_factory_prp_test
{
	static WebDriver driver;
	public static void main(String[]args) 
	{
		Page_factory_prp loginpage;
		
		driver=new ChromeDriver();
		loginpage = new Page_factory_prp(driver);
		
		loginpage.navigate();
		loginpage.login("standard_user", "secret_sauce");
		
		loginpage.navigate();
		loginpage.login("standard_ttser", "secret_ffsauce");
		
		String err=loginpage.errrmsg();
		System.out.println(err);
		driver.quit();
		
		
	}
	
}
