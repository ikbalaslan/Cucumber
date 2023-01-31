package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {
    public MedunnaHomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[.='Items&Titles']")
    public WebElement itemsAndTitles;

    @FindBy (xpath = "//*[@data-icon='bed']")
    public WebElement roomOption;

    @FindBy (xpath = "//*[.='Create a new Room']")
    public WebElement newRoomButton;

    @FindBy (name = "roomNumber")
    public WebElement roomNumberInput;

    @FindBy (id = "room-roomType")
    public WebElement dropdown;

    @FindBy(id = "room-status")
    public WebElement statusCheckbox;

    @FindBy(name = "price")
    public WebElement priceInput;

    @FindBy(id = "room-description")
    public WebElement descriptionInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;


    @FindBy(xpath = "//span[.='Created Date']")
    public WebElement createdDate;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement firstRoomNumber;

}




