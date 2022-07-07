package com.cydeo.step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.cydeo.utilities.Driver;
public class Hooks {
    @Before
    public void setup() {
        System.out.println("Before Scenario is running");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("After Scenario running");
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
