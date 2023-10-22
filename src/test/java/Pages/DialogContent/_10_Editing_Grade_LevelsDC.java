package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _10_Editing_Grade_LevelsDC extends Parent {
    public _10_Editing_Grade_LevelsDC() {
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

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement span;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement name;

    @FindBy(css = "input[type='number']")
    public WebElement order;

    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;

    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement shortName;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;






}
