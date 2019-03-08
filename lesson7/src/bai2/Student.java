/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    Scanner sc = new Scanner(System.in);
    private String maSV;
    private double avg;
    private int tuoi;
    private String lop;
    
    public Student(){
    }
    public Student(String maSV, double avg,int tuoi,String lop){
        this.maSV = maSV;
        this.avg = avg;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void inputInfo(){
        System.out.print("Nhap ma SV :");
        maSV = sc.nextLine();
        System.out.print("Nhap diem trung binh :");
        avg = sc.nextDouble();
        System.out.print("Nhap tuoi :");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap lop :");
        lop = sc.nextLine();
       
        
    }
     public void showInfo(){
        System.out.println("Ma sinh vien :" +maSV);
        System.out.println("Diem trung binh : "+ avg);
        System.out.println("Tuoi :"+tuoi);
        System.out.println("Lop :"+lop);
    }
    public boolean checkHB(double avg){
        if(avg > 8.0)
            return true;
    return false;
    }
    
    
}
