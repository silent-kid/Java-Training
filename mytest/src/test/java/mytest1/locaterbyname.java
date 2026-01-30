package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaterbyname 
{
	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(1000);
		WebElement fe=driver.findElement(By.name("user-name"));
		fe.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement fp=driver.findElement(By.name("password"));
		fp.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
