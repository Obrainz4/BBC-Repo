package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcSignInPage extends BasePage {

    public BbcSignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-identifier-input']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@id='password-input']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement doneButton;

    @FindBy(xpath = "//span[normalize-space()='Sorry, that password is too short']")
    private WebElement passwordError;



    public void enterEmailAddress(String EmailAddress){
        emailField.clear();
        emailField.sendKeys(EmailAddress);
    }

    public void clickNextButton(){
        nextButton.click();
    }

    public void enterPassword(String Password){
        passwordField.clear();
        passwordField.sendKeys(Password);
    }

    public void clickDoneButton(){
        doneButton.click();
    }

    public void enterWrongEmailAddress(String WrongEmailAddress){
        emailField.clear();
        emailField.sendKeys(WrongEmailAddress);
    }

    public void enterWrongPassword(String WrongPassword){
        passwordField.clear();
        passwordField.sendKeys(WrongPassword);
    }
    public void isPasswordErrorDisplayed(){
        Assert.assertTrue(passwordError.isDisplayed());
    }

}

