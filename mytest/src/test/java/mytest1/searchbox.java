package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbox
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement aa=driver.findElement(By.id("APjFqb"));
		aa.sendKeys("india");
		aa.sendKeys(Keys.ENTER);
		driver.quit();
		
		
	}
}
