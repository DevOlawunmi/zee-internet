package co.uk.theinternet.hooks;

import co.uk.theinternet.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browsers
{private String chromeBrowser = "Chrome";
    @Before
    public void setUp()
    {
        launchBrowser(chromeBrowser);
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
