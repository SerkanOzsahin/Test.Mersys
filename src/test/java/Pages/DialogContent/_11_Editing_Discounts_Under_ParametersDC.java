package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _11_Editing_Discounts_Under_ParametersDC extends Parent {
    public _11_Editing_Discounts_Under_ParametersDC() {
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
    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'description')]//input")
    public WebElement description;
    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'code')]//input")
    public WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[contains(@formcontrolname,'priority')]//input")
    public WebElement priority;
    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveAndClose;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "(//*[@class='mat-mdc-button-touch-target'])[12]")
    public WebElement editButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton;
    @FindBy(xpath = "//input[@data-placeholder='Description']")
    public WebElement searchBox;
    public WebElement getWebElement(String strElement) {
        switch (strElement) {

        }
        return null;
    }
}
