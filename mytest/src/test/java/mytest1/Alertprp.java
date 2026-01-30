package mytest1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprp 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		WebElement l=driver.findElement(By.name("cusid"));
		l.sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Alert a= driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		
		a.accept();
		
	}
}
