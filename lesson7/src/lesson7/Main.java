/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.inputInfo();
        System.out.println("====================");
        nv.printInfo();
        System.out.println("Tien thuong cua nhan vien la :" +nv.tinhThuong(nv.getThuong()));
    }
}
