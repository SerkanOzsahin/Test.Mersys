package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_06_Subject_Categories.feature",
                "src/test/java/FeatureFiles/_07_School_Setup_Location.feature",
                "src/test/java/FeatureFiles/_08_Department_Configuration.feature"
        },
        glue = {"StepDefinitions"}
)

public class _TestRunnerSchool extends AbstractTestNGCucumberTests {
}
