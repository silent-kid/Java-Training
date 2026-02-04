package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps", "hooks","utils"},
    plugin = {"pretty"},
    monochrome = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
