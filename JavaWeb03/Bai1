/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Javaweb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c;
       double delta,x1,x2;
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a,b,c :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        delta = b*b - 4*a*c;
        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else if(delta == 0 ){
            x1 = x2 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep : x1 = x2 = "+x2);
        
        }
        else{
            x1 = (-b -sqrt(delta))/(2*a);
            x2 = (-b +sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("x1 = "+x1 + ",x2 = "+x2);
        }
            
    }
    
}
