package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/Subject_Categories.feature",
                "src/test/java/FeatureFiles/School_Setup_Location.feature",
                "src/test/java/FeatureFiles/Department_Configuration.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunnerSchool extends AbstractTestNGCucumberTests {
}
