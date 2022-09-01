package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SideNavigationPage extends Basepage {	
	
	public SideNavigationPage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Customers")
	WebElement customers;
	@FindBy(how = How.LINK_TEXT, using = "Add Customer")
	WebElement addcustomer;
	@FindBy(how = How.LINK_TEXT, using = "List Customers")
	WebElement listcustomers;
	@FindBy(how = How.LINK_TEXT, using = "Groups")
	WebElement groups;
	
	
	
	
	
	public void customer () {
	customers.click();
}
	public void addcustomer() {
		for (int i = 0; i <= 3; i++) {
		driver.findElement(By.linkText("Add Customer")).click();
	}
		}
	
}
