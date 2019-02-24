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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen n :");
        n = sc.nextInt();
        int tram = n/100;
        int t = n/10;
        int chuc = t%10;
        int donvi = n%10;
        if(n < 100 || n >999)
            System.out.println("So khong hop le");
        else{
            switch(tram){
                case 1:System.out.print("Mot tram");break;
                case 2:System.out.print("Hai tram");break;
                case 3:System.out.print("Ba tram" );break;
                case 4:System.out.print("Bon tram");break;
                case 5:System.out.print("Nam tram");break;
                case 6:System.out.print("Sau tram");break;
                case 7:System.out.print("Bay tram");break;
                case 8:System.out.print("Tam tram");break;
                case 9:System.out.print("Chin tram");break;
       
            }
            switch(chuc){
                case 1:System.out.print(" muoi");break;
                case 2:System.out.print(" hai muoi");break;
                case 3:System.out.print(" ba muoi" );break;
                case 4:System.out.print(" bon muoi");break;
                case 5:System.out.print(" nam muoi");break;
                case 6:System.out.print(" sau muoi");break;
                case 7:System.out.print(" bay muoi");break;
                case 8:System.out.print(" tam muoi");break;
                case 9:System.out.print(" chin muoi");break;
       
            }
            switch(donvi){
                case 1:System.out.println(" mot");break;
                case 2:System.out.println(" hai");break;
                case 3:System.out.println(" ba");break;
                case 4:System.out.println(" bon");break;
                case 5:System.out.println(" nam");break;
                case 6:System.out.println(" sau");break;
                case 7:System.out.println(" bay");break;
                case 8:System.out.println(" tam");break;
                case 9:System.out.println(" chin");break;
            }
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
          
    }
    
    
}
