package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings {
	public AccountSettings(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[.='My Profile']")
	private WebElement MyProfile;
	
	@FindBy(xpath = "//li[.='Wish List']")
	private WebElement WishList;
	
	@FindBy(xpath = "//li[.='My Orders']")
	private WebElement MyOrders;
	
	@FindBy(xpath = "//li[.='My Likes']")
	private WebElement MyLikes;
	
	@FindBy(xpath = "//li[.='Logout']")
	private WebElement Logout;

	public WebElement getMyProfile() {
		return MyProfile;
	}

	public WebElement getWishList() {
		return WishList;
	}

	public WebElement getMyOrders() {
		return MyOrders;
	}

	public WebElement getMyLikes() {
		return MyLikes;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	
}
