package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class TOI_Selenium {

    WebDriver driver = Hooks.driver;

    @Given("User is on the homepage")
    public void user_is_on_homepage() {
        driver.get("https://timesofindia.indiatimes.com/defaultinterstitial.cms?b=/");
    }

//    @When("User clicks on the language selector")
//    public void user_clicks_language_selector() {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        WebElement laterBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id,'laterBtn') and normalize-space()='Maybe later']")));
//        
////        WebElement laterBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("grx_cp_laterBtn")));
////        
////        laterBtn.click();
//        WebElement language = wait.until(
//            ExpectedConditions.elementToBeClickable(
//                By.xpath("//span[normalize-space()='English']")
//            )
//        );
//
//        language.click();
////    	driver.findElement(By.xpath("//span[normalize-space()='English']")).click();
//    }
    
    @When("User clicks on the language selector")
    public void user_clicks_language_selector() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-skinner,'closeBtn')]")));
        
        driver.findElement(By.xpath("//div[contains(@data-skinner,'closeBtn')]")).click();
        // Click English language
        WebElement english = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'English')]")
            )
        );

        english.click();

    }


    @And("User Clicks On Hindi Language")
    public void user_clicks_hindi_language() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement hindi = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@data-newga,'switch_country#switch_country_hindi')]")
            )
        );

        hindi.click();
    }

    @Then("User should see the hindi language site")
    public void user_should_see_hindi_site() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement navbharat = wait.until(
            ExpectedConditions.presenceOfElementLocated(
                By.xpath("//img[contains(@alt,'Hindi')]")
            )
        );

        Assert.assertTrue(navbharat.isDisplayed(), "Hindi site not displayed");
    }
}
