/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnector {
    
    public Connection getConnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String str = "jdbc:mysql://localhost:3306/qlysinhvien";
        Connection conn = DriverManager.getConnection(str, "JavaWeb", "hoicaidmm34");
        return conn;
    }
    
}
