package generalUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.AccountSettings;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class BaseClass extends UtilityMethods {
	public WebDriver driver;
	@BeforeClass
	public void browserConfig() {
		
		
		String browser="chrome";
		String url="https://www.shoppersstack.com/";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}

		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		
	}
	
	@BeforeMethod
	public void login() {
		
      WelcomePage welcome=new WelcomePage(driver);
      LoginPage login=new LoginPage(driver);
      String Email="darshan060218@gmail.com";
      String Password="Prabhu@31";
      
      welcome.getLoginButton().click();
      
      login.getEmailTextField().sendKeys(Email);
      
      login.getPasswordTextField().sendKeys(Password);
      
      login.getLoginButton().click();
      
      } 
	
	@AfterMethod
	public void logout()
	{
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getAccountSettingsLink().click();
		AccountSettings Acc=new AccountSettings(driver);
		Acc.getLogout().click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
