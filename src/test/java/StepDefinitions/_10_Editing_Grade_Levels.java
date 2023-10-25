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

public class _10_Editing_Grade_Levels {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String gradeNameStr = "group3";
    String shortNameStr = "group";
    String orderStr = "1";
    String maxApplicationCountStr = "1";
    String newGradeNameStr = "group33";

    @When("the user navigates to grade levels")
    public void theUserNavigatesToGradeLevels(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new grade level")
    public void theUserAddsANewGradeLevel() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.newName, gradeNameStr);
        dc.mySendKeys(dc.newShortName, shortNameStr);
        dc.mySendKeys(dc.order, orderStr);
        dc.mySendKeys(dc.maxApplicationCount, maxApplicationCountStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the grade level should be added successfully")
    public void theGradeLevelShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits a grade level")
    public void theUserEditsAGradeLevel() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));
        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(gradeNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-edit-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.mySendKeys(dc.newName, newGradeNameStr);
                dc.myClick(dc.saveButton);
                break;
            }
        }
    }

    @Then("the grade level should be edited successfully")
    public void theGradeLevelShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes a grade level")
    public void theUserDeletesAGradeLevel() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));
        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(newGradeNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-delete-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.myClick(dc.deleteDialogButton);
                break;
            }
        }
    }

    @Then("the grade level should be deleted successfully")
    public void theGradeLevelShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
