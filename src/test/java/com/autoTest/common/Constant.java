package com.autoTest.common;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class Constant {
    public static EnvironmentSpecificConfiguration DATA_FILE_CONF;

    public Constant() {
        DATA_FILE_CONF = loadFileConf();
    }

    /**
     * get properties dataFileConf.getProperty("serenity.take.screenshots");
     *
     * @return
     */
    public EnvironmentSpecificConfiguration loadFileConf() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        return EnvironmentSpecificConfiguration.from(environmentVariables);
    }


}
