package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_Attestations_ManagementLN extends Parent {
    public _02_Attestations_ManagementLN() {
        PageFactory.initElements(BD.getDriver(), this);

    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement humanResourcesSetup;
    @FindBy(xpath = "//span[text()='Attestations']")
    public WebElement humanResourcesAttestations;



    public WebElement getWebElement(String strElement) {

        switch (strElement) {

        }

        return null;
    }


}
