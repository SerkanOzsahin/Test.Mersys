package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07_School_Setup_LocationLN extends Parent {
    public _07_School_Setup_LocationLN() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;
    @FindBy(xpath = "//span[text()='Locations']")
    public WebElement locations;
    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "school setup":
                return this.schoolSetup;
            case "locations":
                return this.locations;
        }
        return null;
    }
}
