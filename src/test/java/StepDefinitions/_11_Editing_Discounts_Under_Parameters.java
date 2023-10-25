package StepDefinitions;

import Pages.DialogContent;

import Pages.LeftNav;

import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _11_Editing_Discounts_Under_Parameters {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    String descriptionName = "grup3";
    String integrationCode = "gp3";
    String priority = "%5";
    String editDescriptionName = "grup3test";
    String editIntegrationCode = "gp3test";
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
        dc.mySendKeys(dc.description, descriptionName);
        dc.mySendKeys(dc.integrationCode, integrationCode);
        dc.mySendKeys(dc.priority, priority + Keys.ENTER);
        dc.myClick(dc.saveAndClose);
    }

    @Then("the discount document should be added successfully")
    public void theDiscountDocumentShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing new discount")
    public void theUserEditsAnExistingNewDiscount() {
        dc.mySendKeys(dc.searchBox, descriptionName + Keys.ENTER);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.description, editDescriptionName);
        dc.mySendKeys(dc.integrationCode, editIntegrationCode);
        dc.mySendKeys(dc.priority, editPriority + Keys.ENTER);
        dc.myClick(dc.saveAndClose);

    }

    @Then("the new discount should be edited successfully")
    public void theNewDiscountShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing new discount")
    public void theUserDeletesAnExistingNewDiscount() {
        dc.mySendKeys(dc.searchBox, editDescriptionName + Keys.ENTER);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the new discount should be deleted successfully")
    public void theNewDiscountShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
