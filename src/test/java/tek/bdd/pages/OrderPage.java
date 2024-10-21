package tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;

public class OrderPage extends SeleniumUtility {
    public OrderPage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(css = "#cancelBtn") public WebElement cancelOrderBtn;
    @FindBy(css = "#returnBtn") public WebElement returnOrderBtn;
    @FindBy(css = "#buyAgainBtn") public WebElement buyAgainOrderBtn;
    @FindBy(css = "#reviewBtn") public WebElement reviewBtn;
    @FindBy(xpath = "//p[text()='Hide Details']") public WebElement hideDetails;
    @FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']") public WebElement messageYourOrderCancelled;
    @FindBy(xpath = "(//p[text()='Show Details'])[7]") public WebElement showDetails;
    @FindBy(css = "#reasonInput") public WebElement cancellationReason;
    @FindBy(css = "#orderSubmitBtn") public WebElement cancelSubmitBtn;
    @FindBy(css = "#dropOffInput") public WebElement returnSubmitBtn;
    @FindBy(css = "##dropOffInput") public WebElement dropOffFedex;
    @FindBy(id = "reasonInput") public WebElement itemDropDown;
    @FindBy(id = "orderSubmitBtn") public WebElement returnOrderBtnOrder;
    @FindBy(id = "newReviewForm") public WebElement addReviewBtn;
    @FindBy(css = "#dropOffInput") public WebElement whereToDropOff;
    @FindBy(css = "#orderSubmitBtn") public WebElement returnOrderSubmitBtn;
    @FindBy(css = "#headlineInput") public WebElement headlineInput;
    @FindBy(xpath = "//p[text()='Return was successfull']") public WebElement messageReturnWasSuccessfull;
    @FindBy(css = "#descriptionInput") public WebElement writtenInput;
    @FindBy(css = "#reviewSubmitBtn") public WebElement addYourReview;
    @FindBy(xpath = "//div[text()='Your review was added successfully']") public WebElement messageYourReviewWasAdded;


}
