/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {

    private String name;
    private String email;
    private int age;
    public Scanner sc = new Scanner(System.in);
    public Student(){
    }
    public Student(String name,String emai, int age){
         this.name  = name;
         this.email = email;
         this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", age=" + age + '}';
    }
    
    
    
    
    
    
}
