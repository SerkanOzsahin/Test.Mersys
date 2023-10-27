package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Editing_Discounts {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String descriptionName = "group3";
    String integrationCode = "g3";
    String priority = "%5";
    String editDescriptionName = "group3edit";
    String editIntegrationCode = "g3edit";
    String editPriority = "%10";

    @When("the user navigates to setup")
    public void theUserNavigatesToSetup(DataTable dt) {
        List<String> leftNavItem = dt.asList(String.class);
        for (int i = 0; i < leftNavItem.size(); i++) {
            WebElement clickElement = ln.getWebElement(leftNavItem.get(i));
            ln.myClick(clickElement);
        }
    }

    @And("the user creates a new discount")
    public void theUserCreatesANewDiscount() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.descriptionName, descriptionName);
        dc.mySendKeys(dc.integrationCode, integrationCode);
        dc.mySendKeys(dc.priority, priority + Keys.ENTER);
        dc.myClick(dc.saveButton);
    }

    @Then("the discount document should be added successfully")
    public void theDiscountDocumentShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing new discount")
    public void theUserEditsAnExistingNewDiscount() {
        dc.mySendKeys(dc.descriptionSearch, descriptionName);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.descriptionName, editDescriptionName);
        dc.mySendKeys(dc.integrationCode, editIntegrationCode);
        dc.mySendKeys(dc.priority, editPriority + Keys.ENTER);
        dc.myClick(dc.saveButton);
    }

    @Then("the new discount should be edited successfully")
    public void theNewDiscountShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing new discount")
    public void theUserDeletesAnExistingNewDiscount() {
        dc.mySendKeys(dc.descriptionSearch, editDescriptionName);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the new discount should be deleted successfully")
    public void theNewDiscountShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
