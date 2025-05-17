package com.ryan.jdbc_test;

import com.ryan.jdbc_test.util.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author Ryan Yuan
 * 2025-05-17 14:11
 **/
public class TestSql {

    @Test
    public void queryAll() throws SQLException {
        try (Connection conn = JDBCUtil.getConnection("jdbc_test/jdbc.properties")) {
            String sql = "SELECT * FROM users";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                int age = rs.getInt("age");
                Date createTime = rs.getDate("create_time");
                System.out.printf("id: %d, name: %s, age: %d, create_time: %s%n", id, name, age, createTime.toString());
            }
        }
    }

    @Test
    public void update() throws SQLException {
        try (Connection connection = JDBCUtil.getConnection("jdbc_test/jdbc.properties")) {
            String sql = "UPDATE users SET age=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 66);
            preparedStatement.setInt(2, 2);
            int result = preparedStatement.executeUpdate();
            System.out.println("影响行数：" + result);
        }
    }

    @Test
    public void delete() throws SQLException {
        try (Connection conn = JDBCUtil.getConnection("jdbc_test/jdbc.properties")) {
            String sql = "DELETE FROM users WHERE age>?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, 60);
            preparedStatement.executeUpdate();
        }
    }

    @Test
    public  void insert() throws SQLException {
        try (Connection conn = JDBCUtil.getConnection("jdbc_test/jdbc.properties")) {
            String sql = "INSERT INTO users (`name`, `age`) VALUES (?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "Gabriel");
            preparedStatement.setInt(2, 7);
            preparedStatement.executeUpdate();
        }
    }

}
