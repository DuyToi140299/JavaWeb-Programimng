/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai17;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private MyPoint p1;
    private int radius;
    
    public MyCircle(MyPoint p,int radius){
        p1 = p;
        this.radius = radius;
    }
    public MyCircle(int x , int y,int radius){
        this.radius = radius;
        
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString(){
        return "Hinh tron @("+p1.getX()+","+p1.getY()+") ban kinh r ="+this.radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    
    
    
}
