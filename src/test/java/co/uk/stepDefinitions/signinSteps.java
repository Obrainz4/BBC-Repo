package co.uk.stepDefinitions;


import co.uk.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.support.PageFactory;

public class signinSteps extends BasePage{

        BbcHomePage BbcHomePage = PageFactory.initElements(driver, co.uk.pages.BbcHomePage.class);
        BbcSignInPage BbcSignInPage = PageFactory.initElements(driver, co.uk.pages.BbcSignInPage.class);

        BbcNewsPage BbcNewsPage = PageFactory.initElements(driver, co.uk.pages.BbcNewsPage.class);

        BbcSettingsPage BbcSettingsPage = PageFactory.initElements(driver, co.uk.pages.BbcSettingsPage.class);



        @Given("that I navigate to BBC Homepage")
        public void that_i_navigate_to_bbc_homepage() {
        launchUrl();
        }

        @Given("I click on the sign in")
        public void i_click_on_the_sign_in() {
       BbcSignInPage = BbcHomePage.ClickSignInLogo();
        }

        @When("I enter a valid {string}")
        public void i_enter_a_valid(String EmailAddress) {
        BbcSignInPage.enterEmailAddress(EmailAddress);
        BbcSignInPage.clickNextButton();
        }

        @When("I enter a valid Password as {string}")
        public void i_enter_a_valid_password_as(String Password) {
        BbcSignInPage.enterPassword(Password);
        }

        @When("I click on the Sign in user button")
        public void i_click_on_the_sign_in_user_button() {
            BbcSignInPage.clickDoneButton();
        }

        @Then("I will be successfully logged into BBC webpage")
        public void i_will_be_successfully_logged_into_bbc_webpage() {
            BbcHomePage.clickOnYourAccount();
            BbcHomePage.clickOnSettings();
            BbcSettingsPage.isPersonalDetailsDisplayed();

        }


        @Given("I click on sign in")
        public void i_click_on_sign_in() {

        }
        @When("I enter a {string}")
        public void i_enter_a(String string) {

        }

        @Then("an error message is displayed")
        public void an_error_message_is_displayed() {

        }

        @When("I click on the search BBC field")
        public void i_click_on_the_search_bbc_field() {

        }
        @When("I enter the {string}")
        public void i_enter_the(String string) {

        }
        @Then("a list of news is displayed")
        public void a_list_of_news_is_displayed() {

        }






}








