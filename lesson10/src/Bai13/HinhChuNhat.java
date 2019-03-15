/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat extends HinhBinhHanh{
   
    private double heigth;
    private double weigth;

    public HinhChuNhat() {
    }
    
    
    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    
    
    @Override
    public void input() {
        System.out.println("Nhap chieu dai");
        heigth = sc.nextDouble();
        System.out.println("Nhap chieu rong");
        weigth = sc.nextDouble();
    }

    @Override
    public double chuVi() {
        return 2*(heigth+weigth); 
    }

    @Override
    public double dienTich() {
        return weigth*heigth; 
    }
    
    
    
    
    
}
