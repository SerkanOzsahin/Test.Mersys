package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class School_Setup_Location {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String name = "group3";
    String shortName = "g3";
    String capacity = "123";
    String newName = "group3edit";

    @When("the user navigates to school setup location")
    public void theUserNavigatesToSchoolSetupLocation(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a new school location")
    public void theUserAddsANewSchoolLocation() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.newName, name);
        dc.mySendKeys(dc.newShortName, shortName);
        dc.myClick(dc.classroom);
        dc.myClick(dc.laboratory);
        dc.mySendKeys(dc.capacity, capacity + Keys.ENTER);
        dc.myClick(dc.saveButton);
    }

    @Then("the location should be add successfully")
    public void theLocationShouldBeAddSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits school location")
    public void theUserEditsSchoolLocation() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));
        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(name)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-edit-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.mySendKeys(dc.newName, newName);
                dc.myClick(dc.saveButton);
                break;
            }
        }
    }

    @Then("the location should be edit successfully")
    public void theLocationShouldBeEditSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes school location")
    public void theUserDeletesSchoolLocation() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));
        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(newName)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-delete-button)[" + i + "]";
                WebElement gEdit = BD.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                dc.myClick(dc.deleteDialogButton);
                break;
            }
        }
    }

    @Then("the location should be delete successfully")
    public void theLocationShouldBeDeleteSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
