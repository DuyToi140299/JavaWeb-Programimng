/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SoNguyenTo oop = new SoNguyenTo();
        oop.setA(8);
        if(oop.isSoNguyenTo(oop.getA()))
            System.out.println(oop.getA()+" la so nguyen to");
        else
            System.out.println(oop.getA()+ " khong la so nguyen to");
        System.out.println("So nguyen to tiep theo la : "+oop.timSoNguyenToTiepTheo());
        
    }
}
