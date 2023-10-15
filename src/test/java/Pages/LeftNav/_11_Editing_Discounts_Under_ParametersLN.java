package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _11_Editing_Discounts_Under_ParametersLN extends Parent {
    public _11_Editing_Discounts_Under_ParametersLN() {
        PageFactory.initElements(BD.getDriver(), this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersSetup;
    @FindBy(xpath ="(//span[text()='Discounts'])[1]" )
    public WebElement discounts;
    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":return setup;
            case "parametersSetup":return parametersSetup;
            case "discounts":return discounts;
        }
        return null;
    }
}
