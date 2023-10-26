package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _14_Creating_Incident_Location {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String name = "group3";
    String editName = "group3edit";

    @When("the user navigates to incidents")
    public void theUserNavigatesToIncidents(DataTable dt) {
        List<String> leftNavItem = dt.asList(String.class);
        for (int i = 0; i < leftNavItem.size(); i++) {
            WebElement clickElement = ln.getWebElement(leftNavItem.get(i));
            ln.myClick(clickElement);
        }
    }

    @And("the user creates a new incidents location")
    public void theUserCreatesANewIncidentsLocation() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, name);
        dc.myClick(dc.saveButton);
    }

    @Then("the incidents location should be added successfully")
    public void theIncidentLocationShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing incidents location")
    public void theUserEditsAnExistingIncidentsLocation() {
        dc.mySendKeys(dc.searchBox, name);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, editName);
        dc.myClick(dc.saveButton);
    }

    @Then("the incidents location should be edited successfully")
    public void theIncidentsLocationShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "updated");
    }

    @And("the user deletes an existing incidents location")
    public void theUserDeletesAnExistingIncidentsLocation() {
        dc.mySendKeys(dc.searchBox, editName);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the incidents location should be deleted successfully")
    public void theIncidentsLocationShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "deleted");
    }
}
