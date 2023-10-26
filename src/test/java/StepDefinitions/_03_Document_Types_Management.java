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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _03_Document_Types_Management {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String docNameStr = "group3";
    String docNewNameStr = "group3edit";
    String descNameStr = "group3project";

    @When("the user navigates to document types")
    public void theUserNavigatesToDocumentTypes(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new document type")
    public void theUserAddsANewDocumentType() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, docNameStr);
        dc.myClick(dc.stage);
        dc.myClick(dc.certificate);
        new Actions(BD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.mySendKeys(dc.description, descNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the document type should be added successfully")
    public void theDocumentTypeShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing document type")
    public void theUserEditsAnExistingDocumentType() {
        dc.mySendKeys(dc.searchBox, docNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.elementToBe));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, docNewNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the document type should be edited successfully")
    public void theDocumentTypeShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing document type")
    public void theUserDeletesAnExistingDocumentType() {
        dc.mySendKeys(dc.searchBox, docNewNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.elementToBe));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the document type should be deleted successfully")
    public void theDocumentTypeShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
