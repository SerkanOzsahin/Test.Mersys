package StepDefinitions;

import Pages.DialogContent._01_Position_Categories_ManagementDC;
import Pages.LeftNav._01_Position_Categories_ManagementLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Position_Categories_Management {

    _01_Position_Categories_ManagementDC dc = new _01_Position_Categories_ManagementDC();
    _01_Position_Categories_ManagementLN ln = new _01_Position_Categories_ManagementLN();

    String positionNameStr = "group3";

    @When("the user navigates to position categories")
    public void theUserNavigatesToPositionCategories(DataTable links) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
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
        dc.myClick(dc.saveButton);
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
    }

    @Then("position categories should be edited successfully")
    public void positionCategoriesShouldBeEditedSuccessfully() {
    }

    @And("the user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
    }

    @Then("position categories should be deleted successfully")
    public void positionCategoriesShouldBeDeletedSuccessfully() {
    }
}
