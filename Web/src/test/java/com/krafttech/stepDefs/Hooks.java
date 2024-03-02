package com.krafttech.stepDefs;

import com.krafttech.utilsWeb.Driver;
import io.cucumber.java.Before;
import org.openqa.selenium.Point;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getMobileDriver().manage().window().maximize();

    }
}
