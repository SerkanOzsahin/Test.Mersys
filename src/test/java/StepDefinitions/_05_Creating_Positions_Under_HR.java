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

public class _05_Creating_Positions_Under_HR {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String positionNameStr = "group3test";
    String posNewNameStr = "group3test123";
    String shortNameStr = "g3";

    @When("the user navigates to positions")
    public void theUserNavigatesToPositions(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new position")
    public void theUserAddsANewPosition() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, positionNameStr);
        dc.mySendKeys(dc.shortName, shortNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the position should be added successfully")
    public void thePositionShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user updates an existing position")
    public void theUserUpdatesAnExistingPosition() {
        dc.mySendKeys(dc.searchBox, positionNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, posNewNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the position should be edited successfully")
    public void thePositionShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user searches for a position")
    public void theUserSearchesForAPosition() {
        dc.mySendKeys(dc.searchBox, posNewNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
    }

    @Then("the system should display the results")
    public void theSystemShouldDisplayTheResults() {
        Assert.assertEquals(dc.positionNameText.getText(), posNewNameStr);
    }

    @And("the user chooses to enable or disable a position")
    public void theUserChoosesToEnableOrDisableAPosition() {
        dc.mySendKeys(dc.searchBox, posNewNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.activeInactiveButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
    }

    @Then("the position's status should be updated")
    public void thePositionSStatusShouldBeUpdated() {
        dc.verifyContainsText(dc.successMessage, "updated");
    }

    @And("the user deletes a position")
    public void theUserDeletesAPosition() {
        dc.mySendKeys(dc.searchBox, posNewNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the position should be deleted successfully")
    public void thePositionShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
