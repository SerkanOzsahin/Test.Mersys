package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_03_Document_Types_Management.feature"
        },
        glue = {"StepDefinitions"}
)

public class _TestRunnerDocuments extends AbstractTestNGCucumberTests {
}
