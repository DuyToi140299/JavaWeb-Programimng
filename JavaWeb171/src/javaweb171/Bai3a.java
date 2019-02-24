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
public class Bai3a {
    static boolean kt_nguyento(int a){
        for (int i = 2; i < a; i++) 
            if(a % i == 0 || a ==1)
            return false;
        
    return true;
    }
    public static void main(String[] args) {
        int a;
        Scanner oop = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = oop.nextInt();
        Bai3a nt = new Bai3a();
        if(nt.kt_nguyento(a) == false ){
            System.out.println(a+" khong la so nguyen to");
        }
        else
            System.out.println(a+" la so nguyen to");
        
        
       
    }
    
    
    
}
