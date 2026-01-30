package mytest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest1 
{
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://firefox.com");
		 Thread.sleep(4000);
		 System.out.println(driver.getTitle());
		 driver.quit();
	}
}
