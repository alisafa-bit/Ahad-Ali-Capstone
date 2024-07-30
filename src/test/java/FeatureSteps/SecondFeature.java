package FeatureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SecondFeature {
    @Given("open {string} browser")
    public void openWithChrome(String browser){
        System.out.println("open "+ browser);
    }

    @When("enter {int} form {string}")
    public void enteringValueFromCart(int number, String value){
        System.out.println(number + value);
    }

    @When("enter {string} and {string}")
    public void enterCredential(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }


}
