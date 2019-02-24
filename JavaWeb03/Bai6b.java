/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6b {
    public static void main(String[] args) {
        int a,b,r ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a , b :");
        a = sc.nextInt();
        b = sc.nextInt();
        int p = a*b;
        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        
        }
        System.out.println("BCLN cua a,b la :"+p/a);
    }
}
