package com.autoTest.runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,json:target/cucumber-report/cucumber.json,html:target/cucumber-report")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@smoke")
//@ConfigurationParameter(key = FILTER_NAME_PROPERTY_NAME, value = "Sample Scenario")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.steps")
//@SelectFiles({
//        @SelectFile("src/test/resources/features/feature1.feature"),
//        @SelectFile("src/test/resources/features/feature2.feature")
//})

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@ValidCredentials")
public class CucumberTestSuite {
}
