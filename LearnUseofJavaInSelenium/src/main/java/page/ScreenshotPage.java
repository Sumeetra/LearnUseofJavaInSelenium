package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ScreenshotPage extends Basepage {
	
	public ScreenshotPage () {
	PageFactory.initElements(driver, this);
	}
	
	public static void Screenshot(String FileWithPath) throws IOException {
		
		
		TakesScreenshot TSS = ((TakesScreenshot)driver);
		File file = TSS.getScreenshotAs(OutputType.FILE);
		File Desfile = new File(FileWithPath);
		FileUtils.copyFile(file, Desfile);
		}	
		}
