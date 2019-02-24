/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javab22;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao h = ");
        int h;
        h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= h-i; k++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    
}
