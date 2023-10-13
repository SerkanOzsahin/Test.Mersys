package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_Attestations_ManagementDC extends Parent {

    public _02_Attestations_ManagementDC() {
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
    public WebElement name;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public  WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {

        }

        return null;
    }
}
