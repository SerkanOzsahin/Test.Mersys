package StepDefinitions;

import Pages.DialogContent;

import Pages.LeftNav;

import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _08_Department_Configuration {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String departmentNameStr = "FrenchIDepartment";
    String newDepartmentNameStr = "FrenchIIDepartment";
    String codeNameStr = "f-I-r-I-e-I-n-I-c-I-h";

    @When("the user navigates to departments")
    public void the_user_navigates_to_departments(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new School Department")
    public void theUserAddsAnewSchoolDepartment() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.departmentName, departmentNameStr);
        dc.mySendKeys(dc.code, codeNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the New School Department should be added successfully")
    public void theNewSchoolDepartmentsShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user checks existing School Department's active button")
    public void theUserChecksExistingSchoolDepartmentsActiveButton() {

        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(departmentNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[4])[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.myClick(dc.activeButton);
                dc.myClick(dc.saveButton);
                break;
            }
        }
    }

    @Then("the active button should be scrolled successfuly")
    public void theActiveButtonShouldBeScrolledSuccessfuly() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing School Department")
    public void theUserEditsAnExistingSchoolDepartment() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(departmentNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[3]/div/ms-edit-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.mySendKeys(dc.departmentName, newDepartmentNameStr);
                dc.myClick(dc.saveButton);
                break;
            }
        }
    }

    @Then("the New School Department should be edited successfully")
    public void theNewSchoolDepartmentShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing School Department")
    public void theUserDeletesAnExistingSchoolDepartment() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(newDepartmentNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[3]/div/ms-delete-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();

                dc.myClick(dc.deleteDialogButton);

                break;
            }
        }

    }

    @Then("the New School Department should be deleted successfully")
    public void theNewSchoolDepartmentShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

}
