/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb171;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner op = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n :");
        n = op.nextInt();
        long giaithua = 1;
        for (int i = 1; i <=n; i++) {
            giaithua *= i;
      
        }
        System.out.println(+n +"! = " + giaithua);
    }
    
    
}
