package utilities;

import base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class PageControls extends BasePage {

    private Logger logger = LogManager.getLogger(PageControls.class);
    private Urls url = new Urls();


    public PageControls(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void load(String nameOfPage) throws InterruptedException {

        String request = "'" + nameOfPage + "' page requested.";
        logger.info(request);

        switch (nameOfPage) {
            case "cat_interactions":
                driver.get(url.CAT_INTERACTIONS);
                Thread.sleep(2000);
                pageLoadVerify(url.CAT_INTERACTIONS);
                break;

            case "demobase":
                driver.get(url.DEMOBASE);
                Thread.sleep(2000);
                pageLoadVerify(url.DEMOBASE);
                break;

            case "cat_widgets":
                driver.get(url.CAT_WIDGETS);
                Thread.sleep(2000);
                pageLoadVerify(url.CAT_WIDGETS);
                break;
        }
    }

    public void pageLoadVerify(String expectedUrl) throws InterruptedException {
        Thread.sleep(1000);
        logger.info("Current: " + driver.getCurrentUrl());
        logger.info("Expected: " + expectedUrl);

        try {
            assertEquals(driver.getCurrentUrl(), expectedUrl);

        } catch (AssertionError e) {
            fail(e.getMessage());
            logger.error(e);
        }
    }

    public void pageRefresh() {
        driver.navigate().refresh();
    }
}
