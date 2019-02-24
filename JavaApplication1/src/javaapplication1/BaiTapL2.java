/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
 

import java.lang.String;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTapL2 {
    static void nhap(){
        int []a,b;
        int m,n,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang a[]:");
        m = sc.nextInt();
        System.out.println("Nhap so phan tu mang b[]:");
        n = sc.nextInt();
        a = new int[m+n];
        b = new int[n];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap cac phan tu mang a[]:");
            a[i] = sc.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap cac phan tu mang b[]:");
            b[i] = sc.nextInt();
        }
        System.out.println("Nhap vi tri can chen:");
        k = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print( a[i] + " ");
        }
        
        chen(a,b,k,m);        
        
    }
     static void chen(int[]a,int b[],int k ,int m){
         if(k>=m)
             for (int i = 0; i < b.length; i++) {
                 a[i+m] = b[i]
                 ;
             }
         else if(k <=0)
             for (int i = a.length - 1; i < b.length; i++) {
                 int j = b[i];
                 
             }
         
         
         display(a,b);
     
     
     
     
     
     
     
     
     
     }       
    static void display(int a[],int b[]){
        
    }
    
    public static void main(String[] args) {
        nhap();
       
    }
        
        
    
   
}
            