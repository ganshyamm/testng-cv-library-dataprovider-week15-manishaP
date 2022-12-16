package uk.co.library.testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utility.UtilityClass;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends UtilityClass {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
