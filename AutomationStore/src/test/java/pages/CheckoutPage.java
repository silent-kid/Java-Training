package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// ✅ log4j2 imports
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckoutPage {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;


    private static final Logger logger = LogManager.getLogger(CheckoutPage.class);


    By estimateShipping = By.xpath("//th[contains(normalize-space(),'Estimate Shipping & Taxes')]");
    By quantityInput = By.xpath("//input[contains(@id,'quantity')]");
    By updateBtn = By.xpath("//button[contains(@title,'Update')]");
    By applyCoupon = By.xpath("//th[contains(normalize-space(),'Apply Coupon Code')]");
    By checkoutLink = By.xpath("//a[contains(normalize-space(),'Checkout')]");
    By itemsInCart = By.xpath("//h4[contains(normalize-space(),'Items in your cart')]");
    By returnPolicy = By.xpath("//b[contains(normalize-space(),'Return Policy')]");
    By closeBtn = By.xpath("//button[contains(normalize-space(),'Close')]");
    By footerTotal = By.xpath("//span[contains(@class,'totalamout')]");
    By checkoutBtn = By.xpath("//button[contains(@id,'checkout_btn')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        logger.info("CheckoutPage initialized");
    }

    public void completeCheckout() throws InterruptedException {

        logger.info("Scrolling to Estimate Shipping & Taxes section");
        WebElement table = driver.findElement(estimateShipping);
        actions.moveToElement(table).perform();

        logger.info("Updating product quantity");
        WebElement qty = driver.findElement(quantityInput);
        qty.sendKeys(Keys.BACK_SPACE, "3");

        logger.info("Clicking Update button");
        driver.findElement(updateBtn).click();
        Thread.sleep(1000);

        logger.info("Scrolling to Apply Coupon Code section");
        WebElement apply = driver.findElement(applyCoupon);
        actions.moveToElement(apply).perform();
        Thread.sleep(1000);

        logger.info("Clicking Checkout link");
        WebElement checkout = wait.until(
                ExpectedConditions.elementToBeClickable(checkoutLink));
        checkout.click();

        logger.info("Viewing items in cart");
        WebElement items = driver.findElement(itemsInCart);
        actions.moveToElement(items).perform();

        logger.info("Opening Return Policy popup");
        driver.findElement(returnPolicy).click();
        Thread.sleep(500);

        logger.info("Closing Return Policy popup");
        driver.findElement(closeBtn).click();

        Thread.sleep(1000);

        logger.info("Scrolling to cart footer total");
        WebElement footer = driver.findElement(footerTotal);
        actions.moveToElement(footer).perform();

        logger.info("Clicking final Checkout button");
        driver.findElement(checkoutBtn).click();
        Thread.sleep(2000);
    }
}
