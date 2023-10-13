package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_Document_Types_ManagementLN extends Parent {

    public _03_Document_Types_ManagementLN() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {

            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "documentTypes": return this.documentTypes;
        }
        return null;
    }
}
