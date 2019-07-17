/*Create cucumber project form cucumber-archetype Maven
        plugin
        https://docs.cucumber.io/guides/10-minute-tutorial/
        - Implement few steps.*/

package automationpractice;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/resources/features",
        monochrome = true,
        tags = "@TestScenarioV1",
        glue={"steps"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
