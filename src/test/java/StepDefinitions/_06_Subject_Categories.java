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
import org.testng.Assert;

import java.util.List;

public class _06_Subject_Categories {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String name = "group3";
    String code = "g3";
    String editName = "group3edit";
    String editCode = "g3edit";

    @When("the user navigates to education")
    public void theUserNavigatesToEducation(DataTable dt) {
        List<String> leftNavItem = dt.asList(String.class);
        for (int i = 0; i < leftNavItem.size(); i++) {
            WebElement clickElement = ln.getWebElement(leftNavItem.get(i));
            ln.myClick(clickElement);
        }
    }

    @And("the user creates a subject categories")
    public void theUserCreatesASubjectCategories() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, name);
        dc.mySendKeys(dc.codeInput, code);
        dc.myClick(dc.saveButton);
    }

    @Then("the subject categories document should be added successfully")
    public void theSubjectCategoriesDocumentShouldBeAddedSuccessfully() {
        Assert.assertTrue(dc.scrollChange.isDisplayed());
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing subject categories")
    public void theUserEditsAnExistingSubjectCategories() {
        dc.mySendKeys(dc.searchBox, name);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.shortNameEdit, editName);
        dc.mySendKeys(dc.editCodeInput, editCode);
        dc.myClick(dc.saveButton);
    }

    @Then("the subject categories should be edited successfully")
    public void theSubjectCategoriesShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing subject categories")
    public void theUserDeletesAnExistingSubjectCategories() {
        dc.mySendKeys(dc.searchBox, editName);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the subject categories should be deleted successfully")
    public void theSubjectCategoriesShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
