package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PopUpScreenshotPage extends Driver{

    public PopUpScreenshotPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='modal-content']")
    public WebElement popup;


}
