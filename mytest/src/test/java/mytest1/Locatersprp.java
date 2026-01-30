package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class Locatersprp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(1000);
		WebElement fe=driver.findElement(By.id("user-name"));
		fe.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement fp=driver.findElement(By.id("password"));
		fp.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
	}
}
