package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_Creating_Positions_Under_HRLN extends Parent {

    public _05_Creating_Positions_Under_HRLN() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positions;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "human resources": return this.humanResources;
            case "setup": return this.setup;
            case "positions": return this.positions;
        }
        return null;
    }
}
