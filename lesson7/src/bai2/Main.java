/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.inputInfo();
        System.out.println("================");
        st.showInfo();
        if(st.checkHB(st.getAvg()))
            System.out.println("Được nhận học bổng !! ");
        else
            System.out.println("Không được học bổng!!");
    }
    
}
