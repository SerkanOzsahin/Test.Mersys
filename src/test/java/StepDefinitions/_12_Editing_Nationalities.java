package StepDefinitions;

import Pages.DialogContent._12_Editing_NationalitiesDC;
import Pages.LeftNav._12_Editing_NationalitiesLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _12_Editing_Nationalities {

    _12_Editing_NationalitiesDC dc = new _12_Editing_NationalitiesDC();
    _12_Editing_NationalitiesLN ln = new _12_Editing_NationalitiesLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String natNameStr = "group3test";
    String newNatNameStr = "group3test123";

    @When("the user navigates to nationalities")
    public void theUserNavigatesToNationalities(DataTable links) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a nationality")
    public void theUserAddsANationality() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nationalityName, natNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the nationality should be added successfully")
    public void theNationalityShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits the nationality")
    public void theUserEditsTheNationality() {
        dc.mySendKeys(dc.nameSearch, natNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.positionName, newNatNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the nationality should be edited successfully")
    public void theNationalityShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user uses the search function to find a nationality")
    public void theUserUsesTheSearchFunctionToFindANationality() {
        dc.mySendKeys(dc.nameSearch, newNatNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
    }

    @Then("the matching nationalities should be displayed successfully")
    public void theMatchingNationalitiesShouldBeDisplayedSuccessfully() {
        Assert.assertEquals(dc.positionNameText.getText(), newNatNameStr);
    }

    @And("the user deletes a nationality")
    public void theUserDeletesANationality() {
        dc.mySendKeys(dc.nameSearch, newNatNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the nationality should be deleted successfully")
    public void theNationalityShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
