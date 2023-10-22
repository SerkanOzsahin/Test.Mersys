package StepDefinitions;

import Pages.DialogContent._10_Editing_Grade_LevelsDC;
import Pages.LeftNav._10_Editing_Grade_LevelsLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _10_Editing_Grade_Levels {
    _10_Editing_Grade_LevelsDC dc =new _10_Editing_Grade_LevelsDC();
    _10_Editing_Grade_LevelsLN ln=new _10_Editing_Grade_LevelsLN();
    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));
    String gradeName="group3";


    @When("the user navigates to grade levels")
    public void theUserNavigatesToGradeLevels(DataTable links) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }
    @And("the user fills the document")
    public void theUserFillsTheDocument() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name, gradeName);


    }

    @Then("the grade level should be added successfully")
    public void theGradeLevelShouldBeAddedSuccessfully() {
    }

    @Then("the grade level should be edited successfully")
    public void theGradeLevelShouldBeEditedSuccessfully() {
    }

    @And("the user deletes a new grade level")
    public void theUserDeletesANewGradeLevel() {
    }

    @Then("the grade level should be deleted successfully")
    public void theGradeLevelShouldBeDeletedSuccessfully() {
    }
}
