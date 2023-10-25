package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _14_Creating_Incident_LocationLN extends Parent {
    public _14_Creating_Incident_LocationLN() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(linkText = "Incidents")
    public WebElement incidents;
    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    public WebElement incidentsSetup;

    @FindBy(xpath = "(//span[text()='Incident Location'])")
    public WebElement incidentLocation;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "incidents": return incidents;
            case "incidentsSetup": return incidentsSetup;
            case "incidentLocation": return incidentLocation;
        }
        return null;
    }
}
