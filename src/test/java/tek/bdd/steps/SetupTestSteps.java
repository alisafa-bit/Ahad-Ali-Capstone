package tek.bdd.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {

    @Then("Validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
      String getTextLogo = getElementText(By.className("top-nav__logo"));
        System.out.println(getTextLogo);
        Assert.assertEquals("TEKSCHOOL",getTextLogo);
    }
    @Then("Validate Sign in button is Enabled")
    public void validateSignInButtonIsEnabled() {
        boolean isSignInBtnEnabled = isElementEnabled(By.id("signinLink"));
        Assert.assertTrue(isSignInBtnEnabled);
    }
}
