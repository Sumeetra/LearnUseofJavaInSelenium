package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ImagePage extends Basepage {

	public ImagePage() {
	}

	public void VerifyImage() {
		
		WebElement ImageFile = driver.findElement(By.xpath("//img[@src='http://www.techfios.com/ibilling/application/storage/system/logo.png']"));

		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);
		if (!ImagePresent) {
			System.out.println("Image not displayed.");
		} 
		else {
			System.out.println("Image displayed.");
		}
	}
}
