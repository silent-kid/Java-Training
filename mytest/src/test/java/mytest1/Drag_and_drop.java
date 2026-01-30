package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		 WebElement from=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		 Thread.sleep(2000);
		 WebElement to=driver.findElement(By.xpath("//*[@id='bank']/li"));
		 Thread.sleep(2000);
		Actions a= new Actions(driver);
		a.scrollToElement(from);
		WebElement from2=driver.findElement(By.xpath("//*[@data-id='2']/a"));

		 WebElement to2=driver.findElement(By.xpath("//*[@id='amt7']/li"));
		 
		a.dragAndDrop(from, to).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(from2, to2).build().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
