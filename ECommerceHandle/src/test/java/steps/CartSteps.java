package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;

import org.openqa.selenium.*;

public class CartSteps {

    WebDriver driver = DriverFactory.getDriver();

    @And("user reviews cart")
    public void user_reviews_cart() {
        driver.findElement(By.linkText("View Cart")).click();
        assert driver.getPageSource().contains("Shopping Cart");
    }
}
