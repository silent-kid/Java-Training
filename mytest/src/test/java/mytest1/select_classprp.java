package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_classprp
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("shaik");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("sharuk");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9030495574");
		Thread.sleep(2000);

		driver.findElement(By.name("userName")).sendKeys("Sharuk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("xyz street");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("nellore");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("524001");
		Thread.sleep(2000);
		

		
		
		WebElement drp=driver.findElement(By.name("country"));
		System.out.println(drp.isDisplayed());
		System.out.println(drp.isSelected());
		Select sel= new Select(drp);
		sel.selectByVisibleText("AMERICAN SAMOA");
		Thread.sleep(2000);
		sel.selectByValue("ANDORRA");
		Thread.sleep(2000);
		sel.selectByIndex(9);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sharuk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Sharuk@07");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("Sharuk@07");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
