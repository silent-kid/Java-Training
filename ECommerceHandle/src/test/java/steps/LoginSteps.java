package steps;

import io.cucumber.java.en.Given;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    Actions actions = new Actions(driver);

    @Given("user is logged into Automation Test Store")
    public void user_is_logged_into_store() throws InterruptedException {

        driver.get("https://automationteststore.com");
//        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
        actions.moveToElement(login)
        .pause(Duration.ofMillis(800))
        .perform();
        login.click();
//        Thread.sleep(2000);
        WebElement scroll = driver.findElement(By.xpath("//h2[normalize-space()='Newsletter Signup']"));
        actions.moveToElement(scroll)
        .pause(Duration.ofMillis(800))
        .perform();
        
        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'loginname')]"));
//        Thread.sleep(2000);
        for (char c : "username1029".toCharArray()) {
            username.sendKeys(String.valueOf(c));
//            Thread.sleep(100);
        }
        
        WebElement password = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
        for (char c : "ecommerce".toCharArray()) {
        	password.sendKeys(String.valueOf(c));
            Thread.sleep(100);
        }
//        driver.findElement(By.id("loginFrm_password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@title='Login']")).click();
//        Thread.sleep(1500);
    }
}
