package StepDefinitions;

import Pages.DialogContent._05_Creating_Positions_Under_HRDC;
import Pages.LeftNav._05_Creating_Positions_Under_HRLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _05_Creating_Positions_Under_HR {

    _05_Creating_Positions_Under_HRDC dc = new _05_Creating_Positions_Under_HRDC();
    _05_Creating_Positions_Under_HRLN ln = new _05_Creating_Positions_Under_HRLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String positionNameStr = "group3test";
    String posNewNameStr = "group3test123";
    String shortNameStr = "g3";

    @And("the user navigates to positions")
    public void theUserNavigatesToPositions(DataTable links) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new position")
    public void theUserAddsANewPosition() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.positionName, positionNameStr);
        dc.mySendKeys(dc.shortName, shortNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the position should be added successfully")
    public void thePositionShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user updates an existing position")
    public void theUserUpdatesAnExistingPosition() {
        dc.mySendKeys(dc.nameSearch, positionNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.positionName, posNewNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the position should be edited successfully")
    public void thePositionShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes a position")
    public void theUserDeletesAPosition() {
        dc.mySendKeys(dc.nameSearch, posNewNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the position should be deleted successfully")
    public void thePositionShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user searches for a position")
    public void theUserSearchesForAPosition() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.positionName, positionNameStr);
        dc.mySendKeys(dc.shortName, shortNameStr);
        dc.myClick(dc.saveButton);
        dc.verifyContainsText(dc.successMessage, "success");
        dc.mySendKeys(dc.nameSearch, positionNameStr);
        dc.myClick(dc.searchButton);
    }

    @Then("the system should display the relevant results")
    public void theSystemShouldDisplayTheRelevantResults() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        Assert.assertEquals(dc.positionNameText.getText(), positionNameStr);
    }

    @And("the user chooses to enable or disable a position")
    public void theUserChoosesToEnableOrDisableAPosition() {
        dc.mySendKeys(dc.nameSearch, positionNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.activeInactiveButton);
    }

    @Then("the position's status should be updated accordingly")
    public void thePositionSStatusShouldBeUpdatedAccordingly() {
        dc.verifyContainsText(dc.successMessage, "success");
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
