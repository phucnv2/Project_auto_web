package com.autoTest.definitions;

import com.autoTest.common.BasePage;
import com.autoTest.common.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

    @Before
    public void setUp() {
        createBrowser();
        System.out.println("Starting the scenario...");
    }

    @After
    public void tearDown() {
        DriverManager.getDriver().quit();
        System.out.println("Ending the scenario...");
    }
}
