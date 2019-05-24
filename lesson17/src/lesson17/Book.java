/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson17;

/**
 *
 * @author Admin
 */
public class Book {
    private String masach;
    private String ten;
    private String tacgia;
    private String nxb;
    private int soluong;

    public Book() {
    }

    public Book(String masach, String ten, String tacgia, String nxb, int soluong) {
        this.masach = masach;
        this.ten = ten;
        this.tacgia = tacgia;
        this.nxb = nxb;
        this.soluong = soluong;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
