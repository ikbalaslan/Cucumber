package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user enters customer_email and customer_password")
    public void user_enters_customer_email_and_customer_password(DataTable credentials) {
//credentials.row(0); This gets the first row of the datatable in the feature file.
//List<String> customerData = credentials.row(1);//Row index start at 0
////        System.out.println(customerData.get(0));//Return jack@gmail.com
////        System.out.println(customerData.get(1));//Return 12345
////        System.out.println(credentials.row(1).get(1));//We can do method chain . 2nd row 2nd col
//
        homePage.loginButton.click();
//        loginPage.username.sendKeys(customerData.get(0));
//        loginPage.password.sendKeys(customerData.get(1));
//        loginPage.loginButton.click();
        //2. GET DATA <LIST<MAP<STRING,STRING>>>
 List<Map<String,String>> customerData = credentials.asMaps(String.class,String.class);
        for (Map<String,String> each : customerData){
            loginPage.username.sendKeys(each.get("username"));
            loginPage.password.sendKeys(each.get("password"));
            loginPage.loginButton.click();
        }
    }
    @Then("verify the application login is successful")
    public void verify_the_application_login_is_successful() {
      Assert.assertTrue(homePage.userID.isDisplayed());

    }

    @Then("verify the login page url contains login keyword")
    public void verify_the_login_page_url_contains_login_keyword() {
        ReusableMethods.waitFor(3);
      Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

}
