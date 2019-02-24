/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += (float)1/(i*(i+1));
            
        }
        System.out.println("Tổng = " + decimalFormat.format(sum));
    }
    
}
