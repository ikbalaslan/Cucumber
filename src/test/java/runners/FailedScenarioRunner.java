package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome=true,

        features = "@target/failedRerun.txt",
        glue = {"stepdefinitions", "hooks",},
        dryRun = false


)
public class FailedScenarioRunner {

}
/*
This runner class is used to run only failedRerun.txt file
Thatfile only has failed scenarios if any scenarios fails
That file will be empty if no scenario fails We do not use tag or path of the features


What is  difference between Data driven and keyword driven framework and Hybrid framework?
DATA DRIVEN:
Testing the tests cases with multiple data. In Data driven testing, we sent multiple data and expect them to pass. If something fails, then dev fix and test with same data until all tests cases pass. Excel data, database data, xml data, scenario outline data,…
KEYWORD DRIVEN:
The above categorization can be done and maintained with the help of Excel spread sheet:
Test Step: It is a very small description of the Test Step or the description of the Action going to perform on Test Object.
Test Object: It is the name of the Web Page object/element, like Username & Password.
Action: It is the name of the action, which is going to perform on any Object such as click, open browser, input etc.
Test Data: Data can be any value which is needed by the Object to perform any action, like Username value for Username field.
HYBRID FRAMEWORK
A framework that can do both Behavior Driven Testing and Data Driven Testing
Normally we used excel in Junit, excel in Test NG, excel in cucumber.
Ahmet works in Blue Car rental compony
Framework: Cucumber BDD framework
We mostly do BDD, but we can do TDD with cumvn clean installcumber using a)scenario outline b) excel



C:\Users\corre\Downloads\apache-maven-3.8.7

 */