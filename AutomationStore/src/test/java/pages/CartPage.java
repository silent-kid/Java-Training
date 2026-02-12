package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CartPage {

    WebDriver driver;
    Actions actions;

    // Logger 
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
        Thread.sleep(2000);
        driver.findElement(product).click();

        Thread.sleep(4000);  // Wait for product page to fully load

        logger.info("Scrolling to Description tab");
        WebElement desc = driver.findElement(descriptionTab);
        actions.moveToElement(desc).perform();

        Thread.sleep(3000);  // Pause after scroll

        logger.info("Clicking Add to Cart button");
        WebElement addBtn = driver.findElement(addToCartBtn);
        actions.moveToElement(addBtn).perform();

        Thread.sleep(2000);  // Pause before clicking
        addBtn.click();

        Thread.sleep(5000);  // Wait to observe cart update / popup
    }
}
