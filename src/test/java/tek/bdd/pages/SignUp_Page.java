package tek.bdd.pages;

import org.openqa.selenium.By;

public class SignUp_Page {
    public static final By VISIBLE_TEXT_SIGN_UP = By.className("signup__subtitle");
    public static final By NAME_INPUT = By.id("nameInput");
    public static final By EMAIL_INPUT = By.id("emailInput");
    public static final By PASSWORD_INPUT = By.id("passwordInput");
    public static final By CONFIRM_PASSWORD = By.id("confirmPassword");
    public static final By CLICK_BTN = By.xpath("//button[text()='Sign Up']");

}
