package steps;

import io.cucumber.java.en.And;
import pages.AccountPage;
import utils.DriverFactory;

import org.openqa.selenium.WebDriver;

public class ManageAddress {

    WebDriver driver = DriverFactory.getDriver();
    AccountPage accountPage = new AccountPage(driver);

    @And("user add an address")
    public void user_add_address() throws InterruptedException {

        accountPage.openManageAddress();
        accountPage.clickNewAddress();
        accountPage.enterName("John", "Wick");
        accountPage.enterAddress(
                "Synergy Park Pg, Hyderabad",
                "Hyderabad",
                "501510"
        );
        accountPage.selectCountry("India");
        accountPage.selectRegion("Andhra Pradesh");
        accountPage.submitAddress();
    }
}
