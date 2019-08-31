/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.demo.DB.DBConnector;
import com.demo.dto.products;
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
public class ProductManager {
    
    private DBConnector dbconn = new DBConnector();
    
    public List<products> getProducts() throws ClassNotFoundException, SQLException{
        Connection conn = dbconn.getConnect();
        String sql = "SELECT * FROM products";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<products> list = new ArrayList<>(); 
        while(rs.next()){
            products prod = new products(rs.getInt("id"),rs.getString("name"),rs.getString("desciption"),rs.getString("images") ,rs.getInt("author_id"),rs.getInt("actived"),rs.getDate("created_at"),rs.getDate("updated_at"));
            list.add(prod);
        }
    return list;
    }
    
    public products getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM products WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        products prod = null;
        while (rs.next()) {
            prod = new products();
            prod.setId(rs.getInt("id"));
            prod.setName(rs.getString("name"));
            prod.setDescription(rs.getString("description"));
            prod.setImages(rs.getString("images"));
            prod.setAuthor_id(rs.getInt("author_id"));
            prod.setActived(rs.getInt("actived"));
            prod.setCreated_at(rs.getDate("created_at"));
            prod.setUpdated_at(rs.getDate("updated_at"));
        }
        return prod;
    }
    
}
