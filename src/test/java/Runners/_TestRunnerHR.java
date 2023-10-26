package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "_01_Position_Categories_Management.feature",
                "_02_Attestations_Management.feature",
                "_05_Creating_Positions_Under_HR.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _TestRunnerHR extends AbstractTestNGCucumberTests {
}
