package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;
import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    public WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20));
    }
    public WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void sendText(By locator, String value){
        waitForVisibility(locator).sendKeys(value);
    }
    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
    public void clickOnElement(WebElement locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
    public void sendText(WebElement element, String text) {
        WebElement targetElement = getWait().until(ExpectedConditions.visibilityOf(element));
        targetElement.clear();
        targetElement.sendKeys(text);
    }
    //Create method for getting the text of a locator
    public String getElementText(By locator) {
        return waitForVisibility(locator).getText();
    }

    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator)
                .isEnabled();
    }

    public boolean isElementDisplayed(By locator) {
        return waitForVisibility(locator)
                .isDisplayed();
    }
}
