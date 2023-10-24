package StepDefinitions;

import Pages.DialogContent._09_Editing_Bank_AccountsDC;
import Pages.LeftNav._09_Editing_Bank_AccountsLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_Editing_Bank_Accounts {
    _09_Editing_Bank_AccountsDC dc=new _09_Editing_Bank_AccountsDC();
    _09_Editing_Bank_AccountsLN ln=new _09_Editing_Bank_AccountsLN();

    String bankAccountNameStr="group3";
    String ibanStr="01234";
    String integrationCodeStr="1";


    @When("the user navigates to bank accounts")
    public void theUserNavigatesToBankAccounts(DataTable links) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "turkeyts");
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
        dc.mySendKeys(dc.name,bankAccountNameStr);
        dc.mySendKeys(dc.iban,ibanStr);
        dc.myClick(dc.currency);
        dc.myClick(dc.currencyEur);
        dc.mySendKeys(dc.integrationCode, integrationCodeStr);
        dc.myClick(dc.saveButton);


    }

    @Then("the bank accounts should be added successfully")
    public void theBankAccountsShouldBeAddedSuccessfully() {
    }

    @And("the user edits a bank account")
    public void theUserEditsABankAccount() {
    }

    @Then("the bank accounts should be edited successfully")
    public void theBankAccountsShouldBeEditedSuccessfully() {
    }

    @Then("the user deletes a bank account")
    public void theUserDeletesABankAccount() {
    }

    @Then("the bank accounts should be deleted successfully")
    public void theBankAccountsShouldBeDeletedSuccessfully() {
    }
}
