package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
    @FindBy(tagName = "select")
    WebElement selectNationality;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueBtn;


    public void selectNationality(String nationality){
        log.info("Click on Nationality dropdown list : " + selectNationality.toString());
        selectByVisibleTextFromDropDown(selectNationality,"Australia");
    }

   public void clickNextStepButton(){
       log.info("Click on Continue button : " + continueBtn.toString());

   }












}
