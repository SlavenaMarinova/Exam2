package core;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Browser;

public abstract class BaseTest {

    @BeforeSuite
    public void setupBrowser() {
        Browser.setup();
    }

    @AfterSuite
    public void tearDownBrowser() {
        Browser.tearDown();
    }
}
