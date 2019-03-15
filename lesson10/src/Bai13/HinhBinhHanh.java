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
public class HinhBinhHanh extends Shape{
    private double weigth;
    private double heigth;
    private double tall;
    Scanner sc = new Scanner(System.in);

    public HinhBinhHanh() {
    }

    public HinhBinhHanh(double weigth, double heigth, double tall) {
        this.weigth = weigth;
        this.heigth = heigth;
        this.tall = tall;
    }
    
    
    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
    
    public void input(){
        
        System.out.println("Nhap chieu dai");
        heigth = sc.nextDouble();
        System.out.println("Nhap chieu rong");
        weigth = sc.nextDouble();
        System.out.println("Nhap chieu cao");
        tall = sc.nextDouble();
    }

    @Override
    public double dienTich() {
        return heigth*tall;
    }

    @Override
    public double chuVi() {
        return 2*(weigth+heigth); 
    }
    
    
    
    
}
