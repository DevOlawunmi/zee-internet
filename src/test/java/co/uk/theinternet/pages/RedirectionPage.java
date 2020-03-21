package co.uk.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RedirectionPage extends BasePage {
    public RedirectionPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
