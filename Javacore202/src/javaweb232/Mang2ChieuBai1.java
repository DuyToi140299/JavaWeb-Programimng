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
public class Mang2ChieuBai1 {
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("---MA TRAN NGAU NHIEN---");
        System.out.println("Nhap Kich thuoc cho MA TRAN");
//        System.out.print("N > ");
//        int n = input.nextInt();
//        System.out.print("M > ");
//        int m = input.nextInt();
//        // Sinh ra ma tran ngau nhien
//        int[][] matrix = new int[n][m];
//        Random rand = new Random();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = rand.nextInt(100);
//            }
//        }

        int n = 4;
        int m = 4;
        int[][] matrix = { 
                            {1,2,3,5,6},
                            {2,1,4,6,7},
                            {3,4,1,7,8},
                            {5,6,7,1,5},
                            {6,7,8,5,9}
                         };
        System.out.println("MA TRAN DUOC SINH RA");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        if (n != m) {
            System.out.println("Ma tran khong doi xung");    
        } else {
            int count = 0;
            boolean flag = true;
//            for (int i = 0; i < n; i++) {
//                if (matrix[i][n-i-1] != matrix[n-i-1][i]) {
//                    flag = false;
//                    break;
//                }
//                count++;
//            }
            int smaller[][] = new int [10][10];
            for (int i = 0; i < n-1; i++) {
                for ( int j = i+1; j < n; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        flag = false;
                        break;
                    }
                    
                    count++;
                   
                }
                
            }
            System.out.println("================");
            System.out.println("count = " + count);
            if (flag) System.out.println("Ma tran doi xung");
            else System.out.println("Ma tran khong doi xung");
        }
        
    }
    
    
    
    
}
