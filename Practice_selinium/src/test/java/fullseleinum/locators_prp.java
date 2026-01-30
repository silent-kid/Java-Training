package fullseleinum;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class locators_prp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		/*
		WebElement l=driver.findElement(By.id("user-name"));
		l.sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).submit();
		driver.findElement(By.className("app_logo"));
		System.out.println( driver.getTitle());
		
		WebElement drp = driver.findElement(By.cssSelector("select.product_sort_container"));
		Select sel=new Select(drp);
		Thread.sleep(1000);
		sel.selectByVisibleText("Name (A to Z)");
		Thread.sleep(1000);
		sel.selectByValue("za");
		*/
		
		
		driver.navigate().to("https://www.google.com/");
		Actions a= new Actions(driver);
		a.keyDown(Keys.SHIFT);
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		//a.keyDown(Keys.SHIFT);
		wb.sendKeys("india");
		a.keyDown(Keys.ENTER);
		
		
		
		
		
		
		
	}
}
