package co.uk.theinternet.pages;

import co.uk.theinternet.commons.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLib {
    public String BASE_URL = "https://the-internet.herokuapp.com/";
    public Select select;

    public void launchURL()
    {
        driver.navigate().to(BASE_URL);
    }
    public void selectElementByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
}
