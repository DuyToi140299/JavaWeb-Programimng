/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

/**
 *
 * @author Admin
 */
public class HinhVuong extends HinhChuNhat {
    private double a;

    public HinhVuong() {
        
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void input() {
        System.out.println("Nhap canh ");
        a = sc.nextDouble();
        
    }

    @Override
    public double dienTich() {
        return a*a;
    }

    @Override
    public double chuVi() {
        return a*4;
    }
    
    
}
