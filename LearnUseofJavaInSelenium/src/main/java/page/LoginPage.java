package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Basepage {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Element Library
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;
	
	public void login (String userName, String passWord ) {
		UserName.sendKeys("demo@techfios.com");
		Password.sendKeys("abc123");
		SignInButton.click();
	}	
	
	public String getPageTitle() {
		return driver.getTitle();//Method Override
	}

}
