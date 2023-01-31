package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaSignInPage {
   public MedunnaSignInPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@aria-haspopup='true']")
   public WebElement userIcon;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signInOptions;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckbox;


    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInSubmitButton;

}
