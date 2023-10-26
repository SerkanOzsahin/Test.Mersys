package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _12_Editing_Nationalities {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String natNameStr = "group3";
    String newNatNameStr = "group3edit";

    @When("the user navigates to nationalities")
    public void theUserNavigatesToNationalities(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a nationality")
    public void theUserAddsANationality() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, natNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the nationality should be added successfully")
    public void theNationalityShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits the nationality")
    public void theUserEditsTheNationality() {
        dc.mySendKeys(dc.searchBox, natNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, newNatNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the nationality should be edited successfully")
    public void theNationalityShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user uses the search function to find a nationality")
    public void theUserUsesTheSearchFunctionToFindANationality() {
        dc.mySendKeys(dc.searchBox, newNatNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
    }

    @Then("the matching nationalities should be displayed successfully")
    public void theMatchingNationalitiesShouldBeDisplayedSuccessfully() {
        Assert.assertEquals(dc.positionNameText.getText(), newNatNameStr);
    }

    @And("the user deletes a nationality")
    public void theUserDeletesANationality() {
        dc.mySendKeys(dc.searchBox, newNatNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the nationality should be deleted successfully")
    public void theNationalityShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
