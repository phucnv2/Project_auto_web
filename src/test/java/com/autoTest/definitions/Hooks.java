package com.autoTest.definitions;

import com.autoTest.common.DriverManager;
import com.autoTest.common.LoadData;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        new LoadData();
        System.out.println("Starting the scenario...");
    }

    @After
    public void tearDown() {
        DriverManager.getDriver().quit();
        System.out.println("Ending the scenario...");
    }

}
