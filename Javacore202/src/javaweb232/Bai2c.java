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
public class Bai2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Nhap mang : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            
        }
        System.out.println("Cac phan tu chia het cho 3 la :");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 ==0)
                System.out.print(+arr[i]+" "); 
              
        }
        
        
        
        
    }
}
