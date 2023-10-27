package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Parameters_Navigation {

    LeftNav ln = new LeftNav();

    @When("the user navigates to parameters")
    public void theUserNavigatesToParameters(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @Then("upon clicking the following menu links, the user should see the corresponding page titles")
    public void uponClickingTheFollowingMenuLinksTheUserShouldSeeTheCorrespondingPageTitles(DataTable links) throws InterruptedException {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            String linkTitle = linkWebElement.getText();
            ln.myClick(linkWebElement);
            Thread.sleep(1000); // Sitedeki staleElement için kullandığım tüm methodlar çalışmayı bıraktığı için mecburen ekledim
            String pageTitle = ln.titleText.getText();
            Assert.assertTrue(pageTitle.toLowerCase().contains(linkTitle.toLowerCase()));
        }
    }
}
