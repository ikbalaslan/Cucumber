package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalPage {
   public BlueRentalPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement loginButtonInTheHome;

   @FindBy(id = "formBasicEmail")
   public WebElement username;

    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButtonInLoginPage;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
}
