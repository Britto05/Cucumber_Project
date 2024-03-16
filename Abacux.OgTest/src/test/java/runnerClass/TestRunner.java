package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="src/test/resources/features/AllMenuLinks.feature",
		features="src/test/resources/features/AllReportLinks.feature",
		//features="src/test/resources/features/Purchase.feature",
		glue={"stepDefinitions"}, 
		//tags="@Tag",

		dryRun = false,
				//dryRun = true,
		monochrome = true,
				//monochrome = false,

		plugin = {"rerun:target/failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-reports/report.html"}

		)
public class TestRunner {

}
