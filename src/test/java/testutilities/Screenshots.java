package testutilities;

import base.BasePage;
import org.apache.commons.io.FileExistsException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Time;
import utilities.Urls;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Screenshots extends BasePage {

    private static Time single_instance = null;
    private File localFolderPath;
    private Path localPath;
    private File ciFolderPath;
    private Path ciPath;
    private Time timeObj;
    private Logger logger = LogManager.getLogger(Screenshots.class);
    private Urls clientUrlObj = new Urls();

    public Screenshots(WebDriver driver, WebDriverWait wait, Time timeObj) {
        super(driver, wait);
        this.timeObj = timeObj;
    }

    public Screenshots(Time timeObj) {
        this.timeObj = timeObj;
    }

    public void setFolder() {
        // I believe this only finds the desktop for a Mac user...might have to add this to the set up methods later.
        File desktopPath = new File(System.getProperty("user.home"), "Desktop");
        String startPath = "/Automation_Screenshots/";
        String ciStartPath = "/circleci/screenshots/";

        localFolderPath = new File(desktopPath + startPath + timeObj.getScreenshotDate() + "/" + timeObj.getScreenshotTime());
        ciFolderPath = new File(desktopPath + startPath + ciStartPath);

        if (!localFolderPath.exists() || !ciFolderPath.exists()) {
            boolean localResult = localFolderPath.mkdirs();
            boolean ciResult = ciFolderPath.mkdirs();
            if (localResult) {
                logger.info("Successfully created " + localFolderPath.getAbsolutePath());
            } else {
                logger.error("Failed creating " + localFolderPath.getAbsolutePath() + " - Pathname already exists");
            }

            if (ciResult) {
                logger.info("Successfully created " + ciFolderPath.getAbsolutePath());
            } else {
                logger.error("Failed creating " + ciFolderPath.getAbsolutePath() + " - Pathname already exists");
            }
        }
    }

    public void takeScreenShot(String testName) throws IOException {
        /* This is probably not the best way to deal with if the folder fails to be created, then do not take
           screenshots. Because what will happen when we want to run test parallel to each other. Eventually the folder
           structure will need test group names as well.
        */
        //TODO need to add a if(screenshotExists) { add a x number to the end of the file name and save it anyways}.

        String fileType = ".png";
        //logger.debug(driver);
        //logger.info(clientUrlObj.ADMIN_SETTINGS);

        File newFileName = new File(testName + fileType);
        logger.info(newFileName);
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        logger.info(srcFile);

        srcFile.renameTo(newFileName);
        logger.info(srcFile);

        //TODO Need to add test group names as a folder structure within the dated folder.
        logger.info("no wayyyyy");
        localPath = localFolderPath.toPath();
        logger.info(localPath);
        ciPath = ciFolderPath.toPath();
        logger.info(ciPath);

        if (Files.exists(localPath)) {
            try {

                FileUtils.moveFileToDirectory(newFileName, localFolderPath, true);
                logger.info("Screenshot taken.");
            } catch (FileExistsException e) {

                logger.error("Screenshot already exists.");
            }
        } else {
            logger.error("Local folder creation failed. Screenshot of '" + testName + "' test will not be taken.");
        }

        if (Files.exists(ciPath)) {
            try {

                FileUtils.copyDirectory(localFolderPath, ciFolderPath);
                logger.info("Successfully copied screenshots to CircleCI Folder");
            } catch (FileExistsException e) {

                logger.error("Screenshot already exists.");
            }

        } else {
            logger.error("CircleCI folder creation failed. Screenshot of '" + testName + "' test will not copied over");
        }
    }
}
