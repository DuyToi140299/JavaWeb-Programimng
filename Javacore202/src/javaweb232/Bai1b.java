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
public class Bai1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int s =0;
        System.out.println("Nhap mang : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                s+= arr[i];
            
        }
        System.out.println("s = "+s);
    }
    
}
