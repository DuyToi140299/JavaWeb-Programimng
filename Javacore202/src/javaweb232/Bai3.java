/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb232;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Nhap mang : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap so a :");
        int a = sc.nextInt() ;
        if(check_count(arr,a) !=0 ){
            System.out.println("Phan tu "+a+" xuat hien tai vi tri "+check_count(arr,a));
   
        }
        else
            System.out.println("Phan tu "+a+" khong xuat hien trong mang");
        
    } 
    static int check_count(int arr[],int a){
      
        for (int i = 0; i < arr.length; i++) 
            if(arr[i] == a) 
                return i+1;
        return 0;
    }
}
