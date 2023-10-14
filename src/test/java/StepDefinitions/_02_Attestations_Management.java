package StepDefinitions;

import Pages.DialogContent._02_Attestations_ManagementDC;
import Pages.LeftNav._02_Attestations_ManagementLN;
import Pages.Parent;
import Utilities.BD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_Attestations_Management {
    _02_Attestations_ManagementDC dc = new _02_Attestations_ManagementDC();
    _02_Attestations_ManagementLN ln = new _02_Attestations_ManagementLN();

    @When("navigate to human resources")
    public void navigateToHumanResources() {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        ln.myClick(ln.humanResources);
        ln.myClick(ln.humanResourcesSetup);
        ln.myClick(ln.humanResourcesAttestations);


    }

    @Then("create a attestations")
    public void createAAttestations() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name, "testgrup3");
        dc.myClick(dc.saveButton);

    }

    @And("the attestations document should be added successfully")
    public void theAttestationsDocumentShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "successfully");
    }


    @When("the user edits an existing attestations document")
    public void theUserEditsAnExistingAttestationsDocument() {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        ln.myClick(ln.humanResources);
        ln.myClick(ln.humanResourcesSetup);
        ln.myClick(ln.humanResourcesAttestations);

        dc.mySendKeys(dc.searchBox,"testgrup3"+ Keys.ENTER);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.name, "testgrup3edit");
        dc.myClick(dc.saveButton);
    }

    @Then("the attestations document should edited successfully")
    public void theAttestationsDocumentShouldEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "successfully");

    }

    @When("the user deletes an existing attestations document")
    public void theUserDeletesAnExistingAttestationsDocument() {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        ln.myClick(ln.humanResources);
        ln.myClick(ln.humanResourcesSetup);
        ln.myClick(ln.humanResourcesAttestations);

        dc.mySendKeys(dc.searchBox,"testgrup3edit"+ Keys.ENTER);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        dc.myClick(dc.delete);
        dc.myClick(dc.deleteButton);
    }

    @Then("the attestations document should deleted successfully")
    public void theAttestationsDocumentShouldDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "successfully");

    }
}
