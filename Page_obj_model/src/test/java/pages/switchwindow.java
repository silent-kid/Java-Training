package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("Https://google.com");
		driver.manage().window().maximize();
		 String d= driver.getWindowHandle();
		 driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://gmail.com");
		System.out.println(driver.getWindowHandles().size());
		
		driver.switchTo().window(d);
		Thread.sleep(3000);
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
