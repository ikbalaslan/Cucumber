package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MedunnaSignInPage;

public class MedunnaSİgnInStepDefs {
    MedunnaSignInPage medunnaSignInPage = new MedunnaSignInPage();
    @When("click on user icon")
    public void click_on_user_icon() {
        medunnaSignInPage.userIcon.click();
    }
    @When("click on Sign In option")
    public void click_on_sign_in_option() {
      medunnaSignInPage.signInOptions.click();
    }

    @When("click on Remember Me checkbox")
    public void click_on_remember_me_checkbox() {
        medunnaSignInPage.rememberMeCheckbox.click();
    }
    @When("click on Sign In submit button")
    public void click_on_sign_in_submit_button() {
       medunnaSignInPage.signInSubmitButton.click();
    }

    @And("enter {string} in username input")
    public void enterInUsernameInput(String arg0) {
        medunnaSignInPage.username.sendKeys(arg0);
    }

    @And("enter {string} in password input")
    public void enterInPasswordInput(String arg0) {
        medunnaSignInPage.password.sendKeys(arg0);
    }
}
