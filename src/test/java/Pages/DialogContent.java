package Pages;

import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//span[text()='Techno Study Intern School']")
    public WebElement loginSuccess;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button")
    public WebElement editButton;

    @FindBy(css = "[formcontrolname='attachmentStages']")
    public WebElement stage;

    @FindBy(css = "div[role='listbox'] > :nth-child(4)")
    public WebElement certificate;

    @FindBy(css = "[formcontrolname='description']")
    public WebElement description;

    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    public WebElement descriptionName;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement sendName;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    public WebElement newName;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    public WebElement code;

    @FindBy(css = "[formcontrolname='type']")
    public WebElement fieldtype;

    @FindBy(css = "div[role='listbox'] > :nth-child(2)")
    public WebElement test;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement shortName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    public WebElement newShortName;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[2]")
    public WebElement positionNameText;

    @FindBy(css = "div[class='mdc-form-field']")
    public WebElement activeInactiveButton;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')])[2]//input")
    public WebElement shortNameEdit;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement searchBox;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE'])[2]//input")
    public WebElement editCodeInput;

    @FindBy(xpath = "//mat-slide-toggle[contains(@formcontrolname,'active')]/*")
    public WebElement scrollChange;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    public WebElement classroom;

    @FindBy(xpath = "//span[text()=' Laboratory ']")
    public WebElement laboratory;

    @FindBy(css = "input[data-placeholder='Capacity']")
    public WebElement capacity;

    @FindBy(css = "input[data-placeholder='IBAN']")
    public WebElement iban;

    @FindBy(css = "mat-select[aria-required='true']")
    public WebElement currency;

    @FindBy(xpath = "//span[text()=' EUR ']")
    public WebElement currencyEur;

    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[1]")
    public WebElement bankCode;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveEditButton;

    @FindBy(css = "input[type='number']")
    public WebElement order;

    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;

    @FindBy(css = "input[data-placeholder='Priority']")
    public WebElement priority;

    @FindBy(css = "[data-placeholder='Description']")
    public WebElement descriptionSearch;
}
