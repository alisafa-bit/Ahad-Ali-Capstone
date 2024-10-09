package tek.bdd.base;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseSetup {

    private static WebDriver driver;

    public void setupBrowser(){
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void quitBrowser(){
        if(driver != null){
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

}
