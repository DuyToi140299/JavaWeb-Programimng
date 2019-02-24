/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5a {
    public static void main(String[] args) {
        int n;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            s += i;
            
        }
        System.out.println("S = "+s);
    }
    
}
