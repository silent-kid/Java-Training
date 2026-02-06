package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class CartSteps {

    WebDriver driver = DriverFactory.getDriver();
    Actions actions = new Actions(driver);

    @And("user add and reviews cart")
    public void user_add_and_reviews_cart() throws InterruptedException {
    	Thread.sleep(500);
        driver.findElement(By.xpath("//a[contains(@data-id,'120')]")).click();
        Thread.sleep(1000);
        WebElement desc = driver.findElement(By.xpath("//a[contains(normalize-space(),'Description')]"));
        actions.moveToElement(desc).perform();
        driver.findElement(By.xpath("//a[contains(@class,'cart')]")).click();
        Thread.sleep(2000);
    }
}
