package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _13_Parameters_NavigationLN extends Parent {

    public _13_Parameters_NavigationLN() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement states;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    public WebElement cities;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenships;

    @FindBy(xpath = "(//span[text()='Reasons for leaving'])[1]")
    public WebElement rfl;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fees;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    public WebElement discounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Document Types']")
    public WebElement documentTypes;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccounts;

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement fields;

    @FindBy(xpath = "//span[text()='Field Settings']")
    public WebElement fieldSettings;

    @FindBy(css = "div[class='ng-star-inserted'] > span")
    public WebElement titleText;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "countries": return this.countries;
            case "states": return this.states;
            case "cities": return this.cities;
            case "citizenships": return this.citizenships;
            case "rfl": return this.rfl;
            case "nationalities": return this.nationalities;
            case "fees": return this.fees;
            case "discounts": return this.discounts;
            case "gradeLevels": return this.gradeLevels;
            case "documentTypes": return this.documentTypes;
            case "bankAccounts": return this.bankAccounts;
            case "fields": return this.fields;
            case "fieldSettings": return this.fieldSettings;
        }
        return null;
    }
}
