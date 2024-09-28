package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {
    /* ----> Eliminate Before hooks
    @Given("Open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
        setupBrowser();
    }
     */
    @Then("Validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
      String getTextLogo = getElementText(By.className("top-nav__logo"));
        System.out.println(getTextLogo);
        Assert.assertEquals("TEKSCHOOL",getTextLogo);
    }
    @Then("Validate Sign in button is Enabled")
    public void ValidateSignInBtnIsEnabled(){
      boolean isSignInBtnEnabled = isElementEnabled(By.id("signinLink"));
      Assert.assertTrue(isSignInBtnEnabled);
    }
    /* ----> Eliminate after Hooks
    @Then("Close the browser")
    public void closingBrowser(){
        quitBrowser();
    }
    */
}
