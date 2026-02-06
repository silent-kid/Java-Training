package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import utils.DriverFactory;

public class CheckoutSteps {

    WebDriver driver = DriverFactory.getDriver();
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @And("user completes checkout")
    public void user_completes_checkout() throws InterruptedException {
        checkoutPage.completeCheckout();
    }
}
