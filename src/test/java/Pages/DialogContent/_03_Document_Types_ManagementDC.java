package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_Document_Types_ManagementDC extends Parent {

    public _03_Document_Types_ManagementDC() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

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
}
