package co.uk.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StatusCodesPage extends BasePage {
    public StatusCodesPage (WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

}
