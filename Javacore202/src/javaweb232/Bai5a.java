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
public class Bai5a {
    static void input(int n[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
    
    
    }
    static void output(int n[]){
        
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]+ " ");
        }
    
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        System.out.print("Nhap toa do vecto A :");
        input(a);
        System.out.print("Nhap toa do vecto B :");
        input(b);
        
        
    }
    
}
