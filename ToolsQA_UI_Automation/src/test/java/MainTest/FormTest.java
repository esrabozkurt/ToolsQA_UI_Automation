package MainTest;
import BaseTest.InitalTest;
import PagesFunction.FormPagesFunction;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import Pages.FormPage;
import utilities.Driver;


public class FormTest extends FormPagesFunction {

    InitalTest ınitalTest=new InitalTest();
    Logger log = (Logger) LogManager.getLogger(FormTest.class);


    public void Complete_Form() throws InterruptedException {

        log.info("Go To ToolsQA WebPage And Verify");
        ınitalTest.goTo_ToolsQAWebPage_And_Verfiy();

        click_FormsButonu();
        click_PracticeFormsButonu();
        Send_firstname();
        Send_lastname();
        Send_Mail();
        click_FemaleRadioButon();
        Send_PhoneNumber();
        Complate_Date();
        click_SportRadio();
        Send_PngProcess();
        Send_Address();
        Select_CountryCity_Submit();

    }

}
