package client.pages;

import base.BasePage;
import client.properties.WidgetProps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Urls;

import java.util.ArrayList;
import java.util.List;

public class WidgetsPage extends BasePage {
    private Logger logger = LogManager.getLogger(getClass().getName());
    private Urls url = new Urls();

    public WidgetsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void selectLi(By element) {
        click(element);
    }

    public void checkboxradio() throws InterruptedException {
        List<WidgetProps> radioProps = new ArrayList<>();
        radioProps.add(WidgetProps.RADIO_1);
        radioProps.add(WidgetProps.RADIO_2);
        radioProps.add(WidgetProps.RADIO_3);


        for (WidgetProps prop : radioProps) {
            logger.info(prop);
            WebElement we = click(prop.get());
            //assertEquals(we.getCssValue("background-color"), "rgba(243, 152, 20, 1)");
            //assertNotEquals(we.getCssValue("background-color"), "rgba(255, 255, 255, 1)");
        }
    }
}
