package StepDefinitions;

import Pages.DialogContent._09_Editing_Bank_AccountsDC;
import Pages.LeftNav._09_Editing_Bank_AccountsLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _09_Editing_Bank_Accounts {

    _09_Editing_Bank_AccountsDC dc = new _09_Editing_Bank_AccountsDC();
    _09_Editing_Bank_AccountsLN ln = new _09_Editing_Bank_AccountsLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    String bankAccountNameStr = "group3";
    String ibanStr = "01234";
    String integrationCodeStr = "1";
    String newCurrencyNameStr = "group3test";

    @When("the user navigates to bank accounts")
    public void theUserNavigatesToBankAccounts(DataTable links) {
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

    @And("the user adds a bank account")
    public void theUserAddsABankAccount() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name, bankAccountNameStr);
        dc.mySendKeys(dc.iban, ibanStr);
        dc.myClick(dc.currency);
        dc.myClick(dc.currencyEur);
        dc.mySendKeys(dc.integrationCode, integrationCodeStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the bank accounts should be added successfully")
    public void theBankAccountsShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits a bank account")
    public void theUserEditsABankAccount() {
        dc.mySendKeys(dc.nameSearch, bankAccountNameStr);
        dc.myClick(dc.searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.newCurrencyName, newCurrencyNameStr);
        dc.myClick(dc.saveEditButton);
    }

    @Then("the bank accounts should be edited successfully")
    public void theBankAccountsShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @Then("the user deletes a bank account")
    public void theUserDeletesABankAccount() {
        dc.myClick(dc.deleteImageBtn);
        dc.myClick(dc.deleteDialogBtn);
    }

    @Then("the bank accounts should be deleted successfully")
    public void theBankAccountsShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
