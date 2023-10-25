package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _14_Creating_Incident_LocationDC extends Parent {
    public _14_Creating_Incident_LocationDC() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    public void staleElement(WebElement element) {
        wait.until(ExpectedConditions.numberOfElementsToBe
                (By.xpath("//fuse-progress-bar/*"), 0));
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
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//ms-edit-button")
    public WebElement editButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchBox;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {

        }
        return null;


    }
}
