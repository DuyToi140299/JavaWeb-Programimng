/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

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
public class NewsModel {
    
    private DBConnector dbconn;

    public NewsModel() {
        dbconn = new DBConnector();
    }
    
    
    
    public List<News> getNews(int limit,int offset) throws ClassNotFoundException, SQLException{
        java.sql.Connection conn =  dbconn.getConnect();
        String query = "SELECR * FROM news LIMIT ? OFFSET ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, limit);
        pstmt.setInt(2, offset);
        ResultSet rs = pstmt.executeQuery();
        
        List<News> list = new ArrayList<>();
        while(rs.next()){
            News n = new News();
            n.setId(rs.getInt("id"));
            n.setTitle(rs.getString("title"));
            n.setImage(rs.getString("image"));
            n.setSummary(rs.getString("summary"));
            n.setContent(rs.getString("content"));
            n.setCreate_at(rs.getString("create_at"));
            n.setAuthor_id(rs.getInt("author_id"));
            list.add(n);
        }
        return list;
    }
    
    public int countNews() throws Exception, ClassNotFoundException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM news");
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    
}
