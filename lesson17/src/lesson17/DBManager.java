/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DBManager {

    private DBConnector dbConn = new DBConnector();

    public void upDate() {
        try {
            Book b = new Book("B0011", "Ascembly", "Jones's Wakie", "2020", 400);
            Connection conn = dbConn.getConnection();
            String sql = "INSERT INTO SACH(masach,ten,tacgia,nxb,soluong)"
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, b.getMasach());
            pstmt.setString(2, b.getTen());
            pstmt.setString(3, b.getTacgia());
            pstmt.setString(4, b.getNxb());
            pstmt.setInt(5, b.getSoluong());
            int rowUpdates = pstmt.executeUpdate();
            System.out.println("Đã update: " + rowUpdates);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void Select() throws Exception {
        Connection conn = dbConn.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM SACH";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString("masach") + " , " + rs.getString("ten") + " , "
                    + "tacgia" + " , " + rs.getString("nxb") + " , " + rs.getInt("soluong"));

        }

    }

    public ResultSet ex6(String tenSach, String ngayMuon) throws Exception {
        Connection conn = dbConn.getConnection();
        String sql = "select d.ten from PHIEUMUON p "
                + "join SACH s on s.masach = p.masach "
                + "join DOCGIA d on d.sothe = p.sothe "
                + "where s.ten = ? and p.ngaymuon = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, tenSach);
        pstmt.setString(2, ngayMuon);

        return pstmt.executeQuery();
    }

    public ResultSet ex7(String ngaymuon) throws Exception {
        Connection conn = dbConn.getConnection();
        String sql = "select d.sothe, d.ten, s.ten from PHIEUMUON p "
                + "join SACH s on s.masach = p.masach "
                + "join DOCGIA d on d.sothe = p.sothe "
                + "where p.ngaymuon between ? and ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, ngaymuon);
        pstmt.setString(2, ngaymuon);

        return pstmt.executeQuery();
    }

    public ResultSet ex8() throws Exception {
        Connection conn = dbConn.getConnection();
        String sql = "select s.* from SACH s"
                +    "where s.masach not in (select masach from PHIEUMUON)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        return pstmt.executeQuery();
    }

    public ResultSet ex9(String ten) throws Exception {
        Connection conn = dbConn.getConnection();
        String sql = "select count(*) as 'soluong' from PHIEUMUON p" +
                     "join DOCGIA d on d.sothe = p.sothe" +
                     "where d.ten = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, ten);
        
        return pstmt.executeQuery();
    }
    
    public ResultSet ex10() throws Exception {
        Connection conn = dbConn.getConnection();
        String sql = "select d.* from PHIEUMUON p" +
                     "join DOCGIA d on d.sothe = p.sothe" +
                     "where p.ngaytra is null" ;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        return pstmt.executeQuery();
    }
    
    
    

}
