/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class StudentManager {

    private DBConnector dbconn = new DBConnector();

    public StudentManager() {
    }

    public Students login(String email, String pass) throws Exception {

        Connection conn = dbconn.getConnect();
        String sql = "SELECT * FROM students"
                + " where email = ? and pass = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);

        ResultSet rs = pstmt.executeQuery();
        Students s = null;
        if(rs.next()){
            s = new Students(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getString("pass"));
        }
         return s;
    }
    
    public int saveAnswer(Students s, Questions q, String answer) throws Exception{
        String sql = "update student_question SET student_id = ?, question_id = ?, correct = ? ";
                
        Connection conn = dbconn.getConnect();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        
        return pstmt.executeUpdate();
    }
    

}
