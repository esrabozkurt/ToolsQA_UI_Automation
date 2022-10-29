package PagesFunction;

import Commands.Commands;
import Pages.PopUpScreenshotPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import java.io.IOException;

public class PopUpScreenshotFunction {

    PopUpScreenshotPage popUpScreenshotPage =new PopUpScreenshotPage();
    Actions actions=new Actions(Driver.getDriver());
    Logger log = (Logger) LogManager.getLogger(FormPagesFunction.class);

    public void Wait_PopUp(){
        Commands.waitForVisibility(popUpScreenshotPage.popup,500);
        log.info("Wait Popup 5 sn");
    }

    public void Screenshot_PopUp() throws IOException {
        Commands.getScreenshot("popup");
        log.info("Screenshot PopUp : Also you can find in target/screenshot");
    }



}
