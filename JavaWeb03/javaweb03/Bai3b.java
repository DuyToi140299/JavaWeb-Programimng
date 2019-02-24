/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3b;

import Bai3a.Bai3a;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3b {
    boolean kt_nguyento(int n){
         if( n< 2) return false;
         else{
             for (int i = 2; i <= sqrt(n); i++) 
                 if(n % i ==0) return false;
             return true;
                 
         }
    
    
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Nhap n = ");
       n = sc.nextInt();
       Bai3b oop = new Bai3b();
       int count = 0,i = 2;
       while(count < n){
           if(oop.kt_nguyento(i) == true){
               System.out.print(i+" ");
               count++;
           }
           i++;
       }
       
    }
    
    
}
