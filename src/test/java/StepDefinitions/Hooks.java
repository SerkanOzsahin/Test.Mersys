package StepDefinitions;

import Utilities.BD;
import Utilities.Excel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before() {
        System.out.println("Scenario Started : ");
    }

    @After
    public void after(Scenario scenario) {
        Excel.writeToExcel("src/test/java/ApachePOI/resource/Ornek3.xlsx", scenario);
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) BD.getDriver());
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        BD.quitDriver();
    }
}
