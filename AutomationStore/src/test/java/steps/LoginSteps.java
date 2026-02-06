package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;
import utils.DriverFactory;

import org.openqa.selenium.WebDriver;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("user is logged into Automation Test Store")
    public void user_is_logged_into_store() throws InterruptedException {

        homePage.openApplication();
        homePage.clickLogin();
        homePage.scrollToNewsletter();
        homePage.enterUsername("username1029");
        homePage.enterPassword("ecommerce");
        homePage.submitLogin();
    }
}
