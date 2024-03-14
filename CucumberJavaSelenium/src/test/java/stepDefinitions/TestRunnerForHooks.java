package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"stepsforhooks"},
monochrome=true,
plugin={"pretty","junit:target/JunitReports/report.xml",
        "pretty","html:target/HtmlReports/report.html",
        "pretty","json:target/JsonReports/report.Json"}
		)

public class TestRunnerForHooks {

}
