package base;

import client.pages.Homepage;
import client.pages.InteractionsPage;
import client.pages.WidgetsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testutilities.Screenshots;
import testutilities.TestResultListener;
import utilities.*;

import java.io.IOException;

@Listeners(value = TestResultListener.class)
public class BaseTest {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Logger logger = LogManager.getLogger(BaseTest.class);
    private static Time timeObj;
    private static Screenshots screenshotObj;
    protected static PageControls pageControlObj;
    protected static Homepage homepage;
    protected static InteractionsPage interactionsPage;
    protected static WidgetsPage widgetsPage;
    protected static BasePage basePage;

   // private static CsvReader csvReaderObj;

    @BeforeSuite
    public void startUp() {

        // This is where all the objects are created.
        driver = chromeMac();
        logger.info("Setup");
        wait = new WebDriverWait(driver, 15);
        basePage = new BasePage(driver, wait);
        pageControlObj = new PageControls(driver, wait);
        homepage = new Homepage(driver, wait);
        interactionsPage = new InteractionsPage(driver, wait);
        widgetsPage = new WidgetsPage(driver, wait);
    }

    @AfterSuite
    public void tearDown() {
        logger.info("Teardown");
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace(System.err);
            logger.error("Error occurred during session teardown");
        }
    }

    @Test
    public void getSuiteName(ITestContext context) {
        String suiteName = context.getCurrentXmlTest().getSuite().getName();
        logger.info("suiteName: " + suiteName);
    }

    //shouldn't really be a test, but needed for building test.
    @Test
    public void logout() throws IOException, InterruptedException {
//        accountObj.logoutOfAcct();
    }

    /**
     * Sets up the Chrome web driver for use in testing.
     * <p>
     * Given if the system is a Windows or Mac style machine, the driver file path will be different.
     *
     * @param isWindows - true if Windows, false if not
     * @return - Initialized web driver for Chrome
     */
    protected WebDriver chromeSetup(boolean isWindows, boolean isHeadless) {

        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().version("73.0.3683.68").setup();

        if (isHeadless) {
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
            driver = new ChromeDriver(options);
        } else {

            driver = new ChromeDriver();
        }
        return driver;
    }

    /**
     * Set up Chrome web driver for Mac
     *
     * @return - Initialized web driver for Chrome
     */
    protected WebDriver chromeMac() {

        return chromeSetup(false, false);
    }

    protected WebDriver headlessChromeMac() {

        return chromeSetup(false, true);
    }

    /**
     * Set up Chrome web driver for Windows
     *
     * @return - Initialized web driver for Chrome
     */
    protected WebDriver chromePC() {
        return chromeSetup(true, false);
    }

    /**
     * Sets up the Firefox web driver for use in testing.
     * <p>
     * Given if the system is a Windows or Mac style machine, the driver file path will be different.
     * <p>
     * NOTE: Firefox webdriver is deprecated.
     *
     * @param isWindows - true if Windows, false if not
     * @return - Initialized web driver for Firefox
     */
    @SuppressWarnings("deprecation")
    protected WebDriver firefoxSetup(boolean isWindows) {
        /*
        if (isWindows) {
            driverPath += "/pc/geckodriver.exe";
        } else {
            driverPath += "/mac/geckodriver";
        }
        System.setProperty("webdriver.gecko.driver", driverPath);
        */

        final DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver(capabilities);
        return driver;
    }

    /**
     * Set up Firefox web driver for Mac
     *
     * @return - Initialized web driver for Firefox
     */
    protected WebDriver firefoxMac() {
        return firefoxSetup(false);
    }

    /**
     * Set up Firefox web driver for Windows
     *
     * @return - Initialized web driver for Firefox
     */
    protected WebDriver firefoxPC() {
        return firefoxSetup(true);
    }

}
