package com.krafttech.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "html:target/default-html-reports.html",
                "pretty"
        },
        features = "src/test/java/com/krafttech/cucumber",
        glue ="com/krafttech/cucumber",
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {
}
