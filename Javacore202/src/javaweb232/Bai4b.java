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
public class Bai4b {
    public static void main(String[] args) {
        Random rd = new Random();
        int arr[] = new int[15];
        for (int i = 0; i < 15; i++) {    
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Mang sau khi sap xep la : ");
        for (int i = 0; i <= arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                   
                }
            }       
            System.out.print(+arr[i]+" ");
        }




        
    
    }
}
