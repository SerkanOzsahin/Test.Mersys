package StepDefinitions;

import Pages.DialogContent._06_Configuring_Training_Subject_CategoriesDC;
import Pages.LeftNav._06_Configuring_Training_Subject_CategoriesLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _06_Configuring_Training_Subject_Categories {
    _06_Configuring_Training_Subject_CategoriesLN ln = new _06_Configuring_Training_Subject_CategoriesLN();
    _06_Configuring_Training_Subject_CategoriesDC dc = new _06_Configuring_Training_Subject_CategoriesDC();

    @When("the user navigates to education")
    public void theUserNavigatesToEducation(DataTable dt) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        List<String> leftNavItem = dt.asList(String.class);
        for (int i = 0; i < leftNavItem.size(); i++) {
            WebElement clickElement = ln.getWebElement(leftNavItem.get(i));
            ln.myClick(clickElement);
        }
    }
    @Then("the user creates a subject categories")
    public void theUserCreatesASubjectCategories() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.shortName, "testgrup3");
        dc.mySendKeys(dc.codeInput, "GRP3");
        dc.myClick(dc.saveButton);
    }
    @And("the subject categories document should be added successfully")
    public void theSubjectCategoriesDocumentShouldBeAddedSuccessfully() {
        Assert.assertTrue(dc.activeScroll.isDisplayed());
        dc.verifyContainsText(dc.successMessage, "success");
    }
    @Then("the user edits an existing subject categories")
    public void theUserEditsAnExistingSubjectCategories() {
        dc.mySendKeys(dc.searchBox,"testgrup3"+ Keys.ENTER);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.shortName, "testgrup3edit");
        dc.mySendKeys(dc.codeInput,"GRP3Test");
        dc.myClick(dc.saveButton);
    }
    @And("the subject categories should be edited successfully")
    public void theSubjectCategoriesShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
    @Then("the user deletes an existing subject categories")
    public void theUserDeletesAnExistingSubjectCategories() {
        dc.mySendKeys(dc.searchBox,"testgrup3edit"+ Keys.ENTER);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteButton);
    }
    @And("the subject categories should be deleted successfully")
    public void theSubjectCategoriesShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
