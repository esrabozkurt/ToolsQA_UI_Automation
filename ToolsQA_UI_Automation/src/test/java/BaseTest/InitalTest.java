package BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import MainTest.FormTest;
import utilities.ConfigReader;
import utilities.Driver;


public class InitalTest {

    Logger log = (Logger) LogManager.getLogger(FormTest.class);


    public void goTo_ToolsQAWebPage_And_Verfiy(){

        log.info("Go To ToolsQA WebPage");
        Driver.getDriver().get(ConfigReader.getProperty("URL"));


        log.info("Detect ToolsQA WebPage title as : ");
        String expectedTitle="ToolsQA";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        log.info("Succesful Login ToolsQA WebPage");
    }





}
