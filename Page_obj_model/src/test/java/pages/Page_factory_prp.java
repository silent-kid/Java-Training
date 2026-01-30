package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_factory_prp 
{
	private static WebDriver driver;
	private static String url="https://www.saucedemo.com";
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	@FindBy(css = "h3[data-test='error']")
	private WebElement errmsg;
	
	public Page_factory_prp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigate()
	{
		driver.get(url);
	}
	
	public void login(String user, String pass) 
	{
		username.sendKeys("user");
		password.sendKeys(pass);
		loginbutton.click();
	}
	
	public String errrmsg()
	{
		return errmsg.getText();
	}
	
	
	
}
