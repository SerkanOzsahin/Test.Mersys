package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_Creating_Positions_Under_HRDC extends Parent {

    public _05_Creating_Positions_Under_HRDC() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement positionName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement shortName;

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

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[2]")
    public WebElement positionNameText;

    @FindBy(css = "div[class='mdc-form-field']")
    public WebElement activeInactiveButton;
}
