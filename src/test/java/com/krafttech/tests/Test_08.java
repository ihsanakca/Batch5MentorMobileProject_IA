package com.krafttech.tests;

import com.krafttech.TestBase;
import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Locators;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.krafttech.utils.App.API_Demos;
import static com.krafttech.utils.App.CALCULATOR;
import static com.krafttech.utils.Device.Pixel_3;
import static com.krafttech.utils.Locators.*;
import static com.krafttech.utils.MobileUtilities.*;

public class Test_08 extends TestBase {



    @Test
    public void test1()  {

        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");
       //1762 966
        clickToCoordinate(326,434);
        
    }

    @Test
    public void test2()  {

        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");
        clickWithText("Auto Complete");



        driver= openApp(Pixel_3, CALCULATOR);

        clickNumber(9);
        clickOperator("minus");
        clickNumber(2);
        clickOperator("equals");
        String expectedText = driver.findElement(lResultFinal).getText();
        int expected = Integer.parseInt(expectedText);

        activateBackgroundApp(API_Demos.appPackage);

        int actual = driver.findElements(lAutoCompleteList).size();

        Assert.assertEquals(actual,expected);

    }


}
