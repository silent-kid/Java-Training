package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSteps {
    WebDriver driver;

    @Given("User is on the homepage of the IRCTC airline site")
    public void user_is_on_the_homepage() {
        driver = new ChromeDriver();
        driver.get("https://www.air.irctc.co.in/");
    }

    @When("User enters source and destination cities")
    public void user_enters_source_and_destination() {
        driver.findElement(By.id("source")).sendKeys("New Delhi");
        driver.findElement(By.id("destination")).sendKeys("Mumbai");
    }

    @When("User selects flight dates")
    public void user_selects_flight_dates() {
        driver.findElement(By.id("departureDate")).sendKeys("2026-02-01");
    }

    @Then("User should see a list of available flights")
    public void user_should_see_available_flights() {
        // Assert that the flights are displayed
        assertTrue(driver.findElement(By.id("flightList")).isDisplayed());
    }
}

