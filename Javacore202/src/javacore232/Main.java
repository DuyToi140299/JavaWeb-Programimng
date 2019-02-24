/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore232;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        System.out.print("Nhap mang : ");
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        check_array(arr);
        
        
        
    }

    static void check_array(int a[]){
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = 0; j <i; j++) {
                if(a[i] == a[j]){
                    count++;
                }
            
            }
            System.out.println(a[i]+":"+count );
        }
    }
    
    
    
    
}