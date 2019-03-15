/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matrix {

    private int row;
    private int col;
    private int matrix[][];

    public Matrix() {
    }

    public Matrix(int row, int col, int[][] matrix) {
        this.row = row;
        this.col = col;
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void inputM(Matrix X) {
        Scanner sc = new Scanner(System.in);
        row= sc.nextInt();
        col = sc.nextInt();
        int matrix[][] = new int [row][col];
        
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
    }    

    public void print(Matrix X) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }

    }

    public boolean checkValidAddMatrix(Matrix A, Matrix B) {
        if (A.row == B.row && A.col == B.col) {
            return true;
        }

        return false;
    }

    public Matrix addMatrix(Matrix A, Matrix B) {
        Matrix C = new Matrix();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                C.matrix[i][j] = A.matrix[i][i] + B.matrix[i][j];

            }

        }
        return C;
    }

    public boolean checkValidMulMatrix(Matrix A, Matrix B) {
        if (A.row == B.col) {
            return true;
        }
        return false;
    }

    public Matrix mulMatrix(Matrix A, Matrix B) {
        Matrix C = new Matrix();
        for (int i = 0; i < A.row; i++) {
            for (int j = 0; j < B.col; j++) {
                for (int k = 0; k < A.col; k++) {
                    C.matrix[i][j] += A.matrix[i][k] * B.matrix[k][j];

                }

            }

        }
        return C;
    }

}
