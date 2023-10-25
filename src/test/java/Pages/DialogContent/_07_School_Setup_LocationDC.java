package Pages.DialogContent;

import Pages.Parent;
import Utilities.BD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _07_School_Setup_LocationDC extends Parent {
    public _07_School_Setup_LocationDC(){
        PageFactory.initElements(BD.getDriver(), this);
    }

//    @FindBy(css = "input[formcontrolname='username']")
//    public WebElement username;
//
//    @FindBy(css = "input[formcontrolname='password']")
//    public WebElement password;
//
//    @FindBy(css = "button[aria-label='LOGIN']")
//    public WebElement loginButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-placeholder='Short Name']")
    public WebElement shortName;

    @FindBy(xpath ="//span[text()=' Classroom ']") //"//(//mat-option//span")
    public WebElement classroom;
//       WebElement clasroom=driver.findElement(By.xpath("(//mat-option//span)[1]"));
//      WebElement laboratory=driver.findElement(By.xpath("(//mat-option//span)[2]"));
//      WebElement other=driver.findElement(By.xpath("(//mat-option//span)[3]"));
//
//       Select select1=new Select(clasroom);
//       Select select2=new Select(laboratory);
//      Select select3=new Select(other);
    @FindBy(css = "input[data-placeholder='Capacity']")
    public WebElement capacity;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMsg;

}
