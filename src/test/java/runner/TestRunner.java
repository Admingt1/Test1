

package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="src/test/resources/feature/logapp.feature",
		features="src/test/resources/feature/loginn.feature",
		glue={"steps"},
		monochrome= true,
		dryRun= false,
		plugin = {"pretty","html:target/HtmlReports",
	     		// plugin= {"pretty","json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml",
				"html:test-output",
				"html:target/CucumberReports/cucumber.html",
	//plugin =	{
			"json:target/cucumber.json"})
	
//plugin= {"json:target/Reports/cucumber.json"})
//plugin= {"json:target/Reports/cucumber.html"})
//tags="@smoketest")
public class TestRunner {

}




