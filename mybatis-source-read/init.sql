-- MySQL 建表语句
CREATE DATABASE IF NOT EXISTS mybatis_test;
USE mybatis_test;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       username VARCHAR(50) NOT NULL COMMENT '用户名',
                       password VARCHAR(50) NOT NULL COMMENT '密码',
                       create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                       update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
);

-- 插入测试数据
INSERT INTO users (username, password) VALUES ('admin', '123456'), ('test', 'test123'), ('demo', 'demo123');