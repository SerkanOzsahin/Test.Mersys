package StepDefinitions;

import Pages.DialogContent._06_Configuring_Training_Subject_CategoriesDC;
import Pages.LeftNav._06_Configuring_Training_Subject_CategoriesLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
public class _06_Configuring_Training_Subject_Categories {
    _06_Configuring_Training_Subject_CategoriesLN ln = new _06_Configuring_Training_Subject_CategoriesLN();
    _06_Configuring_Training_Subject_CategoriesDC dc = new _06_Configuring_Training_Subject_CategoriesDC();
    String name="testgrup3";
    String code="GRP3";
    String editName="testgrup3edit";
    String editCode="GRP3Test";
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
    @And("the user creates a subject categories")
    public void theUserCreatesASubjectCategories() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.shortName,name);
        dc.mySendKeys(dc.codeInput,code);
        dc.myClick(dc.saveButton);
    }
    @Then("the subject categories document should be added successfully")
    public void theSubjectCategoriesDocumentShouldBeAddedSuccessfully() {
        Assert.assertTrue(dc.activeScroll.isDisplayed());
        dc.verifyContainsText(dc.successMessage, "success");
    }
    @And("the user edits an existing subject categories")
    public void theUserEditsAnExistingSubjectCategories() {
        dc.mySendKeys(dc.searchBox,name+ Keys.ENTER);
        dc.staleElement(dc.editButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.shortNameEdit,editName);
        dc.mySendKeys(dc.editCodeInput,editCode);
        dc.myClick(dc.saveButton);
    }
    @Then("the subject categories should be edited successfully")
    public void theSubjectCategoriesShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
    @And("the user deletes an existing subject categories")
    public void theUserDeletesAnExistingSubjectCategories() {
        dc.mySendKeys(dc.searchBox,editName+ Keys.ENTER);
        dc.staleElement(dc.deleteImageButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteButton);
    }
    @Then("the subject categories should be deleted successfully")
    public void theSubjectCategoriesShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
    @And("the user creates a subject categories with disable scroll")
    public void theUserCreatesASubjectCategoriesWithDisableScroll() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.shortName,editName);
        dc.mySendKeys(dc.codeInput,editCode);
        dc.myClick(dc.scrollChange);
        dc.myClick(dc.saveButton);
    }
}
