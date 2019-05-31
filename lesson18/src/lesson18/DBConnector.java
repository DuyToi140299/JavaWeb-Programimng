/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DBConnector {
    public Connection getConnect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String constr = "jdbc:mysql://localhost:3306/exercises";
        Connection conn = DriverManager.getConnection(constr, "root", "hoicaidmm34");
        return conn;
    }
}
