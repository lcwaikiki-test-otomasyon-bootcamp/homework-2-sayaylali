package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = {"C:\\Users\\Serdar\\Desktop\\Proje\\HW2\\src\\main\\java\\Features\\Homepage.feature"},
        glue={"StepDefns"},
        plugin = { "summary", "pretty"

        }
)
public class runner extends AbstractTestNGCucumberTests {
}
