package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06_Configuring_Training_Subject_CategoriesDC extends Parent {
    public _06_Configuring_Training_Subject_CategoriesDC() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement userName;
    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'name')]//input")
    public WebElement shortName;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(css = "[data-placeholder='Name']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='mat-mdc-button-touch-target'])[12]")
    public WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath = "//mat-slide-toggle[contains(@formcontrolname,'active')]")
    public WebElement activeScroll;
    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "addButton": return addButton;
            case "shortName": return shortName;
            case "saveButton": return saveButton;
            case "searchBox": return searchBox;
            case "editButton": return editButton;
            case "deleteImageButton": return deleteImageButton;
            case "deleteButton": return deleteButton;


        }

        return null;
    }

}

