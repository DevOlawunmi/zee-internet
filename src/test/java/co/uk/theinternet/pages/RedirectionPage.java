package co.uk.theinternet.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedirectionPage extends BasePage {
    public RedirectionPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "redirect")
    private WebElement redirectionLink;

    @FindBy (css = ".example h3")
    private WebElement pageTitle;

    public void isPageTitleDisplayed (){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectURLDisplayed(String redirect){
        driver.getCurrentUrl().contains(redirect.toLowerCase());

            }
public StatusCodesPage clickOnRedirectionLink(){
        redirectionLink.click();
        return new StatusCodesPage(driver);
}
}
