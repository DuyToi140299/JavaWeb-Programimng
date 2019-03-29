/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private String email;

    public Student(String id, String name , String email) {
        super(id, name);
        this.email = email;
    }

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.println("Nhap email:");
        this.email = sc.nextLine();
        
    }
    
    
    
    
    
}
