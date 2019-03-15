/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix A = new Matrix();
        Matrix B = new Matrix();
        Matrix X = new Matrix();
        System.out.println("Nhập ma trận A: ");
        X.inputM(A);
        System.out.println("Nhập ma trận B: ");
        X.inputM(B);
        System.out.println("Ma trận A :");
        X.print(A);
        System.out.println("Ma trận B :");
        X.print(B);
        if (X.checkValidAddMatrix(A, B)) {
            X.addMatrix(A, B);
            
        }
        if (X.checkValidMulMatrix(A, B)) {
            X.mulMatrix(A, B);
           
        }
    }

}
