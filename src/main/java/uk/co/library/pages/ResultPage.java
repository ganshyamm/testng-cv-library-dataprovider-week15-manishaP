package uk.co.library.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.utility.UtilityClass;

// create Method - verifyTheResults(String expected)
public class ResultPage extends UtilityClass {
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement resultText;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyTheResults(String expected){
        Reporter.log("Get text from result" +resultText.toString());
         getTextFromElement(resultText);
        Assert.assertTrue(getTextFromElement(resultText).contains(expected));
    }



}
