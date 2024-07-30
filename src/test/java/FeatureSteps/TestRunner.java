package FeatureSteps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath.feature/SecondFeature",
        glue = "FeatureSteps"
)

public class TestRunner {
}
