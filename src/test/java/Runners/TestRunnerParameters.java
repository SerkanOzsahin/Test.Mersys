package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/Adding_New_Fields.feature",
                "src/test/java/FeatureFiles/Editing_Bank_Accounts.feature",
                "src/test/java/FeatureFiles/Editing_Grade_Levels.feature",
                "src/test/java/FeatureFiles/Editing_Discounts.feature",
                "src/test/java/FeatureFiles/Editing_Nationalities.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunnerParameters extends AbstractTestNGCucumberTests {
}
