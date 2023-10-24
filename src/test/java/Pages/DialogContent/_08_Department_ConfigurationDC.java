package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _08_Department_ConfigurationDC extends Parent {
    public _08_Department_ConfigurationDC() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'name')]//input")
    public WebElement departmentName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement code;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "//*[@id=\"mat-mdc-slide-toggle-11-button\"]/div[2]/div/div[3]")
    public WebElement activeButton;



    public WebElement getWebElement(String s) {
        switch (s) {
            case "addButton": return addButton;
            case "departmentName": return departmentName;
            case "saveButton": return saveButton;
            case "deleteDialogButton": return deleteDialogButton;
        }
        return null;
    }
}