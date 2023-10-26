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

public class _02_Attestations_Management {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String name = "group3";
    String editName = "group3edit";

    @When("the user navigates to human resources")
    public void theUserNavigatesToHumanResources(DataTable dt) {
        List<String> leftNavItem = dt.asList(String.class);
        for (int i = 0; i < leftNavItem.size(); i++) {
            WebElement clickElement = ln.getWebElement(leftNavItem.get(i));
            ln.myClick(clickElement);
        }
    }

    @And("the user creates an attestations")
    public void theUserCreatesAnAttestations() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, name);
        dc.myClick(dc.saveButton);
    }

    @Then("the attestations document should be added successfully")
    public void theAttestationsDocumentShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "successfully");
    }

    @And("the user edits an existing attestations document")
    public void theUserEditsAnExistingAttestationsDocument() {
        dc.mySendKeys(dc.searchBox, name);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.shortNameEdit, editName);
        dc.myClick(dc.saveButton);
    }

    @Then("the attestations document should be edited successfully")
    public void theAttestationsDocumentShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "successfully");
    }

    @And("the user deletes an existing attestations document")
    public void theUserDeletesAnExistingAttestationsDocument() {
        dc.mySendKeys(dc.searchBox, editName);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the attestations document should be deleted successfully")
    public void theAttestationsDocumentShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "successfully");
    }
}
