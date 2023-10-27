package StepDefinitions;

import Pages.DialogContent;
import Utilities.BD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class Login {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        BD.getDriver().get("https://test.mersys.io/");
    }

    @When("the user enters username and password")
    public void theUserEntersUsernameAndPassword() throws IOException {
        String path = "src/test/java/ApachePOI/TSLoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        String username = sheet.getRow(0).getCell(0).toString();
        String password = sheet.getRow(1).getCell(0).toString();
        dc.mySendKeys(dc.username, username);
        dc.mySendKeys(dc.password, password);
        inputStream.close();
    }

    @And("the user clicks login button")
    public void theUserClicksLoginButton() {
        dc.myClick(dc.loginButton);
    }

    @Then("the user should login successfully")
    public void theUserShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.loginSuccess, "Techno Study");
    }
}
