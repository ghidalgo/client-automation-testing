package tests;

import base.BaseTest;
import client.properties.InteractionsProps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

@Test
public class InteractionTests extends BaseTest {
    private Logger logger = LogManager.getLogger(getClass().getName());


    public void loadInteractionsPage() throws InterruptedException {
        pageControlObj.load("CAT_INTERACTIONS".toLowerCase());

    }

    public void testSelectableItems() throws Exception {
        interactionsPage.selectLi(InteractionsProps.SELECTABLE.get());
        interactionsPage.selectable();

    }
}

