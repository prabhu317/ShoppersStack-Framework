package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "First Name")
	private WebElement FirstName;

	@FindBy(id = "Last Name")
	private WebElement LastName;
	
	@FindBy(id = "Male")
	private WebElement MaleButton;
	
	@FindBy(id = "Phone Number")
	private WebElement PhoneNumber;
	
	@FindBy(id = "Email Address")
	private WebElement EmailAddress;
	
	@FindBy(id = "Password")
	private WebElement Password;
	
	@FindBy(id = "Confirm Password")
	private WebElement ConfirmPassword;
	
	@FindBy(id = "Terms and Conditions")
	private WebElement TermsAndConditions;
	
	@FindBy(id = "btnDisabled")
	private WebElement RegisterButton;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getMaleButton() {
		return MaleButton;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getTermsAndConditions() {
		return TermsAndConditions;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	
}
