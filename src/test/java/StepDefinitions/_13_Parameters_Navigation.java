package StepDefinitions;

import Pages.DialogContent._13_Parameters_NavigationDC;
import Pages.LeftNav._13_Parameters_NavigationLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _13_Parameters_Navigation {

    _13_Parameters_NavigationDC dc = new _13_Parameters_NavigationDC();
    _13_Parameters_NavigationLN ln = new _13_Parameters_NavigationLN();

    @When("the user navigates to parameters")
    public void theUserNavigatesToParameters(DataTable links) {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);

        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @Then("Upon clicking the following menu links, the user should see the corresponding page titles")
    public void uponClickingTheFollowingMenuLinksTheUserShouldSeeTheCorrespondingPageTitles(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            String linkTitle = linkWebElement.getText();
            ln.myClick(linkWebElement);
            System.out.println(linkTitle);
            dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
            String pageTitle = ln.titleText.getText();
            System.out.println(pageTitle);
            Assert.assertTrue(linkTitle.toLowerCase().contains(pageTitle.toLowerCase()));
        }
    }
}
