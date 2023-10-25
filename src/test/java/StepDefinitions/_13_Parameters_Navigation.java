package StepDefinitions;

import Pages.LeftNav._13_Parameters_NavigationLN;
import Utilities.BD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _13_Parameters_Navigation {

    _13_Parameters_NavigationLN ln = new _13_Parameters_NavigationLN();

    public WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));

    @When("the user navigates to parameters")
    public void theUserNavigatesToParameters(DataTable links) {
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
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
            String pageTitle = ln.titleText.getText();
            Assert.assertTrue(pageTitle.toLowerCase().contains(linkTitle.toLowerCase()));
        }
    }
}
