package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "loginBtn")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//a[@id='home']//img")
	private WebElement AppLogo;
	
	@FindBy(className = "welcomebar_welcomeBar__3WTVB")
	private WebElement WelcomeBar;
	
	@FindBy(id = "men")
	private WebElement MenLink;
	
	@FindBy(id = "women")
	private WebElement WomenLink;
	
	@FindBy(id = "kids")
	private WebElement KidsLink;
	
	@FindBy(id = "electronics")
	private WebElement ElectronicsLink;
	
	@FindBy(id = "beautyProducts")
	private WebElement BeautyProductsLink;
	
	@FindBy(id = "category")
	private WebElement CategoryDropDown;
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-5nwj3y']//div")
	private WebElement AccountSettingsLink;
	
	@FindBy(id = "search")
	private WebElement SearchField;
	
	@FindBy(id = "searchBtn")
	private WebElement SearchButton;
	
	@FindBy(id = "cartIcon")
	private WebElement CartIcon;
	
	@FindBy(xpath = "//div[@class='navbar_authBlock2__Br4we']//h3")
	private WebElement NameText;
	
	@FindBy(className = "chatbot-items")
	private WebElement ChatLink;
	
	@FindBy(xpath = "//img[@alt='kids']")
	private WebElement KidsSection;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 6']")
	private WebElement NextPageLink;
	
	@FindBy(linkText = "Voucher")
	private WebElement VoucherLink;
	
	@FindBy(linkText = "FAQ")
	private WebElement FAQLink;

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getAppLogo() {
		return AppLogo;
	}

	public WebElement getWelcomeBar() {
		return WelcomeBar;
	}

	public WebElement getMenLink() {
		return MenLink;
	}

	public WebElement getWomenLink() {
		return WomenLink;
	}

	public WebElement getKidsLink() {
		return KidsLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getBeautyProductsLink() {
		return BeautyProductsLink;
	}

	public WebElement getCategoryDropDown() {
		return CategoryDropDown;
	}

	public WebElement getAccountSettingsLink() {
		return AccountSettingsLink;
	}

	public WebElement getSearchField() {
		return SearchField;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getCartIcon() {
		return CartIcon;
	}

	public WebElement getNameText() {
		return NameText;
	}

	public WebElement getChatLink() {
		return ChatLink;
	}

	public WebElement getKidsSection() {
		return KidsSection;
	}

	public WebElement getNextPageLink() {
		return NextPageLink;
	}

	public WebElement getVoucherLink() {
		return VoucherLink;
	}

	public WebElement getFAQLink() {
		return FAQLink;
	}
	
	

}
