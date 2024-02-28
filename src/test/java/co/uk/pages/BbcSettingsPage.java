package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcSettingsPage extends BasePage {

    public BbcSettingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[normalize-space()='onyx3k4u@yahoo.com']")
    private WebElement personalDetails;


   public void isPersonalDetailsDisplayed(){
        Assert.assertTrue("User is logged in",personalDetails.isDisplayed());

    }

}
