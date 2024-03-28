package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import utils.DriverUtils;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeSuite
    public void setUp() {
        DriverUtils.initializeDriver();
    }
    
    @AfterSuite
    public void tearDown() {
        DriverUtils.quitDriver();
    }

}
