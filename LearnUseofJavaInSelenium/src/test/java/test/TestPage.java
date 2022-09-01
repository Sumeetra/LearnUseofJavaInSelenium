package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Basepage;
import page.DashboardPage;
import page.ImagePage;
import page.LoginPage;
import page.ScreenshotPage;
import page.SideNavigationPage;
import page.UseofHashMap;
import page.WindowHandlePage;
import util.BrowserFactory;

public class TestPage extends Basepage {

	LoginPage login;

	@BeforeMethod
	public void Setup() {
	//	BrowserFactory.startBrowser();	
	//	login = new LoginPage();
	}

	@Test(priority = 1, enabled = false)
	public void Login() {		
		login.login("userName", "passWord");		
	}

	@Test(priority = 2, enabled = false)
	public void Dashboard() {
		login.login("userName", "passWord");
		DashboardPage dashboard = new DashboardPage();
		dashboard.VerifyDashBoard();
	}
	
	@Test(priority = 3, enabled = false)
	public void Image() throws InterruptedException, IOException {
		login.login("userName", "passWord");
		Thread.sleep(3000);
		ImagePage Images = new ImagePage();
		Images.VerifyImage();
	//	ScreenshotPage SC = new ScreenshotPage();
		ScreenshotPage.Screenshot("C:/Users/Hamro/Selenium/screen.jpg");
	}

	
	@Test(priority = 4, enabled = false)	
	public void Windows() {	
		BrowserFactory.startBrowser();
		login.login("userName", "passWord");
		for (int i = 0; i<=4; i++) {
			WindowHandlePage.windowHandle();						
			}			
		}
	
	@Test (priority = 5, enabled = false)
	public void sidenav() {
		login.login("userName", "passWord");
		SideNavigationPage SN = new SideNavigationPage();
		SN.customer();
		SN.addcustomer();
	}
	
	@Test (priority = 6)
	public void hashmaplogin() {
		BrowserFactory.startBrowser();
		UseofHashMap use = new UseofHashMap();
	String[] user	= use.hashmap().get("LoginInfo").split("_");
	
		driver.findElement(By.id("username")).sendKeys(user[0]);
		driver.findElement(By.id("password")).sendKeys(user[1]);
		driver.findElement(By.name("login")).click();
			}
	
//	@AfterMethod
	//public void CloseBrowser() {
		//driver.close(); //Method Override
		//driver.quit(); //Method override
	//}

}
