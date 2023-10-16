package StepDefinitions;

import Pages.DialogContent._00_Login_FeatureDC;
import Utilities.BD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _00_Login_Feature {
    _00_Login_FeatureDC dc = new _00_Login_FeatureDC();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        BD.getDriver().get("https://test.mersys.io/");
    }

    @When("the user enters username and password")
    public void theUserEntersUsernameAndPassword() {
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
    }

    @And("the user clicks login button")
    public void theUserClicksLoginButton() {
        dc.myClick(dc.loginButton);
    }

    @Then("the user should login successfully")
    public void theUserShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.successfullyMsg, "Techno Study");
    }
}