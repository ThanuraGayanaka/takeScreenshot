package Listeners;

import Utils.ScreenshotUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import Basepage.Basetest;

public class TestListener extends Basetest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = getDriver();  // Get WebDriver instance
        if (driver != null) {
            ScreenshotUtils.takeScreenshot(driver, result.getName() + "_Failed"); // Take Screenshot
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        WebDriver driver = getDriver();  // Get WebDriver instance
        if (driver != null) {
            ScreenshotUtils.takeScreenshot(driver, result.getName() + "_Success"); // Take Screenshot
        }
    }
}
