/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Point {
    private int hoanhDo;
    private int tungDo;
    public Point(){
    }
    public Point(int hoanhDo,int tungDo){
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public int getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public int getTungDo() {
        return tungDo;
    }

    public void setTungDo(int tungDo) {
        this.tungDo = tungDo;
    }
    
    public void print(){
        System.out.println(hoanhDo+" , "+tungDo);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm :");
        hoanhDo = sc.nextInt();
        tungDo = sc.nextInt();
    }
    
}
