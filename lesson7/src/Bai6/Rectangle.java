/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Rectangle {

    Scanner sc = new Scanner(System.in);

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    protected void input() {
        System.out.print("Length = ");
        this.length = sc.nextInt();
        System.out.print("Width = ");
        this.width = sc.nextInt();

    }

    public int perimeter() {
        int chuVi = (this.length + this.width) * 2;
        return chuVi;
    }

    public int acreage() {
        int dienTich = length * width;
        return dienTich;
    }

}
