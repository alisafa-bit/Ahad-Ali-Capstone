package FeatureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstFeature {

    @Given("open some type of browser")
    public void openSomeBrowser(){
        System.out.println("opening some browser");
    }

    @Given("navigate to retail app")
    public void navigateToRetalApp(){
        System.out.println("navigating to retail app");
    }

    @When("Click on Sign in button")
    public void clickOnSignInBtn(){
        System.out.println("Click the button");
    }

    @Then("validate your are in sign in page")
    public void verifyingYourInfo(){
        System.out.println("validate your are in sign in page");
    }

    @When("fill up sign in form and click sign in")
    public void fillUpYourCredential(){
        System.out.println("fill up and click sign in");
    }

    @Then("validate you are signed in")
    public void validateYourCredential(){
        System.out.println("validate you are signed in");
    }

    @When("enter invalid username and password and click sign in")
    public void invalidUserNameAndPassword(){
        System.out.println("enter invalid username and password and click sign in");
    }

    @Then("validate error message")
    public void validateErrorMessage(){
        System.out.println("validate error message");
    }

}
