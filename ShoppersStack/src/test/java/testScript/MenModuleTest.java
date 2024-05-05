package testScript;

import java.util.Set;

import org.testng.annotations.Test;

import generalUtility.BaseClass;
import objectRepository.MenModule;
import objectRepository.WelcomePage;

public class MenModuleTest extends BaseClass {
	@Test 
	public void Men_01() {
		WelcomePage welcome=new WelcomePage(driver);
		//Actions action=new Actions(driver);
		//action.moveToElement(welcome.getMenLink()).perform();
		welcome.getMenLink().click();
		MenModule men=new MenModule(driver);
		//men.getTShirts().click();
		men.getLevisMen().click();
		men.getAddCart().click();
	}
	@Test
	public void Men_02() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getMenLink().click();
		MenModule men=new MenModule(driver);
		men.getLevisMen().click();
		men.getBuyNow().click();
	}
	@Test
	public void Men_03() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getMenLink().click();
		MenModule men=new MenModule(driver);
		men.getLevisMen().click();
		men.getCompareButton().click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		for (String window : allwindows) {
			driver.switchTo().window(window);
			String url=driver.getCurrentUrl();
			if(url.contains("amazon")) {
				break;
			}
		}
		Thread.sleep(15000);
		driver.manage().window().maximize();
	}
	@Test
	public void Men_04() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getMenLink().click();
		MenModule men=new MenModule(driver);
		men.getLevisMen().click();
		men.getCheckDelivery().sendKeys("600053");
		Thread.sleep(5000);
		men.getCheckButton().click();
		men.getDeliverablePins().click();
	}
	@Test
	public void Men_05() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getMenLink().click();
		MenModule men=new MenModule(driver);
		men.getLevisMen().click();
		men.getCheckDelivery().sendKeys("600053");
		Thread.sleep(5000);
		men.getCheckButton().click();
		men.getDeliverablePins().click();
		men.getAvatarImages().click();
		getWebElementScreenshot(men.getImage1());
	}
}
