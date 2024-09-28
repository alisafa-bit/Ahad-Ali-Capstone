package tek.bdd.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrows implements BaseBrowser{
    public WebDriver openBrowser(boolean isHeadless){
        EdgeOptions options = new EdgeOptions();
        if(isHeadless) options.addArguments("--headless");
        return new EdgeDriver(options);
    }
}
