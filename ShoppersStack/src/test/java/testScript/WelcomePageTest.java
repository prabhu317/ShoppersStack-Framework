package testScript;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generalUtility.BaseClass;
import objectRepository.WelcomePage;

public class WelcomePageTest extends BaseClass {
	@Test
	public void Welcome_01() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getSearchField().sendKeys("Men");
	}
	@Test
	public void Welcome_02() {
		WelcomePage welcome=new WelcomePage(driver);
		Dimension SearchFieldSize=welcome.getSearchField().getSize();
		System.out.println("Height :"+SearchFieldSize.getHeight());
		System.out.println("Width :"+SearchFieldSize.getWidth());
	}
	@Test
	public void Welcome_03() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getCategoryDropDown().click();
		Select select=new Select(welcome.getCategoryDropDown());
		select.selectByIndex(2);
	}
	@Test
	public void Welcome_04() {
		WelcomePage welcome=new WelcomePage(driver);
		String Name=welcome.getNameText().getText();
		System.out.println(Name);
		if(Name.equals("Hello,prabhu"))
			System.out.println("PASS");
		else
			System.out.println("FAIL");	
	}
	@Test
	public void Welcome_05() { 
		WelcomePage welcome=new WelcomePage(driver);
		Boolean AppLogo=welcome.getAppLogo().isDisplayed();
		System.out.println(AppLogo);
	}
	@Test
	public void Welcome_06() { 
		WelcomePage welcome=new WelcomePage(driver);
		getWebElementScreenshot(welcome.getAppLogo());	
	}
	@Test
	public void Welcome_07() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getCartIcon().click();
	}
	@Test
	public void Welcome_08() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
	}
	@Test
	public void Welcome_09() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getChatLink().click();
	}
	@Test
	public void Welcome_10() {
		WelcomePage welcome=new WelcomePage(driver);
		getWebElementScreenshot(welcome.getKidsSection());
		welcome.getKidsSection().click();
	}
	@Test
	public void Welcome_11() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getNextPageLink().click();
	}
	@Test
	public void Welcome_12() throws InterruptedException { 
		WelcomePage welcome=new WelcomePage(driver);
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(welcome.getVoucherLink()));
		action.scrollToElement(welcome.getVoucherLink()).perform();
		welcome.getVoucherLink().click();
	}
	@Test
	public void Welcome_13() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getFAQLink().click();
	}
	
}
