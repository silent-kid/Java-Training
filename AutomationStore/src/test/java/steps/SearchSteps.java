package steps;

import io.cucumber.java.en.When;
import pages.ProductPage;
import utils.DriverFactory;

import org.openqa.selenium.WebDriver;

public class SearchSteps {

    WebDriver driver = DriverFactory.getDriver();
    ProductPage productPage = new ProductPage(driver);

    @When("user searches and sort the products")
    public void user_search_and_sort() throws InterruptedException {

        productPage.hoverOnApparelMenu();
        productPage.openTShirtsCategory();
        productPage.scrollToFirstProductPrice();
        productPage.sortByLowToHigh();
        productPage.scrollAfterSorting();
    }
}
