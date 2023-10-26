package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _09_Editing_Bank_Accounts {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String bankAccountNameStr = "group3";
    String ibanStr = "01234";
    String integrationCodeStr = "1";
    String newCurrencyNameStr = "group3edit";

    @When("the user navigates to bank accounts")
    public void theUserNavigatesToBankAccounts(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user adds a bank account")
    public void theUserAddsABankAccount() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.sendName, bankAccountNameStr);
        dc.mySendKeys(dc.iban, ibanStr);
        dc.myClick(dc.currency);
        dc.myClick(dc.currencyEur);
        dc.mySendKeys(dc.bankCode, integrationCodeStr);
        dc.myClick(dc.saveButton);
    }

    @Then("the bank account should be added successfully")
    public void theBankAccountShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user edits a bank account")
    public void theUserEditsABankAccount() {
        dc.mySendKeys(dc.searchBox, bankAccountNameStr);
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.sendName, newCurrencyNameStr);
        dc.myClick(dc.saveEditButton);
    }

    @Then("the bank account should be edited successfully")
    public void theBankAccountShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("the user deletes a bank account")
    public void theUserDeletesABankAccount() {
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("the bank account should be deleted successfully")
    public void theBankAccountShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }
}
