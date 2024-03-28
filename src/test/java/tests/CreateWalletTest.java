package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CreateWalletPage;
public class CreateWalletTest extends BaseTest {

	CreateWalletPage createWalletPage;
	public String expectedWalletName = "Main Wallet 1";

	@BeforeMethod
	public void setup() {
		createWalletPage = new CreateWalletPage();
	}

	@Test(description = "Create wallet from onboarding page after app install", priority=1)
	public void createWalletFromOnboarding() {  
		createWalletPage.createWallet();    	
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(createWalletPage.actualwalletname, expectedWalletName);	  
	}

	@Test(description = "Create wallet from manage wallet page", priority=2)
	public void createWalletFromManageWallet() {    	
		createWalletPage.addWallet();    	
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(createWalletPage.actualwalletname, expectedWalletName);	  
	}

}