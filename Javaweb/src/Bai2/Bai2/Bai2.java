/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2.Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long giaithua = 1;
         System.out.print("Nhap n = ");
         n = sc.nextInt();
         for (int i = 1; i <=n; i++) {
             giaithua *=i;
             
         }
         System.out.println(+ n +"! = "+giaithua);
    }
}
