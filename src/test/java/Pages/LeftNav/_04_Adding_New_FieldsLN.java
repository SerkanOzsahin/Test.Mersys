package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_Adding_New_FieldsLN extends Parent {
    public _04_Adding_New_FieldsLN () {
    PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement fields;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "fields": return this.fields;
        }
        return null;
    }

}
