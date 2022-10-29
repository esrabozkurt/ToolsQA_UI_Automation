package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormPage extends Driver {

    public FormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//div[@class='card-body'])[2]")
    public WebElement formButon;

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiceFormsButonu;

   @FindBy (id = "firstName")
   public WebElement firstname;

    @FindBy(id ="lastName")
    public WebElement lastname;

    @FindBy(id ="userEmail")
    public WebElement mail;

    @FindBy(id ="gender-radio-2")
    public WebElement femaleRadioButonu;

    @FindBy(id ="userNumber")
    public WebElement mobilNumber;

    @FindBy(id ="dateOfBirthInput")
    public WebElement tarih;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    public WebElement ddm_ay;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    public WebElement ddm_yil;

    @FindBy(xpath = "(//div[text()='2'])[1]")
    public WebElement gunSec;

    @FindBy(id ="hobbies-checkbox-1")
    public WebElement sportsRadioButonu;

    @FindBy(id ="uploadPicture")
    public WebElement selectFile;

    @FindBy(id ="currentAddress")
    public WebElement adres;


    public String getAlphaNumericString()
    {

        String AlphaNumericString = "123456789";
        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {

            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }



}
