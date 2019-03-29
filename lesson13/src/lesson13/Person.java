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
public class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id :");
        this.id = sc.nextLine();
        System.out.println("Nhap ten:");
        this.name = sc.nextLine();
    
    
    }
    
}
