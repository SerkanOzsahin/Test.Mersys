package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "_04_Adding_New_Fields.feature",
                "_09_Editing_Bank_Accounts.feature",
                "_10_Editing_Grade_Levels.feature",
                "_11_Editing_Discounts.feature",
                "_12_Editing_Nationalities.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _TestRunnerParameters extends AbstractTestNGCucumberTests {
}
