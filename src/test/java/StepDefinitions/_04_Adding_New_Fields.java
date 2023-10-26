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

public class _04_Adding_New_Fields {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String fieldNameStr = "group3";
    String newFieldNameStr = "group3edit";
    String codeNameStr = "g3";

    @When("the user navigates to field")
    public void the_user_navigates_to_field(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new field")
    public void theUserAddsANewField() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, fieldNameStr);
        dc.mySendKeys(dc.code, codeNameStr);
        dc.myClick(dc.fieldtype);
        dc.myClick(dc.test);
        dc.myClick(dc.saveButton);
    }

    @Then("the new field should be added successfully")
    public void theNewFieldShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing field")
    public void theUserEditsAnExistingField() {
        dc.mySendKeys(dc.searchBox, fieldNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.elementToBe));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, newFieldNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the field should be edited successfully")
    public void theFieldShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing field")
    public void theUserDeletesAnExistingField() {
        dc.mySendKeys(dc.searchBox, newFieldNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.elementToBe));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the field should be deleted successfully")
    public void theFieldShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
