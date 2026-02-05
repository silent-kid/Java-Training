package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutSteps {

	WebDriver driver = DriverFactory.getDriver();
	Actions actions = new Actions(driver);

	@And("user completes checkout")
	public void user_completes_checkout() throws InterruptedException {
		WebElement table = driver.findElement(By.xpath("//th[contains(normalize-space(),'Estimate Shipping & Taxes')]"));
		actions.moveToElement(table).perform();
		driver.findElement(By.xpath("//input[contains(@id,'quantity')]")).sendKeys(Keys.BACK_SPACE,"3");
		driver.findElement(By.xpath("//button[contains(@title,'Update')]")).click();
		Thread.sleep(1000);
		WebElement apply = driver.findElement(By.xpath("//th[contains(normalize-space(),'Apply Coupon Code')]"));
		actions.moveToElement(apply).perform();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(normalize-space(),'Checkout')]")));
		checkout.click();
		WebElement items = driver.findElement(By.xpath("//h4[contains(normalize-space(),'Items in your cart')]"));
		actions.moveToElement(items).perform();
		driver.findElement(By.xpath("//b[contains(normalize-space(),'Return Policy')]")).click();
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Close')]")).click();
		Thread.sleep(1000);
		WebElement footer = driver.findElement(By.xpath("//span[contains(@class,'totalamout')]"));
		actions.moveToElement(footer).perform();
		driver.findElement(By.xpath("//button[contains(@id,'checkout_btn')]")).click();
		Thread.sleep(2000);
	}
}
