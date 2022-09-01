package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends Basepage {
	
	//constructor
	public DashboardPage() {
		PageFactory.initElements(driver, this); //Method Override
	}
	//Element Library
//	@FindBy (how = How.XPATH, using = "//h2[text() = ' Dashboard ']") 
//	WebElement DashBoard;

	public void VerifyDashBoard() {
		String actual = driver.findElement(By.xpath("//h2")).getText();
		String expected = "Dashboard";
		
		Assert.assertEquals(actual,expected);
	}
}
