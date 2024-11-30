
package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Hooks/HooksLearn.feature",
		glue={"stepsForHooks"},
		monochrome= true,
		dryRun= false,
	//	plugin = {"pretty","html:target/HtmlReports",
				plugin= {"pretty","json:target/JSONReports/report.json",
			"junit:target/JUnitReports/report.xml",
			"html:test-output",
			"html:target/CucumberReports/cucumber.html",
			"html:target/cucumber-report-html/cucumber-html-reports/js/cucumber.html",
	// plugin =	{
			"json:target/cucumber.json"})
//plugin= {"json:target/Reports/cucumber.json"})
//plugin= {"json:target/Reports/cucumber.html"})
//tags="@smoketest")





public class TestRunnerForHooks {
	
	

}

