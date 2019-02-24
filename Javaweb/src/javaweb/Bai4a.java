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
public class Bai4a {
    public static void main(String[] args) {
        int n,max = 0;
        Scanner sc = new Scanner(System.in);
        do{
            n = sc.nextInt();
            if(n >= max && n != 0)
                max = n;
            
        }while(n != 0);
        System.out.print("max = "+max);
    }
    
    
}
