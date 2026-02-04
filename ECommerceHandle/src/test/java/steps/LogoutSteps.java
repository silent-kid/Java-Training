package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;

import org.openqa.selenium.*;

public class LogoutSteps {

    WebDriver driver = DriverFactory.getDriver();

    @And("user logs out")
    public void user_logs_out() {
        driver.findElement(By.linkText("Logoff")).click();
        assert driver.getTitle().contains("Account Logout");
    }
}
