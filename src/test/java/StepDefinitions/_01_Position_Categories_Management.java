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

public class _01_Position_Categories_Management {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String positionNameStr = "group3";
    String newpositionNameStr = "group3test";

    @When("the user navigates to position categories")
    public void theUserNavigatesToPositionCategories(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user clicks on the add button")
    public void theUserClicksOnTheAddButton() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, positionNameStr);
    }

    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        dc.myClick(dc.saveButton);
    }

    @Then("the position categories should be added successfully")
    public void thePositionCategoriesShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user clicks on the edit button")
    public void theUserClicksOnTheEditButton() {
        dc.mySendKeys(dc.searchBox, positionNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, newpositionNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("position categories should be edited successfully")
    public void positionCategoriesShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "updated");
    }

    @And("the user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
        dc.mySendKeys(dc.searchBox, newpositionNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("position categories should be deleted successfully")
    public void positionCategoriesShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
