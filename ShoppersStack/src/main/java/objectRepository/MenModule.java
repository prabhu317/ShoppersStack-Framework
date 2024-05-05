package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenModule {
	public MenModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "T-shirts")
	private WebElement TShirts;
	
	@FindBy(linkText = "Kurtas & kurta Sets")
	private WebElement Kurtas;
	
	@FindBy(xpath = "//img[@alt='Levis Mens Regular Fit Tee']")
	private WebElement LevisMen;
	
	@FindBy(xpath = "//img[@alt='Men Viscose Rayon Kurta Churidar Set']")
	private WebElement KurtaSet;
	
	@FindBy(id = "Add To Cart")
	private WebElement AddCart;
	
	@FindBy(id = "Buy Now")
	private WebElement BuyNow;
	
	@FindBy(id = "compare")
	private WebElement CompareButton;
	
	@FindBy(id = "Check Delivery")
	private WebElement CheckDelivery;
	
	@FindBy(id = "Check")
	private WebElement CheckButton;
	
	@FindBy(linkText = "Check deliverable pins.")
	private WebElement DeliverablePins;
	
	@FindBy(id = "simple-tab-5")
	private WebElement AvatarImages;
	
	@FindBy(xpath = "//img[@alt='avatar 1']")
	private WebElement Image1;

	public WebElement getTShirts() {
		return TShirts;
	}

	public WebElement getKurtas() {
		return Kurtas;
	}

	public WebElement getLevisMen() {
		return LevisMen;
	}

	public WebElement getKurtaSet() {
		return KurtaSet;
	}

	public WebElement getAddCart() {
		return AddCart;
	}

	public WebElement getBuyNow() {
		return BuyNow;
	}

	public WebElement getCompareButton() {
		return CompareButton;
	}

	public WebElement getCheckDelivery() {
		return CheckDelivery;
	}

	public WebElement getCheckButton() {
		return CheckButton;
	}

	public WebElement getDeliverablePins() {
		return DeliverablePins;
	}

	public WebElement getAvatarImages() {
		return AvatarImages;
	}

	public WebElement getImage1() {
		return Image1;
	}
	
	
}
