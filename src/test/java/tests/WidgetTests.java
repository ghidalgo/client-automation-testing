package tests;

import base.BaseTest;
import client.properties.WidgetProps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

@Test
public class WidgetTests extends BaseTest {
    private Logger logger = LogManager.getLogger(getClass().getName());


    public void loadWidgetPage() throws InterruptedException {
        pageControlObj.load("CAT_WIDGETS".toLowerCase());

    }

    public void testCheckboxradioItems() throws Exception {
        widgetsPage.selectLi(WidgetProps.CHECKBOXRADIO.get());
        widgetsPage.checkboxradio();

    }
}

