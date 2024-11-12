package com.autoTest.config;

import com.autoTest.common.Constant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConnectDatabase {
    private static JdbcTemplate jdbcTemplate = null;

    public ConnectDatabase() {
        jdbcTemplate = jdbcTemplate();
    }

    public JdbcTemplate jdbcTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(Constant.DATA_FILE_PROPERTIES.getProperty("database.url"));
        dataSource.setUsername(Constant.DATA_FILE_PROPERTIES.getProperty("database.username"));
        dataSource.setPassword(Constant.DATA_FILE_PROPERTIES.getProperty("database.password"));
        dataSource.setDriverClassName(Constant.DATA_FILE_PROPERTIES.getProperty("database.driver"));
        return new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
