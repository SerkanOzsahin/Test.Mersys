package Pages;

import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Attestations']")
    public WebElement humanResourcesAttestations;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement humanResourcesSetup;

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement fields;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positions;

    @FindBy(linkText = "Education")
    public WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupButton;

    @FindBy(linkText = "Subject Categories")
    public WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    public WebElement locations;

    @FindBy(xpath = "(//span[text()='Departments'])[1]")
    public WebElement departments;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersSetup;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    public WebElement discounts;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;

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

    @FindBy(xpath = "//span[text()='Field Settings']")
    public WebElement fieldSettings;

    @FindBy(css = "div[class='ng-star-inserted'] > span")
    public WebElement titleText;

    @FindBy(linkText = "Incidents")
    public WebElement incidents;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    public WebElement incidentsSetup;

    @FindBy(xpath = "(//span[text()='Incident Location'])")
    public WebElement incidentLocation;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "human resources": return this.humanResources;
            case "countries": return this.countries;
            case "citizen ships": return this.citizenships;
            case "field settings": return this.fieldSettings;
            case "reason for leaving": return this.rfl;
            case "cities": return this.cities;
            case "states": return this.states;
            case "setup": return this.setup;
            case "position categories": return this.positionCategories;
            case "human resources attestations": return humanResourcesAttestations;
            case "parameters": return this.parameters;
            case "document types": return this.documentTypes;
            case "human resources setup": return humanResourcesSetup;
            case "fields": return this.fields;
            case "positions": return this.positions;
            case "educationButton": return educationButton;
            case "setupButton": return setupButton;
            case "subjectCategories": return subjectCategories;
            case "school setup": return this.schoolSetup;
            case "locations": return this.locations;
            case "departments": return this.departments;
            case "bank accounts": return this.bankAccounts;
            case "grade levels": return this.gradeLevels;
            case "parametersSetup": return parametersSetup;
            case "discounts": return discounts;
            case "nationalities": return this.nationalities;
            case "incidents": return incidents;
            case "incidentsSetup": return incidentsSetup;
            case "incidentLocation": return incidentLocation;
        }
        return null;
    }
}
