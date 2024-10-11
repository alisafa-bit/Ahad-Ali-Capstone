package tek.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.base.BaseSetup;

public class HomePage extends BaseSetup {
    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }
    public static final By SIGN_IN_LINK = By.id("signinLink");
    public static final By ACCOUNT_LINK = By.id("accountLink");

    @FindBy(linkText = "Sign in") public WebElement homePageSignInBtn;
    @FindBy(id = "cartBtn") public WebElement homePageCartBtn;
    @FindBy(id = "searchInput") public WebElement homePageSearchInput;
    @FindBy(linkText = "TEKSCHOOL") public WebElement homePageTitle;
    @FindBy(css = "#searchBtn") public WebElement homePageSearchBtn;
    @FindBy(xpath = "select[@id='search']") public WebElement homePageAllDepartments;
    @FindBy(css = "//button[@id='hamburgerBtn']") public WebElement homePageAll;
    @FindBy(linkText = "Test Selenium") public WebElement homePageTestSelenium;


}
