package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
@FindBy(partialLinkText = "Start n")
    WebElement startNowButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='govuk-caption-l']")
    WebElement checkVisaPage;

   public void clickStartNow(){
        log.info("Clicking on start now : " + startNowButton.toString());
       clickOnElement(startNowButton, "work");
    }
    public String checkVisaPageText(){
        String message = getTextFromElement(checkVisaPage);
        log.info("Getting text from : " + checkVisaPage.toString());
        return message;
    }














}
