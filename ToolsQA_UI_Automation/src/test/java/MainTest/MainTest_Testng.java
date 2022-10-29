package MainTest;

import BaseTest.InitalTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import utilities.Driver;


import java.io.IOException;

public class MainTest_Testng {
   PopUpScreenshotTest popUpScreenshotTest =new PopUpScreenshotTest();
   FormTest formTest =new FormTest();
   Logger log = (Logger) LogManager.getLogger(FormTest.class);
   InitalTest ınitalTest=new InitalTest();


   @Test
    public void ToolsQA_Test() throws IOException, InterruptedException {


      log.info("Go To ToolsQA WebPage And Verify");
      ınitalTest.goTo_ToolsQAWebPage_And_Verfiy();

       formTest.Complete_Form();
       popUpScreenshotTest.popUp_ScreenShot();

       Driver.closeDriver();


   }

}
