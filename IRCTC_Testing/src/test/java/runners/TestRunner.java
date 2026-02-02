package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

//Scenario: Invalid user login
//Given User navigates to "https://www.air.irctc.co.in/"
//When User enters invalid credentials
//And User clicks on login button
//Then User should see an error message