package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_keys 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement m=  driver.findElement(By.id("APjFqb"));
		
		
		 
		Actions a= new Actions(driver);
		a.moveToElement(m);
		
		a.keyDown(Keys.SHIFT).sendKeys("sharuk").keyUp(Keys.SHIFT).build().perform();
		a.contextClick().perform();
		Thread.sleep(2000);

		WebElement b =driver.findElement(By.linkText("Images"));
		a.moveToElement(b).build().perform();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
