package steps;

import io.cucumber.java.en.And;
import utils.DriverFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ManageAddress {
    WebDriver driver = DriverFactory.getDriver();
	Actions actions = new Actions(driver);
	
    @And("user add an address")
    public void user_add_address() throws InterruptedException {
    	WebElement card = driver.findElement(By.xpath("//div[contains(normalize-space(),'Order history')]"));
		actions.moveToElement(card).perform();
		
		driver.findElement(By.xpath("//a[contains(@data-original-title,'Manage Address Book')]")).click();
		Thread.sleep(1000);
		WebElement addbtn = driver.findElement(By.xpath("//a[contains(@title,'New Address')]"));
		actions.moveToElement(addbtn).perform();
		
		addbtn.click();
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("John");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Wick");
		driver.findElement(By.xpath("//input[contains(@name,'address_1')]")).sendKeys("Synergy Park Pg, Hyderabad");
		WebElement countryDropdown = driver.findElement(By.xpath("//select[contains(@name,'country_id')]"));
		Select countrySelect = new Select(countryDropdown);
		countrySelect.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Hyderabad");
		WebElement regionDropdown = driver.findElement(By.xpath("//select[contains(@name,'zone_id')]"));
		Select regionSelect = new Select(regionDropdown);
		Thread.sleep(500);
		regionSelect.selectByVisibleText("Andhra Pradesh");
		driver.findElement(By.xpath("//input[contains(@name,'postcode')]")).sendKeys("501510");
		WebElement continueBtn = driver.findElement(By.xpath("//button[contains(@title,'Continue')]"));
		actions.moveToElement(continueBtn).perform();
		continueBtn.click();

		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Wick");
    }

}


