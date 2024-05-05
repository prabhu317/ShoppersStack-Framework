package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettings {
	public ProfileSettings(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='r1']//button")
	private WebElement EditProfileButton;
	
	@FindBy(id = "First Name")
	private WebElement EditFirstName;
	
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	private WebElement DobCalendar;
	
	@FindBy(name = "submit")
	private WebElement EditProfileSubmit;
	
	@FindBy(xpath = "//div[.='My Addresses']")
	private WebElement MyAddressesButton;
	
	@FindBy(xpath = "//div[@class='addressListContainer']//button")
	private WebElement AddAddressesLink;
	
	@FindBy(xpath = "//div[.='My Wallet']")
	private WebElement MyWallet;
	
	@FindBy(xpath = "//button[.='Add Money']")
	private WebElement AddMoney;
	
	@FindBy(xpath = "//button[.='Use Coupon']")
	private WebElement UseCoupon;

	@FindBy(xpath = "//button[.='View Transactions']")
	private WebElement ViewTransactions;
	
	@FindBy(id = "Coupon Code")
	private WebElement CouponCode;
	
	@FindBy(id = "Verify")
	private WebElement VerifyButton;
	
	@FindBy(id = "modal-modal-description")
	private WebElement PaymentText;
	
	@FindBy(xpath = "//div[.='My Likes']")
	private WebElement MyLikes;
	
	@FindBy(id = "Category")
	private WebElement CategoryDropdown;
	
	@FindBy(xpath = "//option[.='Sweatshirt']")
	private WebElement SweatShirt;
	
	@FindBy(id = "Submit")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "(//span[contains(@class,'BaseBadge-badge MuiBadge-badge')])[2]")
	private WebElement UploadPhoto;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement ChooseFile;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement FileSubmit;
	
	public WebElement getEditProfileButton() {
		return EditProfileButton;
	}

	public WebElement getEditFirstName() {
		return EditFirstName;
	}

	public WebElement getDobCalendar() {
		return DobCalendar;
	}

	public WebElement getMyAddressesButton() {
		return MyAddressesButton;
	}

	public WebElement getAddAddressesLink() {
		return AddAddressesLink;
	}

	public WebElement getMyWallet() {
		return MyWallet;
	}

	public WebElement getAddMoney() {
		return AddMoney;
	}

	public WebElement getUseCoupon() {
		return UseCoupon;
	}

	public WebElement getViewTransactions() {
		return ViewTransactions;
	}

	public WebElement getCouponCode() {
		return CouponCode;
	}

	public WebElement getVerifyButton() {
		return VerifyButton;
	}

	public WebElement getPaymentText() {
		return PaymentText;
	}

	public WebElement getMyLikes() {
		return MyLikes;
	}

	public WebElement getCategoryDropdown() {
		return CategoryDropdown;
	}

	public WebElement getSweatShirt() {
		return SweatShirt;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getUploadPhoto() {
		return UploadPhoto;
	}

	public WebElement getChooseFile() {
		return ChooseFile;
	}

	public WebElement getFileSubmit() {
		return FileSubmit;
	}

	public WebElement getEditProfileSubmit() {
		return EditProfileSubmit;
	}
	
}
