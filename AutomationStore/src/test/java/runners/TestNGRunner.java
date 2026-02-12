package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps", "hooks","utils","pages"},
    plugin = {"pretty",
            "html:target/cucumber-reports/cucumber.html",
            "json:target/cucumber-reports/cucumber.json"
    },
    monochrome = false
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
