package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

    WebDriver driver;

    @Given("user is on Google login page")
    public void user_is_on_google_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        driver.findElement(By.id("identifierId")).sendKeys(email);
    }

    @Then("email should be entered successfully")
    public void email_should_be_entered_successfully() {
        System.out.println("Email entered");
        driver.quit();
    }
}

