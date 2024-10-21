package tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;
import java.util.List;

public class HomePage extends SeleniumUtility {
    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(css = "#signinLink") public WebElement homePageSignInBtn;
    @FindBy(xpath = "//div[@id='cartBtn']") public WebElement homePageCartBtn;
    @FindBy(linkText = "TEKSCHOOL") public WebElement homePageTitle;
    @FindBy(css = "#searchInput") public WebElement homePageSearchInput;
    @FindBy(css = "#searchBtn") public WebElement homePageSearchBtn;
    @FindBy(xpath = "//select[@id='search']") public WebElement AllDepartments;
    @FindBy(xpath = "//button[@id='hamburgerBtn']") public WebElement All;
    @FindBy(linkText = "Test Selenium") public WebElement TestSelenium;
    @FindBy(xpath = "//div[@class='sidebar_content-item']") public List<WebElement> allDepts;
    @FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']") public WebElement kasaOutDoorSmartPlug;
    @FindBy(xpath = "//select[@class ='product__select']") public WebElement qtyDropDown;
    @FindBy(xpath = "//p[text()='Order Placed, Thanks']") public WebElement orderPlacedMessage;
    @FindBy(xpath = "//span[text()='Add to Cart']") public WebElement addToCartBtn;
    @FindBy(xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']") public WebElement apexLegendItem;
    @FindBy(css = "#cartQuantity") public WebElement cartQty;
    @FindBy(css = "#cartBtn") public WebElement cartBtn;
    @FindBy(css = "#proceedBtn") public WebElement proceedBtn;
    @FindBy(css = "#search") public WebElement allDepartments;
    @FindBy(css = "#addPaymentBtn") public WebElement homePageAddNewPayment;
    @FindBy(id = "addAddressBtn") public WebElement homePageAddNewAddress;
    @FindBy(id = "placeOrderBtn") public WebElement placeYourOrderBtn;
    @FindBy(xpath = "//a[text()='Orders']") public WebElement orderBtn;


    @FindBy(xpath = "//span[text()='Electronics']") public WebElement electronics;
    @FindBy(xpath = "//span[text()='Computers']") public WebElement computers;
    @FindBy(xpath = "//span[text()='Smart Home']") public WebElement smartHome;
    @FindBy(xpath = "//span[text()='Sports']") public WebElement sports;
    @FindBy(xpath = "//span[text()='Automative']") public WebElement automative;
}
