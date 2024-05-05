package testScript;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generalUtility.BaseClass;
import objectRepository.AdminSignin;
import objectRepository.LoginPage;
import objectRepository.SigninPage;
import objectRepository.WelcomePage;

public class SigninTest extends BaseClass {
	@Test
	public void Signin_01() {
		WelcomePage welcome= new WelcomePage(driver);
		welcome.getLoginButton().click();
		LoginPage login=new LoginPage(driver);
		login.getCreateAccountButton().click();
		SigninPage signin=new SigninPage(driver);
		signin.getFirstName().sendKeys("prabhu");
		signin.getLastName().sendKeys("sai");
		signin.getMaleButton().click();
		signin.getPhoneNumber().sendKeys("8072794150");
		signin.getEmailAddress().sendKeys("darshan060218@gmail.com");
		signin.getPassword().sendKeys("Prabhu@31");
		signin.getConfirmPassword().sendKeys("Prabhu@31");
		signin.getTermsAndConditions().click();
		signin.getRegisterButton().click();
		
	}
	@Test
	public void Signin_02() {
		WelcomePage welcome= new WelcomePage(driver);
		welcome.getLoginButton().click();
		LoginPage login=new LoginPage(driver);
		login.getAdminLogin().click();
		login.getAdminCreateAccount().click();
		AdminSignin signin=new AdminSignin(driver);
		signin.getFirstName().sendKeys("prabhu");
		signin.getLastName().sendKeys("sai");
		signin.getMale().click();
		signin.getPhoneNumber().sendKeys("8072794150");
		signin.getEmailAddress().sendKeys("darshan060218@gmail.com");
		signin.getPassword().sendKeys("Prabhu@31");
		signin.getConfirmPassword().sendKeys("Prabhu@31");
		
		Select select=new Select(signin.getCountry());
		select.selectByVisibleText("India");
		Select select1=new Select(signin.getState());
		select1.selectByVisibleText("Tamil Nadu");
		Select select2=new Select(signin.getCity());
		select2.selectByVisibleText("Chennai");
		
		signin.getRegister().click();
		
	}

}
