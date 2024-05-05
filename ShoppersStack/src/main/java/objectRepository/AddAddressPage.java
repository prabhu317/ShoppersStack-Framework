package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage {
	public AddAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Home")
	private WebElement Home;
	
	@FindBy(id = "Name")
	private WebElement Name;
	
	@FindBy(id = "House/Office Info")
	private WebElement HomeInfo;
	
	@FindBy(id = "Street Info")
	private WebElement StreetInfo;
	
	@FindBy(id = "Landmark")
	private WebElement Landmark;
	
	@FindBy(id = "Country")
	private WebElement Country;
	
	@FindBy(id = "State")
	private WebElement State;
	
	@FindBy(id = "City")
	private WebElement City;
	
	@FindBy(id = "Pincode")
	private WebElement Pincode;
	
	@FindBy(id = "Phone Number")
	private WebElement PhoneNumber;
	
	@FindBy(id = "addAddress")
	private WebElement AddAddressButton;

	public WebElement getHome() {
		return Home;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getHomeInfo() {
		return HomeInfo;
	}

	public WebElement getStreetInfo() {
		return StreetInfo;
	}

	public WebElement getLandmark() {
		return Landmark;
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

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getAddAddressButton() {
		return AddAddressButton;
	}

	
}
