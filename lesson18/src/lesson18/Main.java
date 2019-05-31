/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            StudentManager studm = new StudentManager();
            QuestionManager manager = new QuestionManager();
            System.out.println("-----QUIZ ONLINE-----");
            System.out.print("Enter email : ");
            String email = sc.nextLine();
            System.out.print("Enter pass : ");
            String pass = sc.nextLine();
            Students s = studm.login(email, pass);
            if (s != null) {

                System.out.println("LOGIN SUCCESS ! PRESS ANY KEY TO START QUIZ");
                sc.nextLine();
                manager.doHomeWork(s);
                System.out.println("See Detail (Y/N)");
                System.out.println("DO YOU HAVE COMPLETED THE TEST");
                System.out.print("DO YOU WANT TO DO IT AGAIN (Y/N) :");
                String choose = sc.nextLine();
                if (choose.equals("Y")) {
                    manager.doHomeWork(s);
                }
                if (choose.equals("N")) {
                    System.out.println("THANK YOU !");
                }

            } else {
                System.out.println("LOGIN FAIL !");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
