package co.uk.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{public HomePage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
@FindBy (linkText = "Redirect Link")
    private WebElement redirectLink;

public RedirectionPage clickOnRedirectLink()
{
    redirectLink.click();
    return new RedirectionPage(driver);
}
}
