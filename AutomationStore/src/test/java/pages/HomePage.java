package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {

    WebDriver driver;
    Actions actions;

    // Logger
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        logger.info("HomePage initialized");
    }

    By loginLink = By.xpath("//a[normalize-space()='Login']");
    By newsletterSection = By.xpath("//h2[normalize-space()='Newsletter Signup']");
    By usernameField = By.xpath("//input[contains(@name,'loginname')]");
    By passwordField = By.xpath("//input[contains(@name,'password')]");
    By loginButton = By.xpath("//button[@title='Login']");

    public void openApplication() throws InterruptedException {
        logger.info("Opening Automation Test Store application");
        driver.get("https://automationteststore.com");
        Thread.sleep(4000);   // Wait longer for page load
    }

    public void clickLogin() throws InterruptedException {
        logger.info("Clicking Login link");
        WebElement login = driver.findElement(loginLink);
        actions.moveToElement(login)
               .pause(Duration.ofMillis(1500))
               .perform();
        Thread.sleep(2000);
        login.click();
        Thread.sleep(4000);
    }

    public void scrollToNewsletter() throws InterruptedException {
        logger.info("Scrolling to Newsletter Signup section");
        WebElement scroll = driver.findElement(newsletterSection);
        actions.moveToElement(scroll)
               .pause(Duration.ofMillis(1500))
               .perform();
        Thread.sleep(3000);
    }

    public void enterUsername(String username) throws InterruptedException {
        logger.info("Entering username");
        WebElement user = driver.findElement(usernameField);
        Thread.sleep(2000);

        for (char c : username.toCharArray()) {
            user.sendKeys(String.valueOf(c));
            Thread.sleep(200);   // Slower typing
        }

        Thread.sleep(2000);
    }

    public void enterPassword(String password) throws InterruptedException {
        logger.info("Entering password");
        WebElement pass = driver.findElement(passwordField);
        Thread.sleep(2000);

        for (char c : password.toCharArray()) {
            pass.sendKeys(String.valueOf(c));
            Thread.sleep(250);   // Even slightly slower for demo
        }

        Thread.sleep(2000);
    }

    public void submitLogin() throws InterruptedException {
        logger.info("Submitting login form");
        Thread.sleep(2000);
        driver.findElement(loginButton).click();
        Thread.sleep(5000);   // Observe login transition
    }
}
