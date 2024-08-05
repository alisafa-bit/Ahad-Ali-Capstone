package tek.bdd.pages;

import org.openqa.selenium.By;

public class HomePage {
    //POM is design pattern where class contains All the elements
    // of a Web App Page. Each page should have respective java class to store its elements
    public static final By TITLE_LOGO = By.className("top-nav__logo");
    public static final By SIGN_IN_LINK = By.id("signinLink");
    public static final By ACCOUNT_LINK = By.id("accountLink");
}
