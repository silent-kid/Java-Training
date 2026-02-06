package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import utils.DriverFactory;

public class CartSteps {

    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);

    @And("user add and reviews cart")
    public void user_add_and_reviews_cart() throws InterruptedException {
        cartPage.addProductToCart();
    }
}
