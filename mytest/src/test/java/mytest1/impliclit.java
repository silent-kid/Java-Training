package mytest1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class impliclit
{
 public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement l=driver.findElement(By.id("visibleAfter"));
		String s=l.getText();
		System.out.println(s);
		driver.quit();
}
}
