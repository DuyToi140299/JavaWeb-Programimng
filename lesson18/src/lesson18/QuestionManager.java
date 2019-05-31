/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuestionManager {
    
    private StudentManager studm = null;
    private Connection conn;
    private Scanner sc = new Scanner(System.in);
    public QuestionManager() throws Exception {
        this.conn = new DBConnector().getConnect();
        this.studm = new StudentManager();

    }

    public List<Questions> getQuestion() throws Exception {
        //1. Tao cau truy van
        String sql = "Select * from questions";
        //2. Thuc hien cau truy van
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        //2. Duyet ket qua va luu vao list
        List<Questions> list = new ArrayList();
        while (rs.next()) {
            Questions q = new Questions();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswera(rs.getString("answer_a"));
            q.setAnswerb(rs.getString("answer_b"));
            q.setAnswerc(rs.getString("answer_c"));
            q.setAnswerd(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);

        }
        return list;
    }

    public void doHomeWork(Students s) throws Exception {
        
        List<Questions> questions = this.getQuestion();
        int corr = 0;
        int index = 1;
        for (Questions q : questions) {
            System.out.printf("Question %d/%d \n", index++, questions.size());
            System.out.println(q);
            System.out.print("Your answer > ");
            String answer = sc.nextLine();
            studm.saveAnswer(s, q, answer);
            if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                corr++;
            }
        }
        System.out.println("Congratulation!");
        System.out.printf("Your result: %d/%d \n", corr, questions.size());
        
    }

}
