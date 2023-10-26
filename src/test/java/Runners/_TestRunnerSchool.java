package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "_06_Subject_Categories.feature",
                "_07_School_Setup_Location.feature",
                "_08_Department_Configuration.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _TestRunnerSchool extends AbstractTestNGCucumberTests {
}
