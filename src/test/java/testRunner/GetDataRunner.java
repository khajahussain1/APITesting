package testRunner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features/GetData.feature" }, glue = {
		"com/stepdefination" }, plugin = { "pretty", "html:target/cucumber-htmlReports",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/extentreport.html" },
				dryRun = false, strict = false, monochrome = true)

public class GetDataRunner extends AbstractTestNGCucumberTests {
	public String testcasename;

	@BeforeClass
	public void beforeclass() {
		testcasename = this.getClass().getSimpleName();
		System.out.println("************** Start " + testcasename + " Test ****************");
	}

	@AfterClass
	public void testDownClass() {
		// Reporter.loadXMLConfig("target/extent-config.xml");
		//Reporter.loadXMLConfig(new File("target/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		System.out.println("************** End " + testcasename + " Test ****************");

	}

}
