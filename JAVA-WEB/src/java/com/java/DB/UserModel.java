/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class UserModel {

    DBConnector dbconn = new DBConnector();
   
    public void Insert(User user) throws Exception {
        Connection conn = dbconn.getConnect();
        String sql = "INSERT INTO user(username,password,fullname,email,address) values(?,?,?,?,?) ";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getFullname());
        pstmt.setString(4, user.getEmail());
        pstmt.setString(5, user.getAddress());

    }

    public User login(String Username, String Password) throws Exception {
        Connection conn = dbconn.getConnect();
        String sql = "SELECT * form user where username = ? and password = ? ";
        java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, Username);
        pstmt.setString(2, Password);
        ResultSet rs = pstmt.executeQuery();
        User u = null;
        if(rs.next()){
            u = new User(rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getString("fullname"),rs.getString("address"));
        }
        return u;
    }
}
