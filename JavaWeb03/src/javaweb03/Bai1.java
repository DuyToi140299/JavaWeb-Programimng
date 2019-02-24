/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb03;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 3 so a,b,c :");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        double delta,x1,x2;
        delta = b*b - 4*a*c;
        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem.");
        else if(delta == 0 ){
            System.out.println("Phuong trinh co nghiem kep");
            x1 = x2 = - b/(2*a);
            System.out.println("x1 = x2 = " +x2);
            
        }
        else{
            System.out.println("Phuong trinh co 2 nghiem phan biet :  ");
            x1 = (-b - sqrt(delta))/(2*a);
            x2 = (-b + sqrt(delta))/(2*a);
            System.out.println("x1 = "+x1 +" , x2 = "+x2);
        }
    }
}
