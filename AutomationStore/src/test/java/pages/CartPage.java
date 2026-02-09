package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CartPage {

    WebDriver driver;
    Actions actions;

    private static final Logger logger = LogManager.getLogger(CartPage.class);

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        logger.info("CartPage initialized");
    }

    By product = By.xpath("//a[contains(@data-id,'120')]");
    By descriptionTab = By.xpath("//a[contains(normalize-space(),'Description')]");
    By addToCartBtn = By.xpath("//a[contains(@class,'cart')]");

    public void addProductToCart() throws InterruptedException {
        logger.info("Selecting product to add to cart");
        driver.findElement(product).click();

        Thread.sleep(1000);

        logger.info("Scrolling to Description tab");
        actions.moveToElement(driver.findElement(descriptionTab)).perform();

        logger.info("Clicking Add to Cart button");
        driver.findElement(addToCartBtn).click();

        Thread.sleep(2000);
    }
}
