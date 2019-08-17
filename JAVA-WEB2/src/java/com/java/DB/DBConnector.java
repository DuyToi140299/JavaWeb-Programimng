/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.jms.Connection;

/**
 *
 * @author Admin
 */
public class DBConnector {

    public java.sql.Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String str = "jdbc:mysql://localhost:3306/qlysinhvien";
        java.sql.Connection conn = DriverManager.getConnection(str, "root", "hoicaidmm34");
        return conn;
    }

   

}
