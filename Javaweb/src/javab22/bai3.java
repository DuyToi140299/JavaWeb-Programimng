/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javab22;

/**
 *
 * @author Admin
 */
public class bai3 {
    public static void main(String[] args) {
        int a = 3000000;
        int b = 500000;
        int c = 200000;
        int d = 100000;
        int dem = 0;
        for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= 15 ; j++) {
                for (int k = 0; k <= 6; k++) {
                    if(d*i + c*j + b*k == a){
                        System.out.println("100000*"+i+"+ 200000*"+j+"+ 500000*"+k+ " = 3000000");
                        dem++;
                    }
                }
                
            }
            
        }
            System.out.println("co "+dem+ " cach doi 3000000 thanh cac menh gia 100000,200000,500000");
        
        
    }
    
}
