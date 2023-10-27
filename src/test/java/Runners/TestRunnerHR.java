package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/Position_Categories_Management.feature",
                "src/test/java/FeatureFiles/Attestations_Management.feature",
                "src/test/java/FeatureFiles/Creating_Positions_Under_HR.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunnerHR extends AbstractTestNGCucumberTests {
}
