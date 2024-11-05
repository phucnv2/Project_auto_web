package com.autoTest.definitions;

import io.cucumber.java.en.Given;

public class CommonDef {

    @Given("sleep thread {int} second")
    public void sleepThreadBySecond(int timeSecond) {
        try {
            Thread.sleep(timeSecond * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
