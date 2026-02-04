package steps;

import io.cucumber.java.en.When;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import utils.DriverFactory;

public class SearchSteps {

    WebDriver driver = DriverFactory.getDriver();
    Actions actions = new Actions(driver);

    @When("user searches and sort the products")
    public void user_search_and_sort() {
    	WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Apparel')]"));

    	actions.moveToElement(element).perform();
//        driver.findElement(By.linkText("Login or register")).click();
//        driver.findElement(By.id("loginFrm_loginname")).sendKeys("testuser");
//        driver.findElement(By.id("loginFrm_password")).sendKeys("password");
//        driver.findElement(By.xpath("//button[@title='Login']")).click();
    }
}
