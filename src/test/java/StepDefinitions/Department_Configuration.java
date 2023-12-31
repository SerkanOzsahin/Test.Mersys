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

public class Department_Configuration {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String departmentNameStr = "group3";
    String newDepartmentNameStr = "group3edit";
    String codeNameStr = "g3";

    @When("the user navigates to departments")
    public void the_user_navigates_to_departments(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new school department")
    public void theUserAddsAnewSchoolDepartment() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.newName, departmentNameStr);
        dc.mySendKeys(dc.code, codeNameStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the new school department should be added successfully")
    public void theNewSchoolDepartmentsShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits an existing school department")
    public void theUserEditsAnExistingSchoolDepartment() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));
        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(departmentNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[3]/div/ms-edit-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.mySendKeys(dc.newName, newDepartmentNameStr);
                dc.myClick(dc.saveButton);
                break;
            }
        }
    }

    @Then("the new school department should be edited successfully")
    public void theNewSchoolDepartmentShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing school department")
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

    @Then("the new school department should be deleted successfully")
    public void theNewSchoolDepartmentShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
