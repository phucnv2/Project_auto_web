package com.autoTest.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.SneakyThrows;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadData {

    public LoadData() {
        Constant.DATA_FILE_CONF = loadFileConf();
        Constant.ENVIRONMENT = Constant.DATA_FILE_CONF.getProperty("serenity.environment");
        Constant.DATA_FILE_PROPERTIES = loadProperties(Constant.ENVIRONMENT);
        Constant.DATA_FILE_DATABASE_YML = loadFileYML(Constant.ENVIRONMENT);
        Constant.JDBC_TEMPLATE = jdbcTemplate(Constant.DATA_FILE_PROPERTIES);
        Constant.JDBC_TEMPLATE = jdbcTemplate(Constant.DATA_FILE_DATABASE_YML);

    }

    /**
     * load data from file serenity.conf
     *
     * @return
     */
    public EnvironmentSpecificConfiguration loadFileConf() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        return EnvironmentSpecificConfiguration.from(environmentVariables);
    }

    /**
     * get value from file properties: properties.getProperty("database.url");
     *
     * @param evn
     * @return
     */
    @SneakyThrows
    public Properties loadProperties(String evn) {
//        evn : dev, sit, stg
        String filePath = String.format("src/test/resources/data/common/data_%s.properties", evn.toLowerCase());
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        return properties;
    }

    /**
     * load data base
     *
     * @return
     */
    public JdbcTemplate jdbcTemplate(Properties fileProperties) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(fileProperties.getProperty("database.url"));
        dataSource.setUsername(fileProperties.getProperty("database.username"));
        dataSource.setPassword(fileProperties.getProperty("database.password"));
        dataSource.setDriverClassName(fileProperties.getProperty("database.driver"));
        return new JdbcTemplate(dataSource);
    }


    public JdbcTemplate jdbcTemplate(JsonNode fileDataBaseYML) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(fileDataBaseYML.at("/database/url").asText());
        dataSource.setUsername(fileDataBaseYML.at("/datasource/username").asText());
        dataSource.setPassword(fileDataBaseYML.at("/datasource/password").asText());
        dataSource.setDriverClassName(fileDataBaseYML.at("/datasource/driver").asText());
        return new JdbcTemplate(dataSource);
    }

    /**
     * load file database conf with file .yml : rootNode.at("/server/host").asText(), rootNode.at("/server/port").asInt();
     *
     * @return
     */
    @SneakyThrows
    public JsonNode loadFileYML(String env) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        return mapper.readTree(new File("databaseConf.yml")).at(env);
    }
}
