/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Triangle {
    Scanner sc = new Scanner(System.in);
    private double a,b,c;
    public Triangle(){
    
    }
    public void input(){
        System.out.print("Nhập độ dài 3 cạnh : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
    public int checkTriangle(){
        if( a+b > c || b+c > a || c+a > b ){
            if( a ==b || a==c || b==c){
                if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
                    System.out.println("Tam giác vuông cân");
                    return 1;
                }
                else{
                    System.out.println("tam giác cân");
                    return 2;
                }
            }
            else if( a==b &&b ==c){
                System.out.println("Tam giác đều");
                return 3;
            }
            else if (a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a ){
                System.out.println("Tam giác vuông");
                return 4;
            }
            else{
                System.out.println("Tam giác thường");
                return 5; 
            }
        }
       return 0;
    }
    public double perimeter(){
        double chuVi = a+b+c;
        
        return chuVi;
    }
    public double acreage(){
        double p = perimeter()/2;
        double dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        return dienTich;
    }
    
}
