package mytest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absaluteXpath_prp 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/header/div[1]/div[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
