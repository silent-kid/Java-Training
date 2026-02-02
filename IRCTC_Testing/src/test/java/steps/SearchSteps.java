package steps;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSteps{
    WebDriver driver;

    @Given("User is on the homepage of the IRCTC airline site")
    public void user_is_on_the_homepage() {
        driver = new ChromeDriver();
        driver.get("https://www.air.irctc.co.in/");
        driver.manage().window().maximize();
    }


    @When("User enters source and destination cities")
    public void user_enters_source_and_destination() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement fromInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("stationFrom"))
        );

        fromInput.click();

        for (char c : "Delhi".toCharArray()) {
            fromInput.sendKeys(String.valueOf(c));
            Thread.sleep(400);
        }

        By fromCity = By.xpath(
            "//div[contains(@class,'ui-menu-item-wrapper') and contains(text(),'Delhi')]"
        );

        WebElement fromOption = wait.until(
                ExpectedConditions.elementToBeClickable(fromCity)
        );

        fromOption.click();

        fromInput.sendKeys(Keys.TAB);

        WebElement toInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("stationTo"))
        );

        toInput.click();

        for (char c : "Chennai".toCharArray()) {
            toInput.sendKeys(String.valueOf(c));
            Thread.sleep(400);
        }

        By toCity = By.xpath(
            "//div[contains(@class,'ui-menu-item-wrapper') and contains(text(),'Chennai')]"
        );

        WebElement toOption = wait.until(
                ExpectedConditions.elementToBeClickable(toCity)
        );

        toOption.click();
    }

    
    @When("User selects flight dates")
    public void and_user_selects_flight_dates() throws InterruptedException {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    	By depDate = By.xpath("//span[@class='act']");
    	WebElement departure = wait.until(ExpectedConditions.elementToBeClickable(depDate));
    	departure.click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
    }






    @Then("User should see a list of available flights")
    public void user_should_see_available_flights() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    	WebElement searchBar = wait.until(
    	    ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//div[contains(@class,'right-searchbarbtm')]")
    	    )
    	);
    	
    	assertTrue(searchBar.isDisplayed(), "Flight list is not displayed");

    }
}

