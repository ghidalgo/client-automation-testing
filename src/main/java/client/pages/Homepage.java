package client.pages;

import base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Urls;

public class Homepage extends BasePage {
    public Logger logger = LogManager.getLogger(getClass().getName());
    private Urls url = new Urls();

    public Homepage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

}
