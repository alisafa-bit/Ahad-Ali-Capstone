package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.AccountProfile;
import tek.bdd.pages.SignInPage;
import tek.bdd.pages.SignUp_Page;
import tek.bdd.utility.RandomEmailPick;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {

    @When("user click on create new account")
    public void userCreateNewAccount() {
        clickOnElement(SignInPage.CREATE_NEW_ACCOUNT);
    }
    @Then("validate user is in create new account page")
    public void validateUserCreateNewAccount(String signUpPageTitle) {
        String displayText = getElementText(SignUp_Page.VISIBLE_TEXT_SIGN_UP);
        Assert.assertEquals(signUpPageTitle,displayText);
    }
    @When("user enter new account information and click on create account")
    public void userEnterNewAccountAndClickCreateAccount() {
         String nameInput = "ali_safa";
         String randomEmail = RandomEmailPick.getEmail(nameInput);
         sentText(SignUp_Page.NAME_INPUT,"ali_safa");
         sentText(SignUp_Page.EMAIL_INPUT,randomEmail);
         sentText(SignUp_Page.PASSWORD_INPUT,"Password@123");
         sentText(SignUp_Page.CONFIRM_PASSWORD,"Password@123");
         clickOnElement(SignUp_Page.CLICK_BTN);
    }
    @Then("validate new account created")
    public void validateNewAccountCreated() {
        clickOnElement(AccountProfile.PROFILE_ACCOUNT);
    }

}
