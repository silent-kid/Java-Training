package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductPage {

    WebDriver driver;
    Actions actions;

    //Logger
    private static final Logger logger = LogManager.getLogger(ProductPage.class);

  
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        logger.info("ProductPage initialized");
    }

    
    By apparelMenu = By.xpath("/html/body/div/div[1]/div[1]/section/nav/ul/li[2]/a");
    By tshirtCategory = By.xpath("//a[contains(normalize-space(),'T-shirts')]");
    By firstPrice = By.xpath("(//div[contains(@class,'oneprice')])[1]");
    By sortDropdown = By.id("sort");

    

    public void hoverOnApparelMenu() throws InterruptedException {
        logger.info("Hovering on Apparel & Accessories menu");
        WebElement menu = driver.findElement(apparelMenu);
        actions.moveToElement(menu)
               .pause(Duration.ofMillis(800))
               .perform();
        Thread.sleep(1000);
    }

    public void openTShirtsCategory() throws InterruptedException {
        logger.info("Opening T-Shirts category");
        driver.findElement(tshirtCategory).click();
        Thread.sleep(1000);
    }

    public void scrollToFirstProductPrice() throws InterruptedException {
        logger.info("Scrolling to first product price");
        WebElement price = driver.findElement(firstPrice);
        actions.moveToElement(price)
               .pause(Duration.ofMillis(1500))
               .perform();
        Thread.sleep(1000);
    }

    public void sortByLowToHigh() throws InterruptedException {
        logger.info("Sorting products by Price: Low to High");
        Select select = new Select(driver.findElement(sortDropdown));
        select.selectByVisibleText("Price Low > High");
        Thread.sleep(1000);
    }

    public void scrollAfterSorting() throws InterruptedException {
        logger.info("Scrolling after sorting products");
        WebElement priceAfterSort = driver.findElement(firstPrice);
        actions.moveToElement(priceAfterSort)
               .pause(Duration.ofMillis(1500))
               .perform();
        Thread.sleep(1000);
    }
}