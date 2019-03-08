/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Triangle oop = new Triangle();
        oop.input();
        oop.checkTriangle();
        System.out.println("Chu vi tam giác là : "+oop.perimeter());
        System.out.println("Diện tích tam giác là : "+oop.acreage());
        
    }
}
