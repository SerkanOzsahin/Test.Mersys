package Pages.DialogContent;

import Pages.Parent;
import StepDefinitions._09_Editing_Bank_Accounts;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _09_Editing_Bank_AccountsDC extends Parent {
    public _09_Editing_Bank_AccountsDC() {
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
}
