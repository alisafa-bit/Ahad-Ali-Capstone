package tek.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;

public class SignInPage extends SeleniumUtility {
         public SignInPage(){
             PageFactory.initElements(getDriver(),this);
}

@FindBy(css = "#signinLink") public WebElement homePageSignInBtn;
@FindBy(name = "email") public WebElement emailInput;
@FindBy(name = "password") public WebElement passwordInput;
@FindBy(id = "loginBtn") public WebElement loginBtn;
@FindBy(linkText = "Create New Account") public WebElement createNewAccLink;
@FindBy(linkText = "want to sell something?") public WebElement wanToSellSomethingLink;
@FindBy(id = "nameInput") public WebElement signUpNameInput;
@FindBy(id = "emailInput") public WebElement signUpEmailInput;
@FindBy(id = "passwordInput") public WebElement signUpPasswordInput;
@FindBy(id = "confirmPasswordInput") public WebElement signUpConfirmPasswordInput;
@FindBy(id = "signupBtn") public WebElement signUpBtn;


public void signIn(String userName, String password) {
    click(homePageSignInBtn);
    sendText(emailInput, userName);
    sendText(passwordInput, password);
    click(loginBtn);
}

}
