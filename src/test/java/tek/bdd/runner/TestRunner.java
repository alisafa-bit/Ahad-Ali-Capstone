package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        dryRun = false,// true for unimplemented steps
        tags = "@Regression",
        plugin = {
                "html:target/cucumber_report/index.html"
        }
)
public class TestRunner {
}
//Running multiple tags => tags = "@Smoke or @Regression"
