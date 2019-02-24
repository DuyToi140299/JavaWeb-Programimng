/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb232;

/**
 *
 * @author Admin
 */
public class Matrix {
    private int col;
    private int row;
    private int [][] value;
    
    public Matrix(){
        this.col = 3;
        this.row = 3;
        this.value = new int[3][3];
    
    }
    public Matrix(int col,int row,int [][]value){
        this.col = col;
        this.row = row;
        this.value = value;
    
    }
    public void print(){
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.println(this.value[i][j] + " ");
                    
                }
                
            }
            System.out.println("");
        }
    
    
    
    }
    
}
