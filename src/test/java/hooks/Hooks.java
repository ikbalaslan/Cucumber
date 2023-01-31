package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Hooks is used to run before and after each Scenario
     */
  @Before
    public void setUpScenario(){
//        System.out.println("Before Method");
    }
    //This Before hooks ONLY RUNS for @smoke_tests TAGGED SCENARIOS
   // @Before(value = "@smoke_tests")
    @Before("@smoke_tests")
    public void setUpSmokeScenarios(){
      System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }

//This After hooks only runs for @smoke_tests TAGGED SCENARIOS
    @After("@smoke_tests")
    public void tearDownSmokeScenarios(){
      System.out.println("Run FOR ONLY SMOKE TEST SCENARIOS");
    }


  @After
    public void tearDownScenario(Scenario scenario){
//      System.out.println("After Method");
      if (scenario.isFailed()){//Capturing the screenshot when a scenario fails and attaching it to report.
        final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
      scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName()+"");
      Driver.closeDriver();
      }
    }
}
