package generalUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods {
public static void getPageScreenshot(WebDriver driver) {
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File temp=sc.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./Screenshots/"+getTime()+".png");
		 
			try {
				FileHandler.copy(temp, permanent);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void getWebElementScreenshot(WebElement element) {
		File temp=element.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./Screenshots/"+getTime()+".png");
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getTime() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}

}



