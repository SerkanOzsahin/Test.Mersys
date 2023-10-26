package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_04_Adding_New_Fields.feature",
                "src/test/java/FeatureFiles/_09_Editing_Bank_Accounts.feature",
                "src/test/java/FeatureFiles/_10_Editing_Grade_Levels.feature",
                "src/test/java/FeatureFiles/_11_Editing_Discounts.feature",
                "src/test/java/FeatureFiles/_12_Editing_Nationalities.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _TestRunnerParameters extends AbstractTestNGCucumberTests {
}
