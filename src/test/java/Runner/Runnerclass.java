package Runner;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"feature" },
                 glue =     {"StepDefination"},
                 plugin =   {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html"},
                 //tags=     "@smoke",
                 monochrome = true )
public class Runnerclass extends AbstractTestNGCucumberTests{
	
	
	

	@AfterClass
	  public static void setup() {
	  
	  
	  
     Reporter.loadXMLConfig("src/test/java/extent-config.xml");
	  Reporter.setSystemInfo("User Name", "Manoj");
	  Reporter.setSystemInfo("Application Name", "Test App");
	  Reporter.setSystemInfo("Operating System Type", "Windows 10");
	  Reporter.setSystemInfo("Environment", "QA");
	  Reporter.setTestRunnerOutput("Test Execution Cucumber Report"); 
	 
	 
}

}
