package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    WebDriver driver;

    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {

        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(2000);  

        driver.findElement(By.xpath("//a[normalize-space()='Guest User Login']")).click();
        Thread.sleep(2000);  

        driver.findElement(By.xpath("//input[@placeholder='Enter Email']"))
              .sendKeys("test@test.com");
        Thread.sleep(2000);  

        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"))
              .sendKeys("1212121212");
        Thread.sleep(2000);  
    }


    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Sign In']")).click();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement userIcon = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//i[contains(@class,'fa-user-circle')]")
            )
        );

        assertTrue(userIcon.isDisplayed(), "User icon is not visible, login failed");
        driver.quit();
    }
}
