package com.ryan.jdbc_test;

import com.ryan.jdbc_test.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Ryan Yuan
 * 2025-05-17 13:43
 **/
public class TestTransaction {

    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCUtil.getConnection("jdbc_test/jdbc.properties");
        PreparedStatement smt = null;
        try {
            // 1.开启事务
            conn.setAutoCommit(false);
            String sql = "UPDATE users SET age=? WHERE name=?";
            smt = conn.prepareStatement(sql);
            smt.setInt(1, 55);
            smt.setString(2, "Greg");
            smt.execute();
            // 2.提交事务
            conn.commit();
        } catch (SQLException e) {
            System.out.println("error");
            // 3.回滚事务
            conn.rollback();
        }
        assert smt != null;
        smt.close();
        conn.close();
    }

}
