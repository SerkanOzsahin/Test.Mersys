package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _10_Editing_Grade_LevelsLN extends Parent {
    public _10_Editing_Grade_LevelsLN() {
        PageFactory.initElements(BD.getDriver(), this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement name;

    @FindBy(css = "input[type='number']")
    public WebElement order;

    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;

    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement shortName;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "grade levels":
                return this.gradeLevels;
        }
        return null;
    }

}
