package StepDefinitions;

import Pages.DialogContent._02_Attestations_ManagementDC;
import Pages.LeftNav._02_Attestations_ManagementLN;
import Pages.Parent;
import Utilities.BD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Attestations_Management {
    _02_Attestations_ManagementDC dc = new _02_Attestations_ManagementDC();
   _02_Attestations_ManagementLN ln=new _02_Attestations_ManagementLN();

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
        dc.mySendKeys(dc.name,"testgrup3");
        dc.myClick(dc.saveButton);

    }

    @And("success message  should be added successfully")
    public void successMessageShouldBeAddedSuccessfully() {
    dc.verifyContainsText(dc.successMessage,"successfully");
    }


    @When("the user edits an existing attestations document")
    public void theUserEditsAnExistingAttestationsDocument() {
    }

    @Then("the attestations document should edited successfully")
    public void theAttestationsDocumentShouldEditedSuccessfully() {
    }

    @When("the user deletes an existing attestations document")
    public void theUserDeletesAnExistingAttestationsDocument() {
    }

    @Then("the attestations document should deleted successfully")
    public void theAttestationsDocumentShouldDeletedSuccessfully() {
    }
}
