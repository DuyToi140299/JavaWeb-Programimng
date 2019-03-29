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
public class Employee extends Person{
    private double salary;

    public Employee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.println("Nhap luong:");
        this.salary = sc.nextDouble();
        sc.nextLine();
    }
    
    
    
}
