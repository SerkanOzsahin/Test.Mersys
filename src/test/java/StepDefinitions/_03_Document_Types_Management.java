package StepDefinitions;

import Pages.DialogContent._03_Document_Types_ManagementDC;
import Pages.LeftNav._03_Document_Types_ManagementLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _03_Document_Types_Management {

    _03_Document_Types_ManagementDC dc = new _03_Document_Types_ManagementDC();
    _03_Document_Types_ManagementLN ln = new _03_Document_Types_ManagementLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String docNameStr = "group3test";
    String docNewNameStr = "group3test123";
    String descNameStr = "group3testforproject";

    @And("the user clicks on the elements in LeftNav")
    public void theUserClicksOnTheElementsInLeftNav(DataTable links) {
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

    @And("the user adds a new document type")
    public void theUserAddsANewDocumentType() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.documentName, docNameStr);
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
        dc.mySendKeys(dc.nameSearch, docNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.documentName, docNewNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the document type should be edited successfully")
    public void theDocumentTypeShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing document type")
    public void theUserDeletesAnExistingDocumentType() {
        dc.mySendKeys(dc.nameSearch, docNewNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the document type should be deleted successfully")
    public void theDocumentTypeShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
