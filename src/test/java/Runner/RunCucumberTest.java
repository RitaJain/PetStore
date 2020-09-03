package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

/*
A- Pretty: Prints the Gherkin source with additional colors and stack traces for errors.
@CucumberOptions(
        features = "/home/lenovo/Propine/src/test/java/com/propine/features",
        glue="Steps",plugin = {"pretty"}, strict = false)

        B- HTML: This will generate a HTML report at the location mentioned in the for-matter itself.
        @CucumberOptions(plugin ={"pretty" , "html:Folder_Name"})
        https://testingneeds.wordpress.com/tag/cucumberoptions/
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/home/lenovo/petstore/src/test/java/Features"},
                plugin = {"pretty","html:cucumber_reports","json:cucumber_reports/cucumber.json","junit:cucumber_reports/cucumber.xml"},
        monochrome = true,tags = {"@Smoke,@Regression"},
        glue = {"Steps"},
        dryRun=false
)


public class RunCucumberTest extends AbstractTestNGCucumberTests {
}