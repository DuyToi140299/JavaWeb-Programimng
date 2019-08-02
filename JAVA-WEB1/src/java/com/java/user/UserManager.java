/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.user;

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
public class UserManager {

    private DBConnector dbconn;

    public UserManager() {
        this.dbconn = new DBConnector();
    }

    public List<User> getUser() throws ClassNotFoundException, SQLException {
        Connection conn = dbconn.getConnect();
        String sql = "Select * form sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<User> list = new ArrayList<>();
        while (rs.next()) {
            User s = new User();
            s.setId(rs.getInt("#"));
            s.setHoten(rs.getString("hoten"));
            s.setLop(rs.getString("lop"));
            s.setKhoa(rs.getString("khoa"));
            list.add(s);
        }
        return list;
    }

    public int insertUser(User user) throws ClassNotFoundException, SQLException {
        Connection conn = dbconn.getConnect();
        String sql = "Insert into sinhvien('id','hoten','khoa','lop') value(?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, user.getId());
        pstmt.setString(2, user.getHoten());
        pstmt.setString(2, user.getKhoa());
        pstmt.setString(2, user.getLop());
        return pstmt.executeUpdate();

    }

    public int updateUser(User user) throws ClassNotFoundException, SQLException {
        Connection conn = dbconn.getConnect();
        String sql = "Update sinhvien SET hoten =? , khoa =?, lop =? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getHoten());
        pstmt.setString(2, user.getKhoa());
        pstmt.setString(3, user.getLop());
        pstmt.setInt(4, user.getId());
        return pstmt.executeUpdate();
    }

    public int deleteUser(int id) throws ClassNotFoundException, SQLException {
        Connection conn = dbconn.getConnect();
        String sql = "DELETE from sinhvien where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }

    public User getUserByID(int id) throws SQLException, ClassNotFoundException {
        Connection conn = dbconn.getConnect();
        String sql = "select * from sinhvien where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        User user = new User();
        while (rs.next()) {
            user.setId(rs.getInt("#"));
            user.setHoten(rs.getString("hoten"));
            user.setKhoa(rs.getString("khoa"));
            user.setLop(rs.getString("lop"));
        }

        return user;
    }

}
