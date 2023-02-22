package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaHomePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class MedunnaHomeStepDefs {
  MedunnaHomePage medunnaHomePage = new MedunnaHomePage();

    @When("click on Items&Titles")
    public void click_on_items_titles() {
      medunnaHomePage.itemsAndTitles.click();
    }

  @When("Click on Room option")
  public void click_on_room_option() {
medunnaHomePage.roomOption.click();
  }
  @When("click on Create a new room button")
  public void click_on_create_a_new_room_button() {
medunnaHomePage.newRoomButton.click();
  }

  @And("enter {string} in Room number input")
  public void enterInRoomNumberInput(String arg0) {
      medunnaHomePage.roomNumberInput.sendKeys(arg0);
  }
  @When("select Suit option from Room Type dropdown")
  public void select_suit_option_from_room_type_dropdown() {
    Select select = new Select(medunnaHomePage.dropdown);
    select.selectByIndex(2);
  }
  @When("click on status checkbox")
  public void click_on_status_checkbox() {
medunnaHomePage.statusCheckbox.click();
  }
  @When("enter {string} in Price input")
  public void enter_in_price_input(String string) {
medunnaHomePage.priceInput.sendKeys(string);
  }
  @When("enter {string} in Description input")
  public void enter_in_description_input(String string) {
      ReusableMethods.waitFor(1);
medunnaHomePage.descriptionInput.sendKeys(string);
  }
  @When("click on Save button")
  public void click_on_save_button() {
      ReusableMethods.waitFor(1);
   medunnaHomePage.saveButton.click();
  }

  @When("click on Created Date")
  public void click_on_created_date() {
    ReusableMethods.waitFor(1);
    medunnaHomePage.createdDate.click();

  }

  @Then("assert that room is created via {string}")
  public void assert_that_room_is_created_via(String roomNumber) {

    ReusableMethods.waitFor(3);
    ReusableMethods.waitForVisibility(medunnaHomePage.firstRoomNumber,10);
    assertEquals(roomNumber, medunnaHomePage.firstRoomNumber.getText());

  }
}

