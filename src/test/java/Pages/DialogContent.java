package Pages;

import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(BD.getDriver(), this);
    }

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

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement newPositionName;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button")
    public WebElement edit;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement documentName;

    @FindBy(css = "[formcontrolname='attachmentStages']")
    public WebElement stage;

    @FindBy(css = "div[role='listbox'] > :nth-child(4)")
    public WebElement certificate;

    @FindBy(css = "[formcontrolname='description']")
    public WebElement description;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement fieldName;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement code;

    @FindBy(css = "[formcontrolname='type']")
    public WebElement fieldtype;

    @FindBy(css = "div[role='listbox'] > :nth-child(2)")
    public WebElement test;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement positionName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement shortName;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[2]")
    public WebElement positionNameText;

    @FindBy(css = "div[class='mdc-form-field']")
    public WebElement activeInactiveButton;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')])[2]//input")
    public WebElement shortNameEdit;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='mat-mdc-button-touch-target'])[12]")
    public WebElement editButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE'])[2]//input")
    public WebElement editCodeInput;

    @FindBy(xpath = "//mat-slide-toggle[contains(@formcontrolname,'active')]")
    public WebElement activeScroll;

    @FindBy(xpath = "//mat-slide-toggle[contains(@formcontrolname,'active')]/*")
    public WebElement scrollChange;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "(//mat-form-field)[4]")
    public WebElement classroom;

    @FindBy(xpath = "//span[text()=' Laboratory ']")
    public WebElement laboratory;

    @FindBy(css = "input[data-placeholder='Capacity']")
    public WebElement capacity;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMsg;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'name')]//input")
    public WebElement departmentName;

    @FindBy(xpath = "//*[@id='mat-mdc-slide-toggle-11-button']/div[2]/div/div[3]")
    public WebElement activeButton;

    @FindBy(css = "input[data-placeholder='IBAN']")
    public WebElement iban;

    @FindBy(css = "mat-select[aria-required='true']")
    public WebElement currency;

    @FindBy(xpath = "//span[text()=' EUR ']")
    public WebElement currencyEur;

    @FindBy(css = "input[data-placeholder='Integration Code']")
    public WebElement integrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement newCurrencyName;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveEditButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(css = "input[type='number']")
    public WebElement order;

    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;

    @FindBy(xpath = "//ms-integer-field[contains(@formcontrolname,'priority')]//input")
    public WebElement priority;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveAndClose;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement nationalityName;
}
