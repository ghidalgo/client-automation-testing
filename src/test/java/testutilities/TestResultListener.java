package testutilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultListener /*extends BasePage*/ implements ITestListener {
    Logger logger = LogManager.getLogger(TestResultListener.class);
    Screenshots screenshotObj;

    public void setScreenshotObj(Screenshots screenshotObj) {

        this.screenshotObj = screenshotObj;
    }
    // public TestResultListener(WebDriver driver, WebDriverWait wait, Screenshots screenshotObj) {
    //     super(driver, wait);
    //     this.screenshotObj = screenshotObj;
    // }

    @Override
    public void onTestStart(ITestResult iTestResult) {
    }

    //TODO on success create a sub folder within the mail folder on local machine, as well as circleCI path.
    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("*** Test Success: '" + result.getName() + "' test has passed ***");
        String methodName = result.getName().toString().trim();

        //   try {
        //       screenshotObj.takeScreenShot(methodName);
        //   } catch (IOException e) {
        //       e.printStackTrace();
        //       logger.error(e);
        //    }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // this.driver = ((samlBase.BaseTest)result.getInstance()).driver;

        logger.error("*** Test Failure: '" + result.getName() + "' test has failed ***");
        String methodName = result.getName().toString().trim();
        //     try {
        //       takeScreenShot(methodName);
        //    } catch (IOException e) {
        //         logger.error(e);
        //         e.printStackTrace();
        //     }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}
