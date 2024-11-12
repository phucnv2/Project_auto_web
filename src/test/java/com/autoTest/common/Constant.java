package com.autoTest.common;

import com.fasterxml.jackson.databind.JsonNode;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Properties;

public class Constant {
    public static String ENVIRONMENT;
    public static EnvironmentSpecificConfiguration DATA_FILE_CONF;
    public static Properties DATA_FILE_PROPERTIES;
    public static JdbcTemplate JDBC_TEMPLATE;
    public static JsonNode DATA_FILE_DATABASE_YML;

}
