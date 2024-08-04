package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {
    @When("user click on sign in link")
    public void userClickOnSignInLink() {
        clickOnElement(HomePage.SIGN_IN_LINK);
    }
    @Then("validate user is in sign in page")
    public void validateUserIsInSignInPage() {
        String pageTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageTitle);
    }
    @When("user enter username and password and click on login")
    public void userEnterUsernameAndPasswordAndClickOnLogin() {
        sentText(SignInPage.EMAIL_INPUT,"mnm87@gmail.com");
        sentText(SignInPage.PASSWORD_INPUT,"Password_87");
        clickOnElement(SignInPage.CLICK_ON_BTN);
    }
    @When("user enter {string} and {string} and click on login")
    public void userEnterUserNameAndPassword(String username, String password) {
        sentText(SignInPage.EMAIL_INPUT, username);
        sentText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.CLICK_ON_BTN);
    }

    @Then("user should be able to see account link")
    public void userShouldBeAbleSeeAccountLink() {
       Boolean isAccountDisplayed = isElementEnabled(HomePage.ACCOUNT_LINK);
       Assert.assertTrue(isAccountDisplayed);
    }
    @Then("user should see error {string}")
    public void userShouldSeeError(String errorMessage) {
        String mainMessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(errorMessage,mainMessage);
    }


}
