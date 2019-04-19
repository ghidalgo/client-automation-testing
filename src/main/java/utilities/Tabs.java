package utilities;

import base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class Tabs extends BasePage {

    private Logger logger = LogManager.getLogger(Tabs.class);

    public Tabs(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }


    public void switchToNextTab(List<String> list) throws Exception {
        logger.info("*** SWITCH TO NEXT TAB ***");
        logger.debug("Current window handle: " + driver.getWindowHandle());
        int currentWindowIndex = list.indexOf(driver.getWindowHandle());
        logger.debug("Current window handle index: " + currentWindowIndex);

        int nextWindowIndex = currentWindowIndex + 1;
        logger.debug("Next window handle: " + list.get(nextWindowIndex));
        logger.debug("Next window handle index: " + nextWindowIndex);

        if (nextWindowIndex >= list.size()) {
            throw new Exception() {
            };
        } else {

            driver.switchTo().window((list.get(nextWindowIndex)));
            int newCurrentWindowIndex = list.indexOf(driver.getWindowHandle() + " ***");
            logger.debug("*** Set New Window Handle to: " + driver.getWindowHandle() + " ***");
            logger.debug("*** Set New Window Handle Index to: " + newCurrentWindowIndex + " ***");
        }
    }

    public void switchToPreviousTab(List<String> list) throws Exception {
        logger.info("*** Switch to Previous Tab ***");
        logger.debug("Current Window Handle: " + driver.getWindowHandle());
        int currentWindowIndex = list.indexOf(driver.getWindowHandle());
        logger.debug("Current Window Handle index: " + currentWindowIndex);

        int previousWindowIndex = currentWindowIndex - 1;
        logger.debug("Previous window handle: " + list.get(previousWindowIndex));
        logger.debug("Previous window handle index: " + previousWindowIndex);

        if (previousWindowIndex <= list.size()) {
            throw new Exception() {
            };
        } else {

            driver.switchTo().window((list.get(previousWindowIndex)));
            int newCurrentWindowIndex = list.indexOf(driver.getWindowHandle());
            logger.debug("*** Set New Window Handle to: " + driver.getWindowHandle() + " ***");
            logger.debug("*** Set New Window Handle Index to: " + newCurrentWindowIndex + " ***");
        }
    }


    public void closeTab(List<String> list) throws Exception {
        logger.info("*** CLOSE TAB ***");
        int currentWindowIndex = list.indexOf(driver.getWindowHandle());
        logger.debug("Current window handle: " + driver.getWindowHandle());
        logger.debug("Current window handle index: " + currentWindowIndex);
        logger.debug("Current window handles: " + list);

        driver.close();
        logger.info("Tab Closed successfully");
        driver.switchTo().window((list.get(currentWindowIndex - 1)));

    }

    public void updateTabsList(List<String> tabsList) {
        logger.info("*** UPDATE TAB LIST ***");
        if (tabsList.isEmpty()) {
            logger.info("There are currently no Window Handles in your list");
        } else {
            logger.info("Here are your current window Handles" + tabsList);
        }

        for (String tab : driver.getWindowHandles()) {
            if (!tabsList.contains(tab)) {
                tabsList.add(tab);
                logger.info("tab added to List...");
            }
        }

        ArrayList<String> valuesToRemove = new ArrayList<>();

        for (String tab : tabsList) {
            if (!driver.getWindowHandles().contains(tab)) {
                valuesToRemove.add(tab);
            }
        }

        if (!valuesToRemove.isEmpty()) {
            tabsList.removeAll(valuesToRemove);
            logger.info("tab removed from List...");
        }
    }

    //TODO create a method that opens a new blank tab, could be done with some JS.
    public void openBlankTab() {
    }
}
