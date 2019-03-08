/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
   
   Scanner sc = new Scanner(System.in);
   private String ten;
   private int tuoi;
   private String diaChi;
   private double tienLuong;
   private int gioLam;
   private double thuong;
   public NhanVien(){
     
   }
   public NhanVien(String Ten,int Tuoi,String DiaChi,double TienLuong,int gioam){
       this.ten = ten;
       this.tuoi = tuoi;
       this.diaChi = diaChi;
       this.tienLuong = tienLuong;
       this.gioLam = gioLam;
       this.thuong = thuong;
   }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }
   
   public String getTen(){
       return this.ten;
   }
   public void setTen(String ten){
       this.ten = ten;
   }
    public int getTuoi(){
       return this.tuoi;
   }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getGiolam() {
        return gioLam;
    }

    public void setGiolam(int gioLam) {
        this.gioLam = gioLam;
    }
    public void inputInfo(){
        System.out.print("Nhap ten :");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = sc.nextInt();//45 
        sc.nextLine();
        System.out.print("Nhap dia chi :");
        diaChi = sc.nextLine();
        System.out.print("Nhap tien luong :");
        tienLuong = sc.nextDouble();
        System.out.print("Nhap so gio lam :");
        gioLam = sc.nextInt();
        
    }
    public void printInfo(){
        System.out.println("Ten nhan vien :" +ten);
        System.out.println("Tuoi : "+ tuoi);
        System.out.println("Dia chi :"+diaChi);
        System.out.println("Tien luong :"+tienLuong);
        System.out.println("So gio lam :"+gioLam);
    }
   public double tinhThuong(double thuong){
       if(gioLam >= 200) 
           thuong = this.tienLuong*0.2;
       else if(gioLam < 200 && gioLam >= 100)
           thuong = this.tienLuong*0.1;
       else if (gioLam < 100 )
           thuong = 0;
   
       return thuong;
   }
}
