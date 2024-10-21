package tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;

public class AccountPage extends SeleniumUtility {
    public AccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "previousPasswordInput") public WebElement accountProfilePreviousPass;
    @FindBy(id = "newPasswordInput") public WebElement accountProfileNewPassword;
    @FindBy(id = "confirmPasswordInput") public WebElement accountProfileConfirmPassword;
    @FindBy(id = "credentialsSubmitBtn") public WebElement accountProfileChangePasswordBtn;
    @FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]") public WebElement passwordChangedSuccMessage;
    @FindBy(xpath = "//div[contains(text(),'wrong password')]") public WebElement passwordChangedWrangMessage;


    @FindBy(id = "accountLink") public WebElement accountBtnLink;
    @FindBy(id = "nameInput") public WebElement accountProfileNameInput;
    @FindBy(id = "personalPhoneInput") public WebElement accountProfilePhoneNumberInput;
    @FindBy(id = "emailInput") public WebElement accountProfileEmailInput;
    @FindBy(id = "personalUpdateBtn") public WebElement accountProfileUpdateBtn;
    @FindBy(className = "account__information-username") public WebElement accountProfileName;

    @FindBy(xpath = "//img[@class='w-full']") public WebElement addApaymentMethodLinkBtn;
    @FindBy(id = "cardNumberInput") public WebElement cardNumber;
    @FindBy(id = "nameOnCardInput") public WebElement nameOnCard;
    @FindBy(id = "expirationMonthInput") public WebElement expirationDateMonth;
    @FindBy(id = "expirationYearInput") public WebElement expirationDateYear;
    @FindBy(id = "securityCodeInput") public WebElement securityCode;
    @FindBy(id = "paymentSubmitBtn") public WebElement addYourCardBtn;
    @FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]") public WebElement messagePaymentMethodAddedSucessfully;
    @FindBy(xpath = "(//button[@class='text-blue-800 cursor-pointer hover:underline'])[1]") public WebElement cardEditBtn;
    @FindBy(xpath = "(//button[@class='text-blue-800 cursor-pointer hover:underline'])[2]") public WebElement cardRemoveBtn;
    @FindBy(xpath = "//button[contains(text(),'Update Your Card')]") public WebElement updateYourCardBtn;

    @FindBy(xpath = "//p[contains(text(),'Add Address')]") public WebElement addAddressLinkBtn;
    @FindBy(id = "countryDropdown") public WebElement newAddressCountryDropDown;
    @FindBy(id = "fullNameInput") public WebElement newAddressFullName;
    @FindBy(id = "phoneNumberInput") public WebElement newAddressPhoneNumber;
    @FindBy(id = "streetInput") public WebElement newAddressAddress;
    @FindBy(id = "apartmentInput") public WebElement newAddressAppNumber;
    @FindBy(id = "cityInput") public WebElement newAddressCity;
    @FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]") public WebElement newAddressState;
    @FindBy(id = "zipCodeInput") public WebElement newAddressZipCode;
    @FindBy(css = "#apartmentInput") public WebElement newAddressApt;
    @FindBy(id = "addressBtn") public WebElement addYourAddressBtn;
    @FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]") public WebElement messageAddressAddedSucessfully;
    @FindBy(xpath = "(//button[@class='account__address-btn'])[1]") public WebElement addressEditBtn;
    @FindBy(xpath = "(//button[@class='account__address-btn'])[2]") public WebElement addressRemoveBtn;
    @FindBy(xpath = "(//p[text()='Master Card'])[1]") public WebElement masterCard;
    @FindBy(xpath = "//div[text()='Payment Method updated Successfully']") public WebElement messagePaymentUpdateSuccessfully;
    @FindBy(xpath = "//div[text()='Address Updated Successfully']") public WebElement messageAddressUpdateSuccessfully;
    @FindBy(xpath = "//button[text()='Update Your Address']") public WebElement updateYOurMessage;
}
