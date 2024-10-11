package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {


    @Given("User is on retail website")
    public void user_is_on_retail_website() {
    }

    @When("User click on Sign in option")
    public void user_click_on_sign_in_option() {

    }
    @Then("User enter email {string} and password {string}")
    public void user_enter_email_and_password(String string, String string2) {

    }
    @Then("User click on login button")
    public void user_click_on_login_button() {

    }
    @Then("User should be logged in into Account")
    public void user_should_be_logged_in_into_account() {

    }
}
