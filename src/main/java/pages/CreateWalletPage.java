package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateWalletPage extends BasePage {

	public String actualwalletname;

	@FindBy(className="android.widget.Button")
	WebElement getStartedbtn;

	@FindBy(xpath="//*[contains(@text, \"Create new wallet\")]")
	WebElement createWalletBtn;

	@FindBy(xpath="(//android.widget.Button[@index=2])[1]")
	WebElement addWalletBtn;

	@FindBy(xpath=" //*[contains(@text, \"SKIP\")]")
	WebElement skipBtn;

	@FindBy(xpath=" //*[contains(@text, \"Create passcode\")]")
	WebElement passcodePg;

	@FindBy(xpath=" //*[contains(@text, \"Confirm passcode\")]")
	WebElement confirmCodePg;

	@FindBy(xpath=" //*[contains(@text, \"1\")]")
	WebElement oneBtn;

	@FindBy(xpath=" //*[contains(@text, \"2\")]")
	WebElement twoBtn;

	@FindBy(xpath=" //*[contains(@text, \"3\")]")
	WebElement threebtn;

	@FindBy(xpath=" //*[contains(@text, \"4\")]")
	WebElement fourBtn;

	@FindBy(xpath=" //*[contains(@text, \"5\")]")
	WebElement fiveBtn;

	@FindBy(xpath=" //*[contains(@text, \"6\")]")
	WebElement sixBtn;

	@FindBy(xpath=" //*[contains(@text, \"Start using Trust Wallet\")]")
	WebElement onboardedBtn;

	@FindBy(xpath=" //*[contains(@text, \"Main Wallet 1\")]")
	WebElement createdWalletName;

	@FindBy(xpath=" //*[contains(@text, \"Main Wallet 2\")]")
	WebElement addedWalletName;

	public void createWallet()
	{
		getStartedbtn.click();
		createWalletBtn.click();
		skipBtn.click();
		enterPasscode();
		enterPasscode();
		onboardedBtn.click();
		actualwalletname = createdWalletName.getText();
	}

	public void enterPasscode()
	{
		oneBtn.click();
		twoBtn.click();
		threebtn.click();
		fourBtn.click();
		fiveBtn.click();
		sixBtn.click();
	}

	public void addWallet()
	{
		createdWalletName.click();
		addWalletBtn.click();
		createWalletBtn.click();
		skipBtn.click();
		onboardedBtn.click();
		actualwalletname = addedWalletName.getText();
	}

}






