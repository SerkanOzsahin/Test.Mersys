package StepDefinitions;

import Pages.DialogContent._01_Position_Categories_ManagementDC;
import Pages.LeftNav._01_Position_Categories_ManagementLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _01_Position_Categories_Management {

    _01_Position_Categories_ManagementDC dc = new _01_Position_Categories_ManagementDC();
    _01_Position_Categories_ManagementLN ln = new _01_Position_Categories_ManagementLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

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
        dc.mySendKeys(dc.newPositionName, positionNameStr);
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
        dc.mySendKeys(dc.nameSearch, positionNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.newPositionName, newpositionNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("position categories should be edited successfully")
    public void positionCategoriesShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "updated");
    }

    @And("the user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
        dc.mySendKeys(dc.nameSearch, newpositionNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageBtn);
        dc.myClick(dc.deleteDialogBtn);
    }

    @Then("position categories should be deleted successfully")
    public void positionCategoriesShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
