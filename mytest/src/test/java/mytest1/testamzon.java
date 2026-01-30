package mytest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testamzon
{
	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://amazon.com");
		 driver.get("https://flipkart.com");
		 driver.get("https://facebook.com");
		 Thread.sleep(4000);
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
	}
}
