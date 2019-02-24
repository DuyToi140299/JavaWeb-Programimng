/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb171;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3b {
    static boolean kt_nguyento(int a){
        for (int i = 2; i < a; i++) 
            if(a % i == 0 || a ==1)
            return false;
        
    return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n :");
        n = scan.nextInt();
        Bai3b oop = new Bai3b();
        int count =0;
        int i = 2;
        while(count <= n){
           if(oop.kt_nguyento(i)){
               System.out.print(i+ " ");
               count++; 
           }
           i++;
        
        }
        
        
    }
}
