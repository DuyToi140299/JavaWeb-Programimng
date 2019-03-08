/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Fraction oop  = new Fraction();
        oop.input();
        oop.reduce();
        System.out.print("Phân số sau khi rút gọn là :");
        oop.print();
        System.out.print("Phân số sau khi nghịch đảo là : ");
        oop.inverse();
        oop.print();
        
        
//   
//        Fraction b = new Fraction(12, 16);
//        b.print();
//        Fraction reduce = b.reduce();
//        b.print();
//        reduce.print();
        
    }
}
