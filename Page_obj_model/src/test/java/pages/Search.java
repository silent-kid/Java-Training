package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search
{
	 static WebElement element = null;
	 
	 public static WebElement test_box(WebDriver driver)
	 {
		 element = driver.findElement(By.className("gLFyf"));
		 return element;
	 }
}
