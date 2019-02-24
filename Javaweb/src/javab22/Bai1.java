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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen n :");
        n = sc.nextInt();
        int chuc = n/10;
        int donvi = n%10;
        if(n < 10 || n >99)
            System.out.println("So khong hop le");
        else{
            switch(chuc){
                case 1:System.out.print("Muoi");break;
                case 2:System.out.print("Hai muoi");break;
                case 3:System.out.print("Ba muoi" );break;
                case 4:System.out.print("Bon muoi");break;
                case 5:System.out.print("Nam muoi");break;
                case 6:System.out.print("Sau muoi");break;
                case 7:System.out.print("Bay muoi");break;
                case 8:System.out.print("Tam muoi");break;
                case 9:System.out.print("Chin muoi");break;
       
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
