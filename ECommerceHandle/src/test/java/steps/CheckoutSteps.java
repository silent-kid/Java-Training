package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;

import org.openqa.selenium.*;

public class CheckoutSteps {

    WebDriver driver = DriverFactory.getDriver();

    @And("user completes checkout")
    public void user_completes_checkout() {
        driver.findElement(By.id("checkout_btn")).click();
    }
}
