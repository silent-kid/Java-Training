package steps;

import io.cucumber.java.en.Then;
import utils.DriverFactory;

import org.openqa.selenium.*;

public class ConfirmationSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Then("order confirmation should be displayed")
    public void order_confirmation_should_be_displayed() {
        assert driver.getPageSource().contains("Your Order Has Been Processed");
    }
}
