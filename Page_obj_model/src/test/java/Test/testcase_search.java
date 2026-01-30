package Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

public class testcase_search 
{
	static WebDriver driver;
	
	public static void search_test()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Search.test_box(driver).sendKeys("india");
		Search.test_box(driver).sendKeys(Keys.ENTER);
	}
	public static void main(String[] args) throws InterruptedException
	{
		search_test();
		Thread.sleep(1000);
		driver.quit();
	}
}
