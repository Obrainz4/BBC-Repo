package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcHomePage extends BasePage {

    public BbcHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='ssrcss-qgttmg-AccountText e1gviwgp4']")
    private WebElement SignInLogo;

    @FindBy(xpath = "//span[@class='ssrcss-qgttmg-AccountText e1gviwgp4']")
    private WebElement yourAccount;

    @FindBy(xpath = "//a[@href='/account/settings']")
    private WebElement settings;




    public BbcSignInPage ClickSignInLogo() {
        SignInLogo.click();
        return new BbcSignInPage(driver);
    }

    public void clickOnYourAccount() {
        yourAccount.click();
    }

    public BbcSettingsPage clickOnSettings() {
        settings.click();
        return new BbcSettingsPage(driver);

    }

}
