package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.POMFactory;
import tek.bdd.utility.DataGenUtility;
import tek.bdd.utility.SeleniumUtility;
import java.util.List;
import java.util.Map;


public class LoginSteps extends SeleniumUtility {
    private POMFactory factory = new POMFactory();

    @When("User click on Sign in option")
    public void userClickOnSignInOption() {
        click(factory.homePage().homePageSignInBtn);

    }
    @When("User enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String userName, String password) {
        sendText(factory.signInPage().emailInput,userName );
        sendText(factory.signInPage().passwordInput,password );

    }
    @When("User click on login button")
    public void userClickOnLoginButton() {
        click(factory.signInPage().loginBtn);

    }
    @Then("User should be logged in into Account")
    public void userShouldBeLoggedInIntoAccount() {
        Assert.assertTrue(isElementDisplayed(factory.accountPage().accountBtnLink));

    }

    @When("User click on Create New Account button")
    public void user_click_on_create_new_account_button() {
        click(factory.signInPage().createNewAccLink);
    }
    @When("User fill the signUp information with below data")
    public void user_fill_the_sign_up_information_with_below_data(DataTable dataTable) {
        List<Map<String, String>> signUpInfo = dataTable.asMaps(String.class, String.class);
        sendText(factory.signInPage().signUpNameInput, DataGenUtility.data(signUpInfo.get(0).get("name")));
        sendText(factory.signInPage().signUpEmailInput, DataGenUtility.data(signUpInfo.get(0).get("email")));
        sendText(factory.signInPage().signUpPasswordInput, DataGenUtility.data(signUpInfo.get(0).get("password")));
        sendText(factory.signInPage().signUpConfirmPasswordInput, DataGenUtility.data(signUpInfo.get(0).get("confirmPassword")));

    }
    @When("User click on SignUp button")
    public void user_click_on_sign_up_button() {
        click(factory.signInPage().signUpBtn);
    }
    @Then("User should be logged into account page")
    public void user_should_be_logged_into_account_page() {
        Assert.assertTrue(isElementDisplayed(factory.accountPage().accountBtnLink));

    }
}
