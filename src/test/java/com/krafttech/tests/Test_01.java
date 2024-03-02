package com.krafttech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_01 {

    AppiumDriver<MobileElement> driver;
    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        /**
         * {
         *   "appium:udid": "emulator-5554",
         *   "appium:version": "11",
         *   "appium:deviceName": "Pixel_2",
         *   "platformName": "Android",
         *   "appium:realDevice": "false",
         *   "appium:automationName": "uiautomator2"
         * }
         */

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:udid","emulator-5554");
        capabilities.setCapability("appium:version","11");
        capabilities.setCapability("appium:deviceName","Pixel_2");
        capabilities.setCapability("platformName","Android");

        //com.touchboarder.android.api.demos/com.touchboarder.androidapidemos.MainActivity

        capabilities.setCapability("appium:appPackage","com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity","com.touchboarder.androidapidemos.MainActivity");


        //driver'ı ayarlayalım
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.findElement(By.xpath("//*[@text='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='API Demos']")).click();
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();

        Thread.sleep(2000);

        driver.rotate(ScreenOrientation.LANDSCAPE);
        Thread.sleep(2000);
        driver.rotate(ScreenOrientation.PORTRAIT);

        Thread.sleep(2000);

        driver.closeApp();



    }
}
