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
public class Bai4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao h :");
        int h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= h-i; k++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                if(i == 1 || i == h )
                    System.out.print("*");
                else{
                    if(j == 1 || j == 2*i-1)
                        System.out.print("*");
                    else    
                        System.out.print(" ");
                
                }
                    
            }
            System.out.println("");
        }
    }
} 
