package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class css_selecter_prp 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.submit-button")).click();
		driver.quit();
			
		
	}
}