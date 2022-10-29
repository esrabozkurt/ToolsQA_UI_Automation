package PagesFunction;


import Commands.Commands;
import Pages.FormPage;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.io.FileReader;
import java.io.IOException;



public class FormPagesFunction  {

    FormPage formPage =new FormPage();
    Actions actions=new Actions(Driver.getDriver());
    Logger log = (Logger) LogManager.getLogger(FormPagesFunction.class);


    public void Send_firstname(){
        formPage.firstname.click();
        formPage.firstname.sendKeys(read_Name_From_Csv());
        log.info("Click and Completed Name ");
    }

    public void click_FormsButonu(){
        Commands.jseClick(formPage.formButon);
        log.info("Click Forms Buton via jse");
    }

    public void click_PracticeFormsButonu(){
        formPage.practiceFormsButonu.click();
        log.info("Click Forms Buton");
    }

    public void Send_lastname(){
        formPage.lastname.sendKeys(read_LastName_From_Csv());
        log.info("Completed LastName");
    }


    public void Send_Mail(){
        formPage.mail.sendKeys(read_Mail_From_Csv());
        log.info("Completed Mail");
    }


    public void click_FemaleRadioButon(){
        Commands.jseClick(formPage.femaleRadioButonu);
        log.info("Click female radio");
    }


    public void Send_PhoneNumber(){
        formPage.mobilNumber.sendKeys(0+formPage.getAlphaNumericString());
        log.info("Completed PhoneNumber");
    }


    public void Complate_Date(){

        formPage.tarih.click();
        log.info("Click date");
        Select select=new Select(formPage.ddm_ay);
        select.selectByValue("2");
        log.info("Selected month");
        Select select2=new Select(formPage.ddm_yil);
        select2.selectByVisibleText("2010");
        log.info("Selected year");
        formPage.gunSec.click();
        log.info("Selected day");
    }

    public void click_SportRadio(){
        Commands.jseClick(formPage.sportsRadioButonu);
        log.info("Click Sport radio ");
    }

    public void Send_PngProcess(){
        String filePath= "/Users/esra/Downloads/ToolsQA_UI_Automation/src/test/resources/img.png";
        log.info("Given folder path for png");
        formPage.selectFile.sendKeys(filePath);
        log.info("Send photo via png path");
    }


    public void Send_Address(){
        formPage.adres.sendKeys(read_Address_From_Csv());
        log.info("Completed Address");
    }

    public void Select_CountryCity_Submit(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        log.info("Select country , city and Click submit ");
    }



    public String read_Name_From_Csv()  {

        String name="";
        String csvFile_Path="TestData.csv";
        CSVReader reader=null;
        try{
            reader=new CSVReader(new FileReader(csvFile_Path));
            String[] cell;
            while ((cell= reader.readNext())!=null){
                for (int i = 0; i < 1; i++) {
                    name=cell[i];
                }
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
        return name;

}


    public String read_LastName_From_Csv()  {

        String lastname="";
        String csvFile_Path="TestData.csv";

        CSVReader reader=null;
        try{
            reader=new CSVReader(new FileReader(csvFile_Path));
            String[] cell;
            while ((cell= reader.readNext())!=null){
                for (int i = 0; i < 1; i++) {
                    lastname=cell[i+1];
                }
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
        return lastname;

    }


    public String read_Mail_From_Csv()  {


        String mail="";
        String csvFile_Path="TestData.csv";

        CSVReader reader=null;
        try{
            reader=new CSVReader(new FileReader(csvFile_Path));
            String[] cell;
            while ((cell= reader.readNext())!=null){
                for (int i = 0; i < 1; i++) {
                    mail=cell[i+2];
                }
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
        return mail;

    }


    public String read_Address_From_Csv()  {


        String address="";
        String csvFile_Path="TestData.csv";

        CSVReader reader=null;
        try{
            reader=new CSVReader(new FileReader(csvFile_Path));
            String[] cell;
            while ((cell= reader.readNext())!=null){
                for (int i = 0; i < 1; i++) {
                    address=cell[i+3];
                }
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
        return address;

    }


}
