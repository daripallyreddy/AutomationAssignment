import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        glue = {"stepDefinations"},
        features = "src\\test\\featureFiles",
        plugin = {
                "json:target/jsonReports/CucumberTestReport.json"
        })
public class TestRunner {
}
