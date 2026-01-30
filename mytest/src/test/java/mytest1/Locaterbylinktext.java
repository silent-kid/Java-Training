package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaterbylinktext
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.quit();
	
		
	}
}

