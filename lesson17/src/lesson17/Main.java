/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        DBManager mng = new DBManager();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Update");
            System.out.println("2. Select table");
            System.out.println("3. Tìm đọc giả mượn sách ? vào ngày ?");
            System.out.println("4. Tất cả đọc giả mượn sách ngày ?");
            System.out.println("5. Hiển thị danh sách không ai mượn sách");
            System.out.println("6. Đọc giả tên ? mượn bao nhiêu lần");
            System.out.println("7. Danh sách đọc giả chưa giả sách");
            System.out.println("8.exit");
            System.out.println("Mời bạn chọn :");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    mng.upDate();
                    break;
                case 2: {
                    try {
                        mng.Select();
                        break;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                case 3:
                    System.out.print("Nhap ten sach: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
                    String date = sc.nextLine();

                    ResultSet rs = null;
                    try {
                        rs = mng.ex6(name, date);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                    }
                break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
            }
            
        } while (choose != 8);

    }

}
