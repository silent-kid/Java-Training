package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class LogoutSteps {

    WebDriver driver = DriverFactory.getDriver();
    Actions actions = new Actions(driver);

	@And("user view invoice and logout")
    public void user_logs_out() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(normalize-space(),'invoice page')]")).click();
		WebElement continueBtn = driver.findElement(By.xpath("//a[contains(@title,'Continue')]"));
		actions.moveToElement(continueBtn).perform();
		continueBtn.click();
//		driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
		WebElement accountMenu = driver.findElement(
			    By.xpath("//span[normalize-space()='Account']")
			);

			Actions actions = new Actions(driver);
			actions.moveToElement(accountMenu)
			       .pause(Duration.ofMillis(1000))
			       .perform();
			
		WebElement logoutOption = driver.findElement(
				By.xpath("//span[normalize-space()='Logout']")
			);

		logoutOption.click();
		Thread.sleep(3000);
    }
}
