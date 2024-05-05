package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSignin {
	public AdminSignin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "First Name")
	private WebElement FirstName;
	
	@FindBy(id = "Last Name")
	private WebElement LastName;
	
	@FindBy(id = "Male")
	private WebElement Male;
	
	@FindBy(id = "Phone Number")
	private WebElement PhoneNumber;
	
	@FindBy(id = "Email Address")
	private WebElement EmailAddress;
	
	@FindBy(id = "Password")
	private WebElement Password;
	
	@FindBy(id = "Confirm Password")
	private WebElement ConfirmPassword;
	
	@FindBy(id = "Country")
	private WebElement Country;
	
	@FindBy(id = "State")
	private WebElement State;
	
	@FindBy(id = "City")
	private WebElement City;
	
	@FindBy(id = "Register")
	private WebElement Register;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getMale() {
		return Male;
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

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getRegister() {
		return Register;
	}
	
	

}
