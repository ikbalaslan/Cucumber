package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
//        WRITE THE JAVA CODE
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }
    @When("user search for iPhone")
    public void user_search_for_i_phone() {
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("verify page title contains iPhone")
    public void verify_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @Then("close the application")
    public void close_the_application() {
   Driver.closeDriver();
    }

    @When("user search for TeaPot")
    public void user_search_for_tea_pot() {
        googlePage.searchBox.sendKeys("TeaPot"+ Keys.ENTER);
    }
    @Then("verify page title contains TeaPot")
    public void verify_page_title_contains_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("TeaPot"));
    }

    @When("user search for {string} on google")
    public void user_search_for_on_google(String string) {
       googlePage.searchBox.sendKeys(string+Keys.ENTER);

    }
    @Then("verify page title contains {string}")
    public void verify_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }



}
//You have 500 test cases you are running. ıt takes 5 hours . 10 of them failed 490 passed Then what do you do?
//I would run only failed scenarios again
//How?
//If a scenario fails, then my framework generate a report. In that report I can see the which test failed. After than I can
//I can do test those test cases which are failed. In testNG I can use Listeners , In cucumber I can use plugin
//Those are automatically rerun the failed test cases