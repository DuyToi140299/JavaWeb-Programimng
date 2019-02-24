/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb232;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Bai4c {
     public static void main(String[] args) {
        Random rd = new Random();
        int arr[] = new int[15];
        for (int i = 0; i < 15; i++) {    
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
         System.out.println("");
        int count =0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]%2 == 0)
                 count++;
             
         }
         System.out.println("Mang co "+count +" so chan");
        
        
     }
}
