/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localdateex;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class LocalDateEx {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Now: " +date);
        System.out.println("Ngay:"+date.getDayOfMonth()+" Thang "+date.getMonth()+" year: "+date.getYear());
    }
    
}
