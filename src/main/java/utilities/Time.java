package utilities;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time extends BasePage {
    public static final int SECONDS_PER_DAY = 24 * 60 * 60; // seconds in 24 hours period
    static DateFormat df = new SimpleDateFormat("MM.dd.yyyy @ h:mm:ss a");
    static DateFormat screenshotDf = new SimpleDateFormat("yyyy.MM.dd-h.mm a");
    long startTime;
    long endTime;
    String cleanStartTime;
    String cleanEndTime;
    String screenShotTime;
    String screenShotDate;

    public Time(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public Time() {

        super();
    }

    public long getEventStartTime() {
        return startTime;
    }

    public long getEventEndTime() {
        return endTime;
    }

    public String getCleanEventEndTime() {
        return cleanEndTime;
    }

    public String getCleanEventStartTime() {
        return cleanStartTime;
    }

    public void setScreenshotDateTime() {
        Date dateTime = Calendar.getInstance().getTime();

        String time = screenshotDf.format(dateTime);
        String[] parts = time.split("-");
        screenShotDate = parts[0];
        screenShotTime = parts[1];
    }

    public String getScreenshotTime() {
        return screenShotTime;
    }

    public String getScreenshotDate() {
        return screenShotDate;
    }
}
