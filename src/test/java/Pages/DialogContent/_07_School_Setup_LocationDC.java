package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07_School_Setup_LocationDC extends Parent {
    public _07_School_Setup_LocationDC() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-placeholder='Short Name']")
    public WebElement shortName;
    @FindBy(xpath = "(//mat-form-field)[4]")
    public WebElement classroom;
    @FindBy(xpath = "//span[text()=' Laboratory ']")
    public WebElement laboratory;
    @FindBy(css = "input[data-placeholder='Capacity']")
    public WebElement capacity;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMsg;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteBtn;

}
