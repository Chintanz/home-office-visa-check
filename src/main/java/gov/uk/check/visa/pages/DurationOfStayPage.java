package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

@CacheLookup
@FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

@CacheLookup
@FindBy(xpath = "//input[@id='response-1']")
WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;




public void selectLengthOfStay(String moreOrLess){
    switch(moreOrLess) {
        case "6 months or less":
            clickOnElement(lessThanSixMonths);
            break;
        case "longer than 6 months":
            clickOnElement(moreThanSixMonths);
            break;
        default:
            break;
    }
    log.info("Select 6 months or less : " + lessThanSixMonths.toString());
    log.info("Select 6 months or more : " + moreThanSixMonths.toString());
}

public void clickNextStepButton(){
    clickOnElement(continueButton);
    log.info("Click on Continue " + continueButton.toString());

}


}
