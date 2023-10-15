package Pages.LeftNav;

import Pages.Parent;
import Utilities.BD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_Position_Categories_ManagementLN extends Parent {
  public _01_Position_Categories_ManagementLN(){PageFactory.initElements(BD.getDriver(), this);}


    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement positionCategories;


  public WebElement getWebElement(String strElement) {
    switch (strElement) {
      case "human resources": return this.humanResources;
      case "setup": return this.setup;
      case "position categories": return this.positionCategories;
    }
    return null;
  }

}
