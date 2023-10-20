package StepDefinitions;

import Pages.DialogContent._04_Adding_New_FieldsDC;
import Pages.DialogContent._08_Department_ConfigurationDC;
import Pages.LeftNav._04_Adding_New_FieldsLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _08_Department_Configuration {
    _08_Department_ConfigurationDC dc = new _08_Department_ConfigurationDC();
    _08_Department_ConfigurationDC ln = new _08_Department_ConfigurationDC();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String departmentNameStr = "FrenchIDepartment";
    String newDepartmentNameStr = "FrenchIIDepartment";
    String codeNameStr = "f-I-r-I-e-I-n-I-c-I-h";

    @When("the user navigates to departments")
    public void the_user_navigates_to_departments(DataTable links) {
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

}
