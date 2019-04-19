package client.pages;

import base.BasePage;
import client.properties.InteractionsProps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.PageControls;
import utilities.Urls;

import java.util.ArrayList;
import java.util.List;

import static client.properties.InteractionsProps.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class InteractionsPage extends BasePage {
    public Logger logger = LogManager.getLogger(getClass().getName());
    private Urls url = new Urls();
    private PageControls pageControlObj = new PageControls(driver, wait);


    public InteractionsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void selectLi(By element) {
        click(element);
    }

    public void selectable() throws InterruptedException {
        List<InteractionsProps> props = new ArrayList<>();
        props.add(ITEM1);
        props.add(ITEM2);
        props.add(ITEM3);
        props.add(ITEM4);
        props.add(ITEM5);
        props.add(ITEM6);
        props.add(ITEM7);

        for (InteractionsProps prop : props) {
            logger.info(prop);
            WebElement we = click(prop.get());
            assertEquals(we.getCssValue("background-color"), "rgba(243, 152, 20, 1)");
            assertNotEquals(we.getCssValue("background-color"), "rgba(255, 255, 255, 1)");
        }
    }
}
