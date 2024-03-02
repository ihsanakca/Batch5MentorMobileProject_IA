package com.krafttech.tests;

import com.krafttech.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.krafttech.utils.App.API_Demos;
import static com.krafttech.utils.Device.Pixel_3;
import static com.krafttech.utils.MobileUtilities.*;

public class Test_06 extends TestBase {



    @Test
    public void test1()  {

        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

    }
}
