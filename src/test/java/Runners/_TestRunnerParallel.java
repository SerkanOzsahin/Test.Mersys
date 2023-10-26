package Runners;

import Utilities.BD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)

public class _TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserType")
    public void beforeClass(String browserName) {
        BD.threadBrowserName.set(browserName);
    }
}
