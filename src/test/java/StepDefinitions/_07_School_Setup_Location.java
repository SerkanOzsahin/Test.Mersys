package StepDefinitions;

import Pages.DialogContent._07_School_Setup_LocationDC;
import Pages.LeftNav._07_School_Setup_LocationLN;
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

public class _07_School_Setup_Location {
    _07_School_Setup_LocationDC dc = new _07_School_Setup_LocationDC();
    _07_School_Setup_LocationLN ln = new _07_School_Setup_LocationLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));
    String name1 = "Team3";
    String shortName1 = "Tm3";
    String capasity1 = "123";
    String newName1 = "Team3 Başarısı";

    @When("the user navigates to school setup location")
    public void theUserNavigatesToSchoolSetupLocation(DataTable links) {

        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user click on the add button")
    public void theUserClickOnTheAddButton() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name, name1);
        dc.mySendKeys(dc.shortName, shortName1);
        dc.myClick(dc.classroom);
        dc.mySendKeys(dc.capacity, capasity1);

    }

    @And("the user click on the save button")
    public void theUserClickOnTheSaveButton() {
        dc.myClick(dc.saveButton);
    }

    @Then("the location should be add successfully")
    public void theLocationShouldBeAddSuccessfully() {

    }

    @And("the user click on the edit button")
    public void theUserClickOnTheEditButton() {


    }

    @Then("the location should be edit successfully")
    public void theLocationShouldBeEditSuccessfully() {

    }

    @And("the user click on the delete button")
    public void theUserClickOnTheDeleteButton() {


    }

    @Then("the location should be delete successfully")
    public void theLocationShouldBeDeleteSuccessfully() {

    }
}
