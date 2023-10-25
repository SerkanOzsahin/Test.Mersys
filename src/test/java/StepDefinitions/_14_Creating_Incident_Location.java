package StepDefinitions;

import Pages.DialogContent._14_Creating_Incident_LocationDC;
import Pages.LeftNav._14_Creating_Incident_LocationLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;


import java.util.List;

public class _14_Creating_Incident_Location {
    _14_Creating_Incident_LocationLN ln = new _14_Creating_Incident_LocationLN();
    _14_Creating_Incident_LocationDC dc = new _14_Creating_Incident_LocationDC();

    String name = "testgrup3";
    String editName = "testgrup3edit";


    @When("the user navigates to incidents")
    public void theUserNavigatesToIncidents(DataTable dt) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        List<String> leftNavItem = dt.asList(String.class);
        for (int i = 0; i < leftNavItem.size(); i++) {
            WebElement clickElement = ln.getWebElement(leftNavItem.get(i));
            ln.myClick(clickElement);
        }
    }

    @And("the user creates a new incidents location")
    public void theUserCreatesANewIncidentsLocation() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name, name);
        dc.myClick(dc.saveButton);
    }

    @Then("the incidents location should be added successfully")
    public void theIncidentLocationShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing incidents location")
    public void theUserEditsAnExistingIncidentsLocation() {
        dc.mySendKeys(dc.searchBox, name);
        dc.staleElement(dc.editButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.name, editName);
        dc.myClick(dc.saveButton);
    }

    @Then("the incidents location should be edited successfully")
    public void theIncidentsLocationShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "updated");
    }

    @And("the user deletes an existing incidents location")
    public void theUserDeletesAnExistingIncidentsLocation() {
        dc.mySendKeys(dc.searchBox, editName);
        dc.staleElement(dc.deleteImageButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteButton);
    }

    @Then("the incidents location should be deleted successfully")
    public void theIncidentsLocationShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "deleted");
    }
}
