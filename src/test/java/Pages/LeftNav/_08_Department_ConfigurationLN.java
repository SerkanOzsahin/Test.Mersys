package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _08_Department_ConfigurationLN extends Parent {

    public _08_Department_ConfigurationLN () {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schollSetup;

    @FindBy(xpath = "(//span[text()='Departments'])[1]")
    public WebElement departments;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup": return this.setup;
            case "school setup": return this.schollSetup;
            case "departments": return this.departments;
        }
        return null;
    }

}
