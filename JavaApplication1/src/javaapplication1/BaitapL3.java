/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaitapL3 {
    
    public void nhapmang(int []arr){
        int i;
        Scanner sc1 = new Scanner(System.in);
        for (i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc1.nextInt();
        }
    
    
    }
    public int dem(int []a){
        int count =1;
        int i;
        for(i=0;i<a.length;i++){
            for(int j =1;j<a.length;j++){
                if(a[i] == a[j])
                    count++;
        
            }
        
        }
    return count;
    }        
    
    public static void main(String[] args) {
          int n;
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
          int []a = new int [n];
          BaitapL3 oj = new BaitapL3();
          oj.nhapmang(a);
          for(int i =0;i<n;i++){
              System.out.println("Phan tu a["+i+"] xuat hien :"+oj.dem(a)+"lan");
          
          }
              
          
          
    }
    
    
    
    
    
    
}
