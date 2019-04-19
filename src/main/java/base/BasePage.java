package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.testng.Assert.assertTrue;


public class BasePage {

    private static Logger logger = LogManager.getLogger(BasePage.class);
    protected WebDriver driver;
    protected WebDriverWait wait;
    private boolean acceptNextAlert = true;

    protected BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    protected BasePage() {

    }

    //Click Method
    public WebElement click(By element) {
        assertTrue(isElementPresent(element));
        WebElement we = wait.until(elementToBeClickable(element));
        we.click();
        logger.info(element + " clicked.");
        return we;

    }

    //Send Keys
    protected void sendKeys(By element, Keys key) {
        assertTrue(isElementPresent(element));
        WebElement we = wait.until(elementToBeClickable(element));
        we.sendKeys(key);
    }

    //Send String
    protected void sendKeys(By element, String string) {
        assertTrue(isElementPresent(element));
        WebElement we = wait.until(elementToBeClickable(element));
        we.sendKeys(string);
    }


    //Read Text
    protected String readText(By element) {
        assertTrue(isElementPresent(element));
        WebElement we = wait.until(elementToBeClickable(element));

        return we.getText();

    }

    protected boolean isElementPresent(By element) {
        try {
            wait.until(elementToBeClickable(element));
            logger.info(element + " is present");
            return true;
        } catch (NoSuchElementException e) {
            logger.error(element + "is NOT present...");
            return false;
        }
    }


    protected void clear(By element) {
        try {
            WebElement we = wait.until(elementToBeClickable(element));
            we.clear();
        } catch (Error e) {
            logger.error(e.toString());
        }
    }


    public String closeAlertAndGetText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            logger.error(e);
            return false;
        }
    }
}
