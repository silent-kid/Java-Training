package mytest1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicetwait
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/dynamic-properties");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement l=wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		l.getText();
		System.out.println(l);
		driver.quit();
	}
}
