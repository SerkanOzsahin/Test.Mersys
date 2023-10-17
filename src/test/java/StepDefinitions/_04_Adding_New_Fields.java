package StepDefinitions;

import Pages.DialogContent._04_Adding_New_FieldsDC;
import Pages.LeftNav._04_Adding_New_FieldsLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _04_Adding_New_Fields {
    _04_Adding_New_FieldsDC dc=new _04_Adding_New_FieldsDC();
    _04_Adding_New_FieldsLN ln=new _04_Adding_New_FieldsLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String fieldNameStr = "team3test";
    String newFieldNameStr = "team3test123";
    String codeNameStr = "team3testforproject";
    @When("the user navigates to field")
    public void the_user_navigates_to_field(DataTable links) {
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
    @And("the user adds a new field")
    public void theUserAddsANewField() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.fieldName, fieldNameStr);
        dc.myClick(dc.code);
        new Actions(BD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.mySendKeys(dc.code, codeNameStr);
        dc.myClick(dc.test);
        dc.myClick(dc.saveButton);
    }

    @Then("the new field should be added succesfully")
    public void theNewFieldShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }
    @And("the user edits an existing field")
    public void theUserEditsAnExistingField() {
        dc.mySendKeys(dc.nameSearch, fieldNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.fieldName, newFieldNameStr);
        dc.myClick(dc.saveButton);
    }
    @Then("the field should be edited succesfully")
    public void theFieldShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes an existing field")
    public void theUserDeletesAnExistingField() {
        dc.mySendKeys(dc.nameSearch, newFieldNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the field shold be deleted succesfully")
    public void theFieldShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

}





