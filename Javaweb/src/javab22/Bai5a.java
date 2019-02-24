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
public class Bai5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Nhap m va n :");
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
                
    }
}
