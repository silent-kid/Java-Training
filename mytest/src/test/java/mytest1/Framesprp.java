package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesprp
{
	public static void main(String[] args) throws InterruptedException 
	{
         WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/frames");
		 Thread.sleep(1000);
		WebElement t =driver.findElement(By.linkText("Nested Frames"));
		t.click();
		 driver.switchTo().frame("frame-bottom");
		 WebElement p =driver.findElement(By.cssSelector("body"));
		 System.out.println("the message in bottom frame is "+p.getText());
		 
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame("frame-top");
		 driver.switchTo().frame(1);
		 WebElement sec = driver.findElement(By.id("content"));
		 System.out.println(sec.getText());
		 driver.quit();
		 System.out.println(driver.findElements(By.tagName("frame")).size());
		 driver.switchTo().parentFrame();
		 
	}
}
