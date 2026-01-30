package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
        driver = new ChromeDriver(); // Initialize WebDriver
        driver.get(url);
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        driver.findElement(By.id("username")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("validPassword");
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        // Assert login success (example: check for user profile icon)
        assertTrue(driver.findElement(By.id("profile")).isDisplayed());
    }
}
