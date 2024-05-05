package testScript;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generalUtility.BaseClass;
import objectRepository.CartPage;
import objectRepository.MenModule;
import objectRepository.WelcomePage;

public class CartPageTest extends BaseClass {
	@Test
	 public void Cart_01() throws InterruptedException {
		 WelcomePage welcome=new WelcomePage(driver);
		 welcome.getMenLink().click();
		 MenModule men=new MenModule(driver);
		 men.getLevisMen().click();
		 men.getAddCart().click();
		 driver.navigate().back();
		 driver.navigate().back();
		 welcome.getCartIcon().click();
		 CartPage cart=new CartPage(driver);
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfAllElements(cart.getRemoveCart()));
		 cart.getRemoveCart().click();
		 cart.getYesRemoveCart().click();
	 }
	@Test
	 public void Cart_02() {
		 WelcomePage welcome=new WelcomePage(driver);
		 welcome.getCartIcon().click();
		 CartPage cart=new CartPage(driver);
		 cart.getBuyNow().click();
		 cart.getSelectAddress().click();
		 cart.getProceedButton().click();
		 cart.getPaymentMethod().click();
		 cart.getPaymentProceed().click();
	 }
	

}
