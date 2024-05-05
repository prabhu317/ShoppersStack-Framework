package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generalUtility.BaseClass;
import objectRepository.AccountSettings;
import objectRepository.AddAddressPage;
import objectRepository.ProfileSettings;
import objectRepository.WelcomePage;

public class AccountProfileTest extends BaseClass {
	@Test
	public void Profile_01() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
	}
	@Test
	public void Profile_02() throws InterruptedException, AWTException { 
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		profile.getEditProfileButton().click();
		//Thread.sleep(3000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_BACK_SPACE);
		robo.keyRelease(KeyEvent.VK_BACK_SPACE);
		profile.getEditFirstName().sendKeys("darshan");
		profile.getEditProfileSubmit().click();
		
	}
	@Test
	public void Profile_03() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		profile.getMyAddressesButton().click();
		profile.getAddAddressesLink().click();
		AddAddressPage address=new AddAddressPage(driver);
		address.getHome().click();
		address.getName().sendKeys("prabhu");
		address.getHomeInfo().sendKeys("18");
		address.getStreetInfo().sendKeys("Abc Street");
		address.getLandmark().sendKeys("Temple");
		Select select=new Select(address.getCountry());
		select.selectByVisibleText("India");
		Select select1=new Select(address.getState());
		select1.selectByVisibleText("Tamil Nadu");
		Select select2=new Select(address.getCity());
		select2.selectByVisibleText("Chennai");
		address.getPincode().sendKeys("600053");
		address.getPhoneNumber().sendKeys("9361283615");
		address.getAddAddressButton().click();
	}
	@Test
	public void Profile_04() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		profile.getMyWallet().click();
		profile.getAddMoney().click();
		String PaymentText=profile.getPaymentText().getText();
		System.out.println(PaymentText);
	}
	@Test
	public void Profile_05() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		profile.getMyWallet().click();
		//profile.getUseCoupon().click();
		profile.getCouponCode().sendKeys("GET50");
		profile.getVerifyButton().click();
	}
	@Test
	public void Profile_06() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		profile.getMyWallet().click();
		profile.getViewTransactions().click();
	}
	@Test
	public void Profile_07() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		profile.getMyLikes().click();
		Select select=new Select(profile.getCategoryDropdown());
		select.selectByIndex(2);
		profile.getSweatShirt().click();
		profile.getSubmitButton().click();
	}
	@Test
	public void Profile_08() throws AWTException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Account=new AccountSettings(driver);
		Account.getMyProfile().click();
		ProfileSettings profile=new ProfileSettings(driver);
		//profile.getUploadPhoto().click();
		File file=new File("C:\\Users\\ADMIN\\Downloads\\images (1).png");
		String path=file.getAbsolutePath();
		profile.getUploadPhoto().sendKeys(path);
		profile.getFileSubmit().click();
		
		}
}
