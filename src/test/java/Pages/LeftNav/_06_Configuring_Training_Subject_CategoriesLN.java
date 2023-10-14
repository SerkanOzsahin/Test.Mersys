package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06_Configuring_Training_Subject_CategoriesLN extends Parent {

    public _06_Configuring_Training_Subject_CategoriesLN() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(linkText = "Education")
    public WebElement educationButton;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupButton;
    @FindBy(linkText = "Subject Categories")
    public WebElement subjectCategories;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "educationButton": return educationButton;
            case "setupButton": return setupButton;
            case "subjectCategories":return subjectCategories;

        }
        return null;
    }

}
