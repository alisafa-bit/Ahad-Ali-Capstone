package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }
    @When("user enter username and password and click on login")
    public void userEnterAndClickOnLogin() {
        sendText(SignInPage.EMAIL_INPUT,"mohammad2536@gmail.com");
        sendText(SignInPage.PASSWORD_INPUT,"Password@123");
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }

    @When("user enter {string} and {string} and click on login")
    public void userEnterAndClickOnLoginWithInvalid(String email, String password) {
        sendText(SignInPage.EMAIL_INPUT,email);
        sendText(SignInPage.PASSWORD_INPUT,password);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }

    @Then("user should see error {string}")
    public void user_should_see_error(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("user should be able to see account link")
    public void userShouldBeAbleToSeeAccountLink() {
        boolean isAccountDisplayed = isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isAccountDisplayed);
    }
}
