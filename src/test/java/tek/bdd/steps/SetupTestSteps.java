package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {
    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
        setupBrowser();
    }
    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
    String actualText = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals("TEKSCHOOL",actualText);
        System.out.println(actualText);
    }

    @Then("Validate Sign in button is Enabled")
    public void validateSignInButtonIsEnabled() {
       boolean isSignInEnabled = isElementEnabled(By.id("signinLink"));
       Assert.assertTrue(isSignInEnabled);
    }

    @Then("close the browser")
    public void closeBrowser(){
        quitBrowser();
    }

}
