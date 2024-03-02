package com.krafttech.stepDefs;

import com.krafttech.utilsWeb.Driver;
import com.krafttech.utilsWeb.LocatorsWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Map;

import static com.krafttech.utilsWeb.LocatorsWeb.*;

public class KraftLoginStepDefs {

    WebDriver driver;
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = Driver.getDriver();
        driver.get(url);

    }
    @When("The user types in following credentials")
    public void the_user_types_in_following_credentials(Map<String,String> credentials) throws InterruptedException {
      /*  driver.findElement(lEmail).sendKeys(credentials.get("email"));
        driver.findElement(lPassword).sendKeys(credentials.get("password"));
        Thread.sleep(2000);
        driver.findElement(lButton).click();
       */
        login(credentials.get("email"),credentials.get("password"));
    }
    @Then("The user should be able to see own name : {string} at the dashboard page")
    public void the_user_should_be_able_to_see_own_name_at_the_dashboard_page(String expected) {
        String actual = driver.findElement(lUserName).getText();
        Assert.assertEquals(actual,expected);
    }
    @Then("The user closes browser")
    public void the_user_closes_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
