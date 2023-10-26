package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_01_Position_Categories_Management.feature",
                "src/test/java/FeatureFiles/_02_Attestations_Management.feature",
                "src/test/java/FeatureFiles/_05_Creating_Positions_Under_HR.feature"
        },
        glue = {"StepDefinitions"}
)

public class _TestRunnerHR extends AbstractTestNGCucumberTests {
}
