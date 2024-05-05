package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[.='Remove from cart']")
	private WebElement RemoveCart;
	
	@FindBy(xpath = "//button[.='Yes']")
	private WebElement YesRemoveCart;
	
	@FindBy(id = "buynow_fl")
	private WebElement BuyNow;
	
	@FindBy(id = "37979")
	private WebElement SelectAddress;
	
	@FindBy(xpath = "//button[.='Proceed']")
	private WebElement ProceedButton;
	
	@FindBy(name = "radio-buttons-group")
	private WebElement PaymentMethod;
	
	@FindBy(xpath = "//button[.='Proceed']")
	private WebElement PaymentProceed;

	public WebElement getRemoveCart() {
		return RemoveCart;
	}

	public WebElement getYesRemoveCart() {
		return YesRemoveCart;
	}

	public WebElement getBuyNow() {
		return BuyNow;
	}

	public WebElement getSelectAddress() {
		return SelectAddress;
	}

	public WebElement getProceedButton() {
		return ProceedButton;
	}

	public WebElement getPaymentMethod() {
		return PaymentMethod;
	}

	public WebElement getPaymentProceed() {
		return PaymentProceed;
	}
	
	
	
}
