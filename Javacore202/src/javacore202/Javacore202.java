/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore202;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Javacore202 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
   
        }
        int count = 0;
        for (int j = 0; j <= arr.length/2; j++) {
            if(arr[j] == arr[n-1-j]) count++;
            else count --;   
                
        }
        if(count > 0)System.out.println("Symmetry!!");
        else if(count < 0) System.out.println("Unsymetry!!");
    }
    
}
