package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//span[.='Login']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//span[.='Create Account']")
	private WebElement CreateAccountButton;
	
	@FindBy(id = "vertical-tab-2")
	private WebElement AdminLogin;
	
	@FindBy(xpath = "//span[.='Create Account']")
	private WebElement AdminCreateAccount;

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getCreateAccountButton() {
		return CreateAccountButton;
	}

	public WebElement getAdminLogin() {
		return AdminLogin;
	}

	public WebElement getAdminCreateAccount() {
		return AdminCreateAccount;
	}
	
	

}
