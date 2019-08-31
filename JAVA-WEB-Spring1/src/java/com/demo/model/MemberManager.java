/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.demo.DB.DBConnector;
import com.demo.dto.members;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MemberManager {
    
    private DBConnector dbconn = new DBConnector();
    
    public List<members> getProducts() throws ClassNotFoundException, SQLException{
        Connection conn = dbconn.getConnect();
        String sql = "SELECT * FROM products";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<members> list = new ArrayList<>(); 
        while(rs.next()){
            members mem = new members(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getString("password"),rs.getInt("actived"),rs.getDate("created_at"),rs.getDate("updated_at"));
            list.add(mem);
        }
    return list;
    }
    
    public members getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM products WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        members mem = null;
        while (rs.next()) {
            mem = new members();
            mem.setId(rs.getInt("id"));
            mem.setName(rs.getString("name"));
            mem.setEmail(rs.getString("email"));
            mem.setPassword(rs.getString("password"));
            mem.setActived(rs.getInt("actived"));
            mem.setCreated_at(rs.getDate("created_at"));
            mem.setUpdated_at(rs.getDate("updated_at"));
        }
        return mem;
    }
    
}

