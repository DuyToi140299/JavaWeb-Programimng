/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        MyDate d = new MyDate(3,1,2019);
       // d.input();
        if(d.checkValid()){
            System.out.println("Hợp lệ !");
            d.addDay(44);
            d.print();
        }
        else
            System.out.print("Ngày/Tháng/Năm không hợp lệ !");
      
        
        
    }
    
    
    
}
