/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class BaiTapL1 {
   
    private void Vehinh(int a,int b){
        int i,j;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
               if( i == 0 || i == a-1 || j == 0 || j == b-1)
                    System.out.print("*");
               else 
                    System.out.print(" ");
            }
        System.out.print("\n");
        }
        
    }
    
        
    public static void main(String[] args) {
       int x,y;
       BaiTapL1 vh = new BaiTapL1();
       Scanner sc = new Scanner(System.in);
       x = sc.nextInt();
       y = sc.nextInt();
       vh.Vehinh(x, y);
  
    }
        
}
