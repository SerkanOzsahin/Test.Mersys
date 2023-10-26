package StepDefinitions;

import Utilities.BD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before() {
        System.out.println("Scenario Started : ");
    }

    @After
    public void after() {
        BD.quitDriver();
    }
}
