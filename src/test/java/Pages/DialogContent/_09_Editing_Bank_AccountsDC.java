package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _09_Editing_Bank_AccountsDC extends Parent {

    public _09_Editing_Bank_AccountsDC() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(css = "input[id='ms-text-field-1']")
    public WebElement name;

    @FindBy(css = "input[data-placeholder='IBAN']")
    public WebElement iban;

    @FindBy(css = "mat-select[aria-required='true']")
    public WebElement currency;

    @FindBy(xpath = "//span[text()=' EUR ']")
    public WebElement currencyEur;

    @FindBy(css = "input[data-placeholder='Integration Code']")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button")
    public WebElement edit;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement newCurrencyName;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveEditButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
}
