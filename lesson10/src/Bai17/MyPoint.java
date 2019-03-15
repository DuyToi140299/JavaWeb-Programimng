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
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint(){
    }
    public MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    public double distance(int x,int y){
        double dis = Math.sqrt(Math.pow(this.x-x,2 )+Math.pow(this.y-y, 2));
        return dis;
    }
    
    public double distance(MyPoint point1){
        double dis = Math.sqrt(Math.pow(this.x - point1.x, 2)+Math.pow(this.y-point1.y, 2));
        return dis;
    }
    
    
}
