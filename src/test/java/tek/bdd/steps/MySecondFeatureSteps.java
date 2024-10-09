package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MySecondFeatureSteps {

    @Given("open {string} browser")
    public void openBrowser(String browser){
        System.out.println("opening " + browser);
    }

    @When("enter {int} from {string}")
    public void enteringValueFromCart(int number, String value){
        System.out.println( number + value);
    }
    @When("enter {string} and {string}")
    public void enteringCredentials(String username, String password){
        System.out.println(username + password);
    }

}
