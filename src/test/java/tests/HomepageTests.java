package tests;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


@Test
public class HomepageTests extends BaseTest {
    private Logger logger = LogManager.getLogger(getClass().getName());


    public void loadHomepage() throws InterruptedException {
        pageControlObj.load("DEMOBASE".toLowerCase());
    }
}

