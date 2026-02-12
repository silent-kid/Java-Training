package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogoutPage {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    // Logger
    private static final Logger logger = LogManager.getLogger(LogoutPage.class);

    By invoiceLink = By.xpath("//a[contains(normalize-space(),'invoice page')]");
    By continueBtn = By.xpath("//a[contains(@title,'Continue')]");
    By accountMenu = By.xpath("//span[normalize-space()='Account']");
    By logoutOption = By.xpath("//span[normalize-space()='Logout']");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        logger.info("LogoutPage initialized");
    }

    public void viewInvoiceAndLogout() throws InterruptedException {

        logger.info("Opening invoice page");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(invoiceLink)).click();
        Thread.sleep(4000);

        logger.info("Clicking Continue button");
        WebElement continueButton =
                wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        actions.moveToElement(continueButton).perform();
        Thread.sleep(2000);
        continueButton.click();
        Thread.sleep(4000);

        logger.info("Hovering on Account menu");
        WebElement account =
                wait.until(ExpectedConditions.visibilityOfElementLocated(accountMenu));
        actions.moveToElement(account).perform();
        Thread.sleep(3000);

        logger.info("Clicking Logout option");
        WebElement logout =
                wait.until(ExpectedConditions.elementToBeClickable(logoutOption));
        Thread.sleep(2000);
        logout.click();
        Thread.sleep(5000);

        logger.info("User successfully logged out");
    }
}
