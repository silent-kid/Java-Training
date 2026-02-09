package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

// ✅ log4j2 imports
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AccountPage {

    WebDriver driver;
    Actions actions;


    private static final Logger logger = LogManager.getLogger(AccountPage.class);


    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        logger.info("AccountPage initialized");
    }


    By orderHistoryCard = By.xpath("//div[contains(normalize-space(),'Order history')]");
    By manageAddressLink = By.xpath("//a[contains(@data-original-title,'Manage Address Book')]");
    By newAddressBtn = By.xpath("//a[contains(@title,'New Address')]");

    By firstName = By.xpath("//input[contains(@name,'firstname')]");
    By lastName = By.xpath("//input[contains(@name,'lastname')]");
    By address1 = By.xpath("//input[contains(@name,'address_1')]");
    By city = By.xpath("//input[contains(@name,'city')]");
    By postcode = By.xpath("//input[contains(@name,'postcode')]");

    By countryDropdown = By.xpath("//select[contains(@name,'country_id')]");
    By regionDropdown = By.xpath("//select[contains(@name,'zone_id')]");

    By continueBtn = By.xpath("//button[contains(@title,'Continue')]");



    public void openManageAddress() {
        logger.info("Opening Manage Address Book");
        WebElement card = driver.findElement(orderHistoryCard);
        actions.moveToElement(card).perform();
        driver.findElement(manageAddressLink).click();
    }

    public void clickNewAddress() {
        logger.info("Clicking New Address button");
        WebElement addBtn = driver.findElement(newAddressBtn);
        actions.moveToElement(addBtn).perform();
        addBtn.click();
    }

    public void enterName(String fName, String lName) {
        logger.info("Entering first name and last name");
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
    }

    public void enterAddress(String addr, String cityName, String zip) {
        logger.info("Entering address, city, and postcode");
        driver.findElement(address1).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(postcode).sendKeys(zip);
    }

    public void selectCountry(String country) {
        logger.info("Selecting country: {}", country);
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(country);
    }

    public void selectRegion(String region) throws InterruptedException {
        logger.info("Selecting region/state: {}", region);
        Thread.sleep(500);
        Select select = new Select(driver.findElement(regionDropdown));
        select.selectByVisibleText(region);
    }

    public void submitAddress() {
        logger.info("Submitting address form");
        WebElement btn = driver.findElement(continueBtn);
        actions.moveToElement(btn).perform();
        btn.click();
    }
}

