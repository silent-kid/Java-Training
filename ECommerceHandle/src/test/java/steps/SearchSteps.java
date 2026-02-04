package steps;

import io.cucumber.java.en.When;

import org.openqa.selenium.*;
import utils.DriverFactory;

public class SearchSteps {

    WebDriver driver = DriverFactory.getDriver();

    @When("user searches and sort the products")
    public void user_search_and_sort() {
        driver.get("https://automationteststore.com");
        driver.findElement(By.linkText("Login or register")).click();
        driver.findElement(By.id("loginFrm_loginname")).sendKeys("testuser");
        driver.findElement(By.id("loginFrm_password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@title='Login']")).click();
    }
}
