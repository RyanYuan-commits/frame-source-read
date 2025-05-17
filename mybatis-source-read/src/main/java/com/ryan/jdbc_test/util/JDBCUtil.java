package com.ryan.jdbc_test.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Ryan Yuan
 * 2025-05-17 13:41
 **/
public class JDBCUtil {

    public static Connection getConnection(String resource) {
        Connection conn;
        try {
            Properties properties = new Properties();
            try (InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource)) {
                properties.load(resourceAsStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

}
