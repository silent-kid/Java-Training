package steps;

import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import utils.DriverFactory;

public class SearchSteps {

    WebDriver driver = DriverFactory.getDriver();
    Actions actions = new Actions(driver);

    @When("user searches and sort the products")
    public void user_search_and_sort() throws InterruptedException {
    	WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/section/nav/ul/li[2]/a"));
;
    	Thread.sleep(800);
    	actions.moveToElement(element).perform();
    	
    	driver.findElement(By.xpath("//a[contains(normalize-space(),'T-shirts')]")).click();
    	Thread.sleep(1000);
    	WebElement pV = driver.findElement(By.xpath("//div[@class='oneprice']"));
        actions.moveToElement(pV)
        .pause(Duration.ofMillis(2000))
        .perform();
        
        WebElement filterDropdown = driver.findElement(By.id("sort"));
        Select select = new Select(filterDropdown);
        select.selectByVisibleText("Price Low > High");
        
        Thread.sleep(2000);
        WebElement priceViewer = driver.findElement(By.xpath("//div[@class='oneprice']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        actions.moveToElement(priceViewer)
        .pause(Duration.ofMillis(2000))
        .perform();
        
        Thread.sleep(1000);
    }
}
