package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.LogoutPage;
import utils.DriverFactory;

public class LogoutSteps {

    WebDriver driver = DriverFactory.getDriver();
    LogoutPage logoutPage = new LogoutPage(driver);

    @And("user view invoice and logout")
    public void user_logs_out() throws InterruptedException {
        logoutPage.viewInvoiceAndLogout();
    }
}
